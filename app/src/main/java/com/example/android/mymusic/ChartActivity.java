package com.example.android.mymusic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ChartActivity extends AppCompatActivity {
    public String artist;
    public String track;


    private ArrayList<Track> tracksList = new ArrayList<Track>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.track_list );

        final ArrayList<Track> tracksList = new ArrayList<Track>();
        tracksList.add( new Track( "Justin Bieber and Bloodpop", "FRIENDS" ) );
        tracksList.add( new Track( "George Ezra", "PARADISE" ) );
        tracksList.add( new Track( "Kygo and Selena Gomez", "IT AIN'T ME" ) );
        tracksList.add( new Track( "Logic/Marshmello", "EVERYDAY" ) );
        tracksList.add( new Track( "Jason Derulo", "COLORS" ) );
        tracksList.add( new Track( "The Palm Set", "THESE HIGHER MOUNTAINS" ) );
        tracksList.add( new Track( "Luis Fonsi/Demi Lovato", "ÉCHAME LA CULPA" ) );
        tracksList.add( new Track( "Justin Timberlake", "SAY SOMETHING" ) );
        tracksList.add( new Track( "Calvin Harris", "ONE KISS" ) );
        tracksList.add( new Track( "Katy Perry", "CHAINED TO THE RHYTHM" ) );

        final TrackAdapter adapter = new TrackAdapter( this, tracksList );

        ListView listView = (ListView) findViewById( R.id.list );

        listView.setAdapter( adapter );

        listView.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent( ChartActivity.this, PlayActivity.class );
                intent.putExtra( "artistName", artist );
                intent.putExtra( "songName", track );
                startActivity( intent );
            }
        } );

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}






