package com.nwmissouri.gesturespractice;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/**
 * Created by S525894 on 2/20/2017.
 */

public class FlowerAdapter extends ArrayAdapter<Flower> {



    public FlowerAdapter(Context context, int resource, int textViewResourceId) {
        super(context, resource, textViewResourceId);
    }


    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return super.getView(position, convertView, parent);
    }
}
