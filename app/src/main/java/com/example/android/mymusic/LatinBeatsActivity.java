package com.example.android.mymusic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class LatinBeatsActivity extends AppCompatActivity {
    public String artist;
    public String track;

    private ArrayList<Track> tracksList= new ArrayList<Track>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.track_list );

        final ArrayList<Track> tracksList = new ArrayList<Track>();
        tracksList.add( new Track( "D.OZI feat J Alvarez", "SI TU NO ESTAS" ) );
        tracksList.add( new Track( "Wisin and Yandel", "HIPNOTIZAME" ) );
        tracksList.add( new Track( "Cosculluela feat Daddy Yankee", "A DONDE VOY" ) );
        tracksList.add( new Track( "Manolito Simone Y Su Trabuco", "COMUNICATE" ) );
        tracksList.add( new Track( "Dente De Zona", "BAILANDO" ) );
        tracksList.add( new Track( "Don Omar feat Yunel Cruz", "LA LLAVE DE MI CORAZON" ) );
        tracksList.add( new Track( "Elvis Crespo", "PINTA ME" ) );
        tracksList.add( new Track( "Badoxa", "CONTROLA" ) );
        tracksList.add( new Track( "Angel Lopez", "HAST CUANDO" ) );
        tracksList.add( new Track( "Luis Fonsi/Demi Lovato", "ÉCHAME LA CULPA" ) );

        final TrackAdapter adapter = new TrackAdapter( this, tracksList );

        ListView listView = (ListView) findViewById( R.id.list );

        listView.setAdapter( adapter );

        listView.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent( LatinBeatsActivity.this, PlayActivity.class );
                intent.putExtra( "artistName", artist );
                intent.putExtra( "songName", track );
                startActivity( intent );
            }
        } );

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}

