package com.spock.aosp.View;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.spock.aosp.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Created by greden on 2015/7/26 0026.
 */
public class AllMuisAdapter extends BaseAdapter {
    private Context context;
    private List<Map<String,Object>> list=new ArrayList<Map<String,Object>>();

    public AllMuisAdapter(Context context,List<Map<String,Object>> list){
        this.context=context;
        this.list=list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        View view;

        if (convertView==null){
            view= LayoutInflater.from(context).inflate(R.layout.music_item_layout,null);
            viewHolder=new ViewHolder();
            viewHolder.title=(TextView)view.findViewById(R.id.title);
            viewHolder.artist=(TextView)view.findViewById(R.id.artist);
            viewHolder.album=(TextView)view.findViewById(R.id.album);
            view.setTag(viewHolder);
        }else {
            view=convertView;
            viewHolder=(ViewHolder)view.getTag();
        }
        Map<String,Object> map=new HashMap<String, Object>();
        map=list.get(position);

        viewHolder.title.setText(map.get("title").toString());
        viewHolder.artist.setText(map.get("artist").toString());
        viewHolder.album.setText(map.get("album").toString());


        return view;
    }

    class ViewHolder{
        TextView title,artist,album;
    }
}
