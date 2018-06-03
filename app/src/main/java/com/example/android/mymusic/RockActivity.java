package com.example.android.mymusic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class RockActivity extends AppCompatActivity {
    public String artist;
    public String track;

    private ArrayList<Track> tracksList = new ArrayList<Track>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.track_list );

        final ArrayList<Track> tracksList = new ArrayList<Track>();
        tracksList.add( new Track( "Marilyn Manson", "HEARTH-SHAPED GLASSES" ) );
        tracksList.add( new Track( "Snow Patrol", "SPITTING GAMES" ) );
        tracksList.add( new Track( "The John Butler Trio", "CLOSE TO YOU" ) );
        tracksList.add( new Track( "AWS", "SUMMER GONE" ) );
        tracksList.add( new Track( "30 Second To Mars", "A BEAUTIFUL LIE" ) );
        tracksList.add( new Track( "Linkin Park", "FAINT" ) );
        tracksList.add( new Track( "Casper", "AUF UND DAFON" ) );
        tracksList.add( new Track( "Stone Sour", "FABULESS" ) );
        tracksList.add( new Track( "Luis Fonsi/Demi Lovato", "ÉCHAME LA CULPA" ) );
        tracksList.add( new Track( "Beth Ditto", "I'M ALIVE" ) );

        final TrackAdapter adapter = new TrackAdapter( this, tracksList);

        ListView listView = (ListView) findViewById( R.id.list );

        listView.setAdapter( adapter );

        listView.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent( RockActivity.this, PlayActivity.class );
                intent.putExtra( "artistName", artist );
                intent.putExtra( "songName", track );
                startActivity( intent );
            }
        } );

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}

