package com.example.milos.androidtest;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Update;

/**
 * Created by milos on 21/11/2017.
 */
@Dao
public interface DaoMusicAccess {

    @Insert
    void insert(MusicEntity music);

    @Update
    void update(MusicEntity music);

    @Delete
    void delete(MusicEntity music);

}
