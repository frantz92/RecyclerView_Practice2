package com.example.recyclerviewchallenge;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setClickListeners();
    }

    private void setClickListeners() {
        RelativeLayout toGo = findViewById(R.id.relative_layout_to_go);
        RelativeLayout toDo = findViewById(R.id.relative_layout_to_do);

        toGo.setOnClickListener(v -> {

            Intent toGoActivityIntent = new Intent(MainActivity.this, ToGoActivity.class);
            startActivity(toGoActivityIntent);
        });

        toDo.setOnClickListener(v -> {

            Intent toDoActivityIntent = new Intent(MainActivity.this, ToDoActivity.class);
            startActivity(toDoActivityIntent);
        });
    }
}