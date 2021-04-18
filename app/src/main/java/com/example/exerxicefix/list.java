package com.example.exerxicefix;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class list extends BaseAdapter {
    Context mContext;
    LayoutInflater inflater;
    private ArrayList<classnama> arrayList;
    public list(Context context) {
        mContext = context;
        inflater = LayoutInflater.from(mContext);
        this.arrayList = new ArrayList<classnama>();
        this.arrayList.addAll(mainmenu2.classNamaArrayList);
    }

    public void filter(String search) {
    }

    public class ViewHolder{
        TextView name;
    }
    @Override
    public int getCount() {

        return mainmenu2.classNamaArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return mainmenu2.classNamaArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final ViewHolder holder;

        if (view == null) {
            holder = new ViewHolder();
            view = inflater.inflate(R.layout.activity_list,null);
            holder.name = (TextView) view.findViewById(R.id.tvnama_item);
            view.setTag(holder);
        }
        else {
            holder = (ViewHolder) view.getTag();
        }
        holder.name.setText(mainmenu2.classNamaArrayList.get(i).getNama());
        return view;
    }
}
