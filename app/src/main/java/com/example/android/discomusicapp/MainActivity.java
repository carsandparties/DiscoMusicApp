package com.example.android.discomusicapp;

        import android.content.Intent;
        import android.net.Uri;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.TextView;

        import butterknife.BindView;
        import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.songs) TextView songs;
    @BindView(R.id.nowPlaying) TextView nowPlaying;
    @BindView(R.id.search) TextView search;
    @BindView(R.id.store) TextView store;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Inject the Views using the ButterKnife library
        ButterKnife.bind(this);

        /**
         * Create an OnClickListener for the songs category.
         */

        // Set a click listener on that View
        if (songs != null) {
            songs.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view){
                    // Create a new intent to open the {@link SongsActivity}
                    Intent songsIntent = new Intent(MainActivity.this, SongsActivity.class);
                    // Start the new activity
                    startActivity(songsIntent);
                }
            });
        }

        /**
         * Create an OnClickListener for the now playing category.
         */

        // Set a click listener on that View
        if (nowPlaying != null) {
            nowPlaying.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the now playing View is clicked on.
                @Override
                public void onClick(View view) {
                    // Create a new intent to open the {@link NowPlayingActivity}
                    Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
                    // Start the new activity
                    startActivity(nowPlayingIntent);
                }
            });
        }

        /**
         * Create an OnClickListener for the search category.
         */

        // String to store the URL for Google search engine
        final String searchUrl = "https://www.google.com";

        // Set a click listener on that View
        if (search != null) {
            search.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the family View is clicked on.
                @Override
                public void onClick(View view) {
                    // Create a new intent to open the {@link SearchIntent}
                    Intent searchIntent = new Intent(Intent.ACTION_VIEW);
                    searchIntent.setData(Uri.parse(searchUrl));
                    startActivity(searchIntent);
                }
            });
        }

        /**
         * Create an OnClickListener for the store category.
         */

        // String to store the URL for the Google Play Music store
        final String url = "https://play.google.com/music/listen";

        // Set a click listener on that View
        if (store != null) {
            store.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the store View is clicked on.
                @Override
                public void onClick(View view) {
                    // Create a new intent to open the {@link StoreIntent}
                    Intent storeIntent = new Intent(Intent.ACTION_VIEW);
                    storeIntent.setData(Uri.parse(url));
                    startActivity(storeIntent);
                }
            });
        }
    }
}