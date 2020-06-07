package com.example.glidedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.imageView);

        String url = "http://p16-webcast.muscdn.com/img/maliva/maliva-live-admin-node/3b01922298c328f899b36266f67d4646~tplv-obj.png";

        Picasso.with(this)
                .load(url)
                .placeholder(R.drawable.ic_launcher_background)
                .into(imageView);
    }
}
