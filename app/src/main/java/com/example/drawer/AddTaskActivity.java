package com.example.drawer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.core.view.MenuItemCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.example.drawer.Caches.InternalStorage;
import com.example.drawer.Entities.Degree;
import com.example.drawer.Entities.EtatTache;
import com.example.drawer.Entities.Folder;
import com.example.drawer.Entities.Message;
import com.example.drawer.Entities.Projet;
import com.example.drawer.Entities.Reservation;
import com.example.drawer.Entities.Tache;
import com.example.drawer.Entities.TacheDetail;
import com.example.drawer.Entities.User;
import com.google.android.material.navigation.NavigationView;
import com.kinda.alert.KAlertDialog;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.ls.LSInput;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class AddTaskActivity extends AppCompatActivity{

    List<Reservation> listeGlobal = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(false);
            getSupportActionBar().setHomeButtonEnabled(false);
        }

        listeGlobal = initReservation();

        try{
            final EditText folder_of__addtask = findViewById(R.id.nom_reservation);
            final Spinner spinner_etat_addtask = findViewById(R.id.spinner_etat_reservation);
            final EditText spinner_degree_addtask = findViewById(R.id.nom_client);
            final EditText description_of_addtask = findViewById(R.id.fin_reservation);

            TableLayout tableRow = findViewById(R.id.tableLayout_task);
            tableRow.setStretchAllColumns(true);
            removeAllRowTable(tableRow);
            if (getIntent().getStringExtra("message") != null){
                listeGlobal =  (List<Reservation>)InternalStorage.readObject(AddTaskActivity.this, "storage_reservation" );
            }

            List<Reservation> all_reservation = listeGlobal;
            for (int i = 0; i <all_reservation.size(); i++) {
                TableLayout.LayoutParams lp = new TableLayout.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.WRAP_CONTENT);
                lp.setMargins(10,2,10,2);
                tableRow.addView(createTableRow(all_reservation.get(i).getNom(), all_reservation.get(i).getNom_cient(), all_reservation.get(i).getDebut_reservation(), all_reservation.get(i).getFin_reservation(), all_reservation.get(i).getType()), lp);
            }

            TextView btn_save_task = findViewById(R.id.btn_save_task);
            btn_save_task.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String nom_reservation = folder_of__addtask.getText().toString();
                    String etat_reservation = spinner_etat_addtask.getSelectedItem().toString();
                    String nom_client = spinner_degree_addtask.getText().toString();
                    String debut_reservation = description_of_addtask.getText().toString();
                    String fin_reservation = description_of_addtask.getText().toString();
                    if ((nom_reservation.length() == 0 && etat_reservation.length()== 0)|| nom_client.length() == 0 || debut_reservation.length() == 0 || fin_reservation.length() == 0){
                        alert("error","Les champs sont obligatoires");
                    }else {
                        try {
                            saveReservation(nom_reservation, etat_reservation, nom_client, debut_reservation, fin_reservation);
                            Intent intent = new Intent(AddTaskActivity.this, AddTaskActivity.class);
                            try {
                                intent.putExtra("message" , "valider");
                                startActivity(intent);
                                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                                finish();
                            }catch (Exception e){
                                alert("error", e.getMessage());
                            }
                        }catch (Exception e){
                            alert("error", e.getMessage());
                        }

                    }
                }
            });

        }catch (Exception e){
            alert("error",e.getMessage());
        }
    }

    public TableRow createTableRow(String nom, String debut, String fin, String client, String etat){
        TableRow linearLayout = new TableRow(AddTaskActivity.this);
        TableLayout.LayoutParams params = new TableLayout.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.WRAP_CONTENT, 70.0f);
        params.setMargins(10,2,10,2);
        linearLayout.setLayoutParams(params);
        TextView textview_client9 = this.addTextview(nom, true,2);
        TextView textview_client91 =this.addTextview(debut, true, 2);
        TextView textview_client2 = this.addTextview(fin, true,2);
        TextView textview_client3 = this.addTextview(client, true,2);
        TextView textview_client4 = this.addTextview(etat, true, 2);
        linearLayout.addView(textview_client9);
        linearLayout.addView(textview_client91);
        linearLayout.addView(textview_client2);
        linearLayout.addView(textview_client3);
        linearLayout.addView(textview_client4);

        return linearLayout;
    }

    public TextView addTextview (String sujet, boolean bold, int res){
        TextView textview_client9 = new TextView(AddTaskActivity.this);
        TableRow.LayoutParams params59 = new TableRow.LayoutParams(0, ViewGroup.LayoutParams.MATCH_PARENT, res);
        textview_client9.setText(sujet);
        params59.weight = 20.0f;
        Drawable img = getApplicationContext().getResources().getDrawable(R.drawable.ic_mode_edit_green_24dp);
        img.setBounds( 0, 0, 60, 60 );
        textview_client9.setPadding(10,10,10,10);
        textview_client9.setGravity(Gravity.CENTER);
        textview_client9.setClickable(true);
        textview_client9.setTextColor(Color.parseColor("#000000"));
        if (bold) textview_client9.setTypeface(textview_client9.getTypeface(), Typeface.BOLD);
        textview_client9.setLayoutParams(params59);
        return textview_client9;
    }
    public void removeAllRowTable(TableLayout table){
        int childCount = table.getChildCount();
        if (childCount > 1) {
            table.removeViews(1, childCount - 1);
        }
    }
    public void saveReservation(String nom_reservation,String etat_reservation,String nom_client, String debut_reservation,String fin_reservation){
        try {
            Reservation reservation = new Reservation();
            reservation.setType(etat_reservation);
            reservation.setFin_reservation(fin_reservation);
            reservation.setDebut_reservation(debut_reservation);
            reservation.setNom(nom_reservation);
            reservation.setNom_cient(nom_client);
            TableLayout.LayoutParams lp = new TableLayout.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.WRAP_CONTENT);
            lp.setMargins(10,2,10,2);
            TableLayout tableRow = findViewById(R.id.tableLayout_task);
            tableRow.addView(createTableRow(nom_reservation, nom_client, debut_reservation,fin_reservation, etat_reservation), lp);
            listeGlobal.add(reservation);
            InternalStorage.writeObject(this, "storage_reservation", listeGlobal);
        }catch (Exception e){
            alert("error", "Verifier votre information; "+ e.getMessage());
        }

    }
     public List<Reservation> initReservation(){
        List<Reservation> initList = new ArrayList<>();
         Reservation reservation1 = new Reservation();
         reservation1.setNom("Reservation 1");
         reservation1.setNom_cient("Client 1");
         reservation1.setDebut_reservation("Mars");
         reservation1.setFin_reservation("Avril");
         reservation1.setType("VIP");

         Reservation reservation2 = new Reservation();
         reservation2.setNom("Reservation 2");
         reservation2.setNom_cient("Client 2");
         reservation2.setDebut_reservation("Mai");
         reservation2.setFin_reservation("Juin");
         reservation2.setType("VIP");
         initList.add(reservation1);
         initList.add(reservation2);

         return initList;
     }

    public void alert(String type,String message){
        if (type.compareTo("error") == 0){
            new KAlertDialog(this, KAlertDialog.ERROR_TYPE)
                    .setTitleText("Information du tâche")
                    .setContentText(message)
                    .show();
        }
        if (type.compareTo("success") == 0){
            new KAlertDialog(this, KAlertDialog.SUCCESS_TYPE)
                    .setTitleText("Information du tâche")
                    .setContentText(message)
                    .show();
        }

    }
}
