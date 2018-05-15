package com.example.android.discomusicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        Bundle extra = getIntent().getExtras();

        if (extra != null) {
            String song = extra.getString("song");
            String artist = extra.getString("artist");

            TextView titleTextView = (TextView) findViewById(R.id.song_title_action);
            titleTextView.setText(song);

            TextView artistTextView = (TextView) findViewById(R.id.artist_name_action);
            artistTextView.setText(artist);
        }
    }
}