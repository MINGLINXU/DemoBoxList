package sg.edu.rp.c346.demoboxlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomerAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<Color>colorList;

    public CustomerAdapter(Context context, int resource, ArrayList<Color>objects){
        super(context,resource,objects);
        parent_context = context;
        layout_id =resource;
        colorList = objects;
    }

    @Override
    public View getView(int position, View converView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);
        ImageView ivColor = rowView.findViewById(R.id.imageViewColor);

        Color currentItem = colorList.get(position);
        if (currentItem.getColor() == "blue_box") {
            ivColor.setImageResource(R.drawable.blue_box);
        }
        else if(currentItem.getColor() == "orange_box"){
            ivColor.setImageResource(R.drawable.orange_box);
        }
        else if(currentItem.getColor() == "brown_box"){
            ivColor.setImageResource(R.drawable.brown_box);
        }

        return  rowView;

    }


}