package com.example.recyclerviewchallenge;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class ToDoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        RecyclerView theList = findViewById(R.id.recycler_view_to_go);

        Cards[] things = {
                new Cards("Skydiving", "Above the clouds", R.drawable.skydiving),
                new Cards("Build a house", "Calm & Stabilization", R.drawable.house),
                new Cards("Scuba diving", "Among the aquatic", R.drawable.scubadiving),
                new Cards("Get a tattoo", "Rock & Roll", R.drawable.tatoo),
                new Cards("Sleep in a camper", "Chillout & Views", R.drawable.camper)
        };

        CardsAdapter adapter = new CardsAdapter(things);
        theList.setAdapter(adapter);
    }
}
