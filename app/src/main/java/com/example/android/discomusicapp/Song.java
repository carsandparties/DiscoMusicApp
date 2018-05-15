/**
 * Created by elizabethsotomayor on 5/14/18.
 */
package com.example.android.discomusicapp;

/**
 * {@link Song} represents a song object that a user wants to play.
 * It contains both the song title and artist name.
 */
public class Song {
    private String mSongTitle;
    private String mArtistName;

    /**
     * Create a new Song object
     * @param songTitle is the String resource ID for the song
     * @param artistName is the String resource ID for the artist's name
     */
    public Song(String songTitle, String artistName) {
        mSongTitle = songTitle;
        mArtistName = artistName;
    }

    /**
     * Get the artist name
     */
    public String getArtistName() {
        return mArtistName;
    }

    /**
     * Get the song title
     */
    public String getSongTitle() {
        return mSongTitle;
    }
}