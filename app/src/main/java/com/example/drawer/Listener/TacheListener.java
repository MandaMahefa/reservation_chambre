package com.example.drawer.Listener;
import android.view.View;

import com.example.drawer.TaskDetailActivity;


public class TacheListener implements View.OnClickListener {
    private int tache;
    private TaskDetailActivity taskDetailActivity;

    public TacheListener(int tache, TaskDetailActivity taskDetailActivity) {
        this.tache = tache;
        this.taskDetailActivity = taskDetailActivity;
    }

    @Override
    public void onClick(View view) {


    }



}
