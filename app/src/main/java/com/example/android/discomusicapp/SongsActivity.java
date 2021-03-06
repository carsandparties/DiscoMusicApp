package com.example.android.discomusicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        // Create an list of songs
        ArrayList<Song> songs = new ArrayList<Song>();

        //songs.add("Daddy Cool");
        songs.add(new Song(getString(R.string.song1), getString(R.string.artist1)));
        songs.add(new Song(getString(R.string.song2), getString(R.string.artist2)));
        songs.add(new Song(getString(R.string.song3), getString(R.string.artist3)));
        songs.add(new Song(getString(R.string.song4), getString(R.string.artist4)));
        songs.add(new Song(getString(R.string.song5), getString(R.string.artist5)));
        songs.add(new Song(getString(R.string.song6), getString(R.string.artist6)));
        songs.add(new Song(getString(R.string.song7), getString(R.string.artist7)));
        songs.add(new Song(getString(R.string.song8), getString(R.string.artist8)));
        songs.add(new Song(getString(R.string.song9), getString(R.string.artist9)));
        songs.add(new Song(getString(R.string.song10), getString(R.string.artist10)));
        songs.add(new Song(getString(R.string.song11), getString(R.string.artist11)));
        songs.add(new Song(getString(R.string.song12), getString(R.string.artist12)));
        songs.add(new Song(getString(R.string.song13), getString(R.string.artist13)));
        songs.add(new Song(getString(R.string.song14), getString(R.string.artist14)));
        songs.add(new Song(getString(R.string.song15), getString(R.string.artist15)));

        final SongAdapter songAdapter = new SongAdapter(this, songs);

        // Grab the listView from activity_songs.xml layout file and
        // attach the SongAdapter to it.
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(songAdapter);

        // Set onItemClickListener to send an intent carrying song title
        // and artist name to NowPlayingActivity
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String song = songAdapter.getItem(i).getSongTitle();
                String artist = songAdapter.getItem(i).getArtistName();

                Intent j = new Intent(SongsActivity.this, NowPlayingActivity.class);
                j.putExtra("song", song);
                j.putExtra("artist", artist);

                startActivity(j);

            }
        });
    }
}