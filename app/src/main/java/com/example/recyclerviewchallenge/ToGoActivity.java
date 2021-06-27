package com.example.recyclerviewchallenge;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class ToGoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        RecyclerView theList = findViewById(R.id.recycler_view_to_go);

        Cards[] places = {
                new Cards("Miami", "Sun & Beaches", R.drawable.miami),
                new Cards("Paris", "Tour Eiffel & Croissants", R.drawable.paris),
                new Cards("Lanzarote", "Siesta & Paela", R.drawable.lanzarote),
                new Cards("New Zealand", "Sheeps & Nature", R.drawable.new_zealand),
                new Cards("Machu Picchu", "Mountains & Lamas", R.drawable.machu_picchu)
        };

        CardsAdapter adapter = new CardsAdapter(places);
        theList.setAdapter(adapter);
    }
}
