package com.example.founders;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FounderDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_founder_detail);

        ImageView imageView = findViewById(R.id.ivFounderImage);
        TextView tvName = findViewById(R.id.tvFounderName);
        TextView tvDescription = findViewById(R.id.tvFounderDescription);

        Intent intent = getIntent();

        tvName.setText(intent.getStringExtra("name"));
        tvDescription.setText(intent.getStringExtra("description"));
        imageView.setImageResource(intent.getIntExtra("image", 0));
    }
}
