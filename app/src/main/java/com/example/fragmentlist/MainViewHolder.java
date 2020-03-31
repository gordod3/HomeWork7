package com.example.fragmentlist;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MainViewHolder extends RecyclerView.ViewHolder {
    TextView textView;
    Clickable clickable;
    String name;
    public MainViewHolder(@NonNull final View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.holder_text_view);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clickable == null){
                    Log.d("lol", "strange");
                }
                clickable.clickOnView(name);
            }
        });
    }
}
