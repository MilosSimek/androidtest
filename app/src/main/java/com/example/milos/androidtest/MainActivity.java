package com.example.milos.androidtest;

import android.arch.persistence.room.Room;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    private MusicDatabase musicDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        musicDatabase = Room.databaseBuilder(getApplicationContext(),
                MusicDatabase.class, "music-db").build();

        MusicEntity entity1 = new MusicEntity("Album1", "Artist1", "Genre1", "Year1");
        MusicEntity entity2 = new MusicEntity("Album2", "Artist2", "Genre2", "Year2");
        MusicEntity entity3 = new MusicEntity("Album3", "Artist3", "Genre3", "Year3");
        MusicEntity entity4 = new MusicEntity("Album4", "Artist4", "Genre4", "Year4");


        new DatabaseAsync().execute(entity1, entity2, entity3, entity4);

    }

    private class DatabaseAsync extends AsyncTask<MusicEntity, Void, Void> {

        @Override
        protected Void doInBackground(MusicEntity... entities) {
            //Let's add some dummy data to the database.

            for (MusicEntity entity : entities) {
                musicDatabase.daoMusicAccess().insert(entity);
            }


            return null;
        }

    }

}