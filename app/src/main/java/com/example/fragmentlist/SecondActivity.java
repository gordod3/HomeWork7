package com.example.fragmentlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {
    Intent intent;
    DetailsFragment detailsFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        intent = getIntent();
        FragmentManager manager = getSupportFragmentManager();
        detailsFragment = (DetailsFragment) manager.findFragmentById(R.id.fragmentName);
        detailsFragment.nameField.setText(intent.getStringExtra("name"));

    }
}
