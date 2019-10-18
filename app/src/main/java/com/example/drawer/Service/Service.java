package com.example.drawer.Service;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.AsyncTask;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.example.drawer.AddUserActivity;
import com.example.drawer.AllUserActivity;
import com.example.drawer.R;
import com.kinda.alert.KAlertDialog;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import org.json.JSONObject;

import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class Service {
    public Service() {
    }
    public void alert(Context context,String title, String message, String type){
        if (type.compareTo("error") == 0 ){
            new KAlertDialog(context, KAlertDialog.ERROR_TYPE)
                    .setTitleText(title)
                    .setContentText(message)
                    .show();
        }
        if (type.compareTo("success") == 0){
            new KAlertDialog(context, KAlertDialog.SUCCESS_TYPE)
                    .setTitleText(title)
                    .setContentText(message)
                    .show();
        }
    }

    public TableRow createTableRow(Context context,String urlImage, String id, String login, String group){
        TableRow linearLayout = new TableRow(context);
        TableLayout.LayoutParams params = new TableLayout.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.WRAP_CONTENT, 70.0f);
        params.setMargins(10,2,10,2);
        linearLayout.setLayoutParams(params);
        ImageView textview_client9 = this.createImageTableRow(context,urlImage,2);
        TextView textview_client91 =this.addTextview(context,id,2, false,"",id);
        TextView textview_client2 = this.addTextview(context,login, 2, false,"",id);
        TextView textview_client21 = this.addTextview(context,group,2, false,"",id);
        TextView textview_client22 = this.addTextview(context,"",1, true, "edit",id);
        TextView textview_client23 = this.addTextview(context,"",1, true, "delete",id);
        linearLayout.addView(textview_client9);
        linearLayout.addView(textview_client91);
        linearLayout.addView(textview_client2);
        linearLayout.addView(textview_client21);
        linearLayout.addView(textview_client22);
        linearLayout.addView(textview_client23);
        return linearLayout;
    }

    public ImageView createImageTableRow(Context context,String urlImage, int res){
        ImageView image_user = new ImageView(context);
        LinearLayout.LayoutParams params_imageuser = new LinearLayout.LayoutParams(0, 80, res);
        params_imageuser.gravity = Gravity.LEFT;
        image_user.setLayoutParams(params_imageuser);
        image_user.setBackgroundResource(R.drawable.image_circle);
        if (urlImage.length() == 0) image_user.setImageResource(R.drawable.ic_person_grey_24dp);
        else loadImageFromUrl(context,urlImage, image_user);
        return image_user;
    }

    public void loadImageFromUrl(Context context,String image, ImageView imageView){
        Picasso.with(context).load(image).placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .into(imageView, new Callback() {
                    @Override
                    public void onSuccess() { }
                    @Override
                    public void onError() { }
                });
    }

    public TextView addTextview (final Context context, String sujet, int res, final boolean action, final String type_action, final String idUser){
        TextView textview_client9 = new TextView(context);
        TableRow.LayoutParams params59 = new TableRow.LayoutParams(0, ViewGroup.LayoutParams.MATCH_PARENT, res);
        textview_client9.setText(sujet);
        params59.weight = 1.0f;
        textview_client9.setPadding(10,10,10,10);
        textview_client9.setGravity(Gravity.CENTER);
        textview_client9.setClickable(true);
        textview_client9.setTextColor(Color.parseColor("#000000"));
        textview_client9.setLayoutParams(params59);
        if (action && type_action.compareTo("edit") == 0) textview_client9.setBackgroundResource(R.drawable.btnedit);
        if (action && type_action.compareTo("delete") == 0) textview_client9.setBackgroundResource(R.drawable.btndelete);
        textview_client9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (action && type_action.compareTo("edit") == 0){
                    Intent i8 = new Intent(context, AddUserActivity.class);
                    i8.putExtra("mode", "edit");
                    i8.putExtra("id_user", idUser);
                    /*startActivity(i8);
                    overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);*/
                }if (action && type_action.compareTo("delete") == 0){
                    confirmDeleteUser(context,Integer.parseInt(idUser));
                }
            }
        });
        return textview_client9;
    }

    public void confirmDeleteUser(final Context context,final int idUser){
        new KAlertDialog( context, KAlertDialog.WARNING_TYPE)
                .setTitleText("Confirmation")
                .setContentText("Êtes-vous sûr(e) de vouloir supprimer cette utilisateur ? ")
                .setCancelText("Annuler")
                .setConfirmText("Confirmer")
                .showCancelButton(true)
                .setCancelClickListener(new KAlertDialog.OnSweetClickListener() {
                    @Override
                    public void onClick(KAlertDialog sDialog) {
                        sDialog.cancel();
                    }
                })
                .setConfirmClickListener(new KAlertDialog.OnSweetClickListener() {
                    @Override
                    public void onClick(KAlertDialog sDialog) {
                        removeOneUser(idUser);
                        sDialog.cancel();
                    }
                })
                .show();
    }

    public void removeOneUser(final int idUser){
        AsyncTask asyncTask = new AsyncTask() {
            @Override
            protected Object doInBackground(Object[] objects) {
                OkHttpClient okHttpClient = new OkHttpClient();
                String url = "http://dev.espai-web.com/api/UPtL2oz56LJpBj03NS0UZR8rkS0X7vwH/dashboard/user/remove/"+idUser;
                Request request = new Request.Builder().url(url).build();
                Response response = null;
                try {
                    response = okHttpClient.newCall(request).execute();
                    return  response.body().string();
                }catch (Exception e){
                    e.printStackTrace();
                }
                return null;
            }

            @Override
            protected void onPostExecute(Object o) {
                try {
                    JSONObject jsonObject = new JSONObject(o.toString());
                    String objet = jsonObject.optString("remove");
                    if (objet.compareTo("success") == 0){
                        /*Intent intent = new Intent(AllUserActivity.this, AllUserActivity.class);
                        intent.putExtra("success", "ok");*/
                        //startActivity(intent);
                    }if (objet.compareTo("error") == 0){
                        //alert("Message de suppression", "Verifier votre connexion, veuillez réessayer.", "error");
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }.execute();
    }
}
