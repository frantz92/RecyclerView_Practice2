package com.example.recyclerviewchallenge;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class CardsAdapter extends RecyclerView.Adapter<CardsAdapter.CardsViewHolder> {

    private Cards[] cards;

    public CardsAdapter(Cards[] cards) {
        this.cards = cards;
    }

    @Override
    public int getItemCount() {
        return cards.length;
    }

    @NonNull
    @Override
    public CardsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        return new CardsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardsViewHolder holder, int position) {
        holder.bind(cards[position]);
    }

    static class CardsViewHolder extends RecyclerView.ViewHolder {

        ImageView cardImage;
        TextView cardTitle;
        TextView cardDescription;

        public CardsViewHolder(@NonNull View itemView) {
            super(itemView);
            cardImage = itemView.findViewById(R.id.image_view_card);
            cardTitle = itemView.findViewById(R.id.text_view_title_card);
            cardDescription = itemView.findViewById(R.id.text_view_description_card);
        }

        public void bind(Cards cards) {
            cardImage.setImageResource(cards.image);
            cardTitle.setText(cards.title);
            cardDescription.setText(cards.description);
        }
    }

}
