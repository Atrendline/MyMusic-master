package com.example.android.mymusic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class DanceActivity extends AppCompatActivity {
    public String artist;
    public String track;


    private ArrayList<Track> tracksList = new ArrayList<Track>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.track_list );

        final ArrayList<Track> tracksList = new ArrayList<Track>();
        tracksList.add( new Track( "DJ Snake and Alunageorge ", "YOU KNOW YOU LIKE" ) );
        tracksList.add( new Track( "Tujamo", "BOOTY BOUNCE" ) );
        tracksList.add( new Track( "Jax Jones", "BREATHE" ) );
        tracksList.add( new Track( "Dimitri Vegas & Like Mike", "OCARINA" ) );
        tracksList.add( new Track( "The Chainsmokers & Coldplay", "SOMETHING JUST LIKE THIS" ) );
        tracksList.add( new Track( "Duke Dumont", "I GOT U (ANI QUINN REMIX)" ) );
        tracksList.add( new Track( "Sigala", "EASY LOVE (CLUB MIX)" ) );
        tracksList.add( new Track( "Zedd", "I WANT YOU TO KNOW" ) );
        tracksList.add( new Track( "Bakermat", "ONE DAY" ) );
        tracksList.add( new Track( "99 Souls", "THE GIRL IS MINE" ) );

        final TrackAdapter adapter = new TrackAdapter( this,  tracksList );

        ListView listView = (ListView) findViewById( R.id.list );

        listView.setAdapter( adapter );

        listView.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent( DanceActivity.this, PlayActivity.class );
                intent.putExtra( "artistName", artist );
                intent.putExtra( "songName", track );
                startActivity( intent );
            }
        } );

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}

