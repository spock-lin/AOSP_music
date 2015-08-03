package com.spock.aosp.Activity;

import android.content.ContentResolver;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.MediaStore.Audio.Media;
import android.widget.ListView;

import com.spock.aosp.R;

import com.spock.aosp.Utils.BaseActivity;
import com.spock.aosp.Utils.MusicList;
import com.spock.aosp.View.AllMuisAdapter;

/**
 * Created by greden on 2015/7/26 0026.
 */
public class AllMusicActivity extends BaseActivity {
    private ListView mAllMusic;
    private AllMuisAdapter mAdapter;
    private Cursor cursor;
    private String music[]=new String[]{
            Media._ID,Media.TITLE, Media.DURATION,Media.ARTIST,Media.DATA,Media.ALBUM
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.all_music_activity);

        mAllMusic=(ListView)findViewById(R.id.all_music_show);

        cursor=getContentResolver().query(Media.EXTERNAL_CONTENT_URI,music,null,null,null);
        mAdapter=new AllMuisAdapter(this, MusicList.getMusic(cursor));
        mAllMusic.setAdapter(mAdapter);


    }
}
