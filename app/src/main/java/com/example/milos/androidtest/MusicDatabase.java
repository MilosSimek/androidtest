package com.example.milos.androidtest;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by milos on 21/11/2017.
 */

@Database(entities = {MusicEntity.class}, version =1)
public abstract class MusicDatabase extends RoomDatabase{
    public abstract DaoMusicAccess daoMusicAccess();
}


