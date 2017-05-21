package net.flowdee.mytraffic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by som on 21-May-17.
 */

public class myAdapter extends BaseAdapter{

    private Context context;
    private String[] titleStrings, detailStrings;
    private int[] ints;
    private TextView titleTextView, detailTextView;
    private ImageView imageView;

    public myAdapter(Context context,
                     String[] titleStrings,
                     String[] detailStrings,
                     int[] ints) {
        this.context = context;
        this.titleStrings = titleStrings;
        this.detailStrings = detailStrings;
        this.ints = ints;

    }

    @Override
    public int getCount() {
        return titleStrings.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.listview_layout, parent, false);

        // initial View
        titleTextView = (TextView) view.findViewById(R.id.txtTitle);
        detailTextView = (TextView) view.findViewById(R.id.txtDetail);
        imageView = (ImageView) view.findViewById(R.id.imvIcon);

        // show view
        titleTextView.setText(titleStrings[position]);

        String strShortDetail = detailStrings[position].substring(0, 35) + " ...";
        detailTextView.setText(strShortDetail);

        imageView.setImageResource(ints[position]);


        return view;


    }
} // main class
