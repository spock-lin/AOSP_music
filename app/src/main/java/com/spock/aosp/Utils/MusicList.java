package com.spock.aosp.Utils;

import android.content.Context;
import android.database.Cursor;
import android.provider.MediaStore.Audio.Media;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by greden on 2015/7/26 0026.
 */
public class MusicList {
    private  Context context;
    private static List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
    private static List<Object> musiclists = new ArrayList<Object>();

    public MusicList(Context context){
        this.context=context;
    }

    public static List<Map<String,Object>> getMusic(Cursor cursor){
        while (cursor.moveToLast()){
            Music music=new Music();
            music.setData(cursor.getString(cursor.getColumnIndex(Media.DATA)));
            music.setTitle(cursor.getString(cursor.getColumnIndex(Media.TITLE)));
            music.setArtist(cursor.getString(cursor.getColumnIndex(Media.ARTIST)));
            music.setDuration(cursor.getInt(cursor.getColumnIndex(Media.DURATION)));
            music.setAlbum(cursor.getString(cursor.getColumnIndex(Media.ALBUM)));
            musiclists.add(music);

            Map<String, Object> map=new HashMap<>();
            map.put("title",cursor.getString(cursor.getColumnIndex(Media.TITLE)));
            map.put("artist",cursor.getString(cursor.getColumnIndex(Media.ARTIST)));
            map.put("album",cursor.getString(cursor.getColumnIndex(Media.ALBUM)));
            list.add(map);

        }
        return list;
    }
}
