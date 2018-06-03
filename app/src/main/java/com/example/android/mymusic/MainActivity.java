package com.example.android.mymusic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        TextView chart = (TextView) findViewById( R.id.chart_text_view );

        chart.setOnClickListener( new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {

                Intent chartIntent = new Intent( MainActivity.this, ChartActivity.class );

                startActivity( chartIntent );
            }
        } );


        TextView dance = (TextView) findViewById( R.id.dance_text_view );

        dance.setOnClickListener( new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {

                Intent danceIntent = new Intent( MainActivity.this, DanceActivity.class );

                // Start the new activity
                startActivity( danceIntent );
            }
        } );

        TextView rock = (TextView) findViewById( R.id.rock_text_view);

        rock.setOnClickListener( new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {

                Intent rockIntent = new Intent( MainActivity.this, RockActivity.class );

                startActivity( rockIntent );
            }
        } );

        TextView latinBeats = (TextView) findViewById( R.id.latin_beats_text_view );

        latinBeats.setOnClickListener( new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {

                Intent latinBeatsIntent = new Intent( MainActivity.this, LatinBeatsActivity.class );

                startActivity( latinBeatsIntent );
            }
        } );
    }
}
