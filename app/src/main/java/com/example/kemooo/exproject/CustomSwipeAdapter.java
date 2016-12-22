package com.example.kemooo.exproject;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Dell on 12/13/2016.
 */

public class CustomSwipeAdapter extends PagerAdapter {



    int omgPos = 0;
    Context ctx;
    LayoutInflater layoutInflater;
    static TextView textView;
    String stringID;
    Boolean finalState=getSelectedFeatures.NotfoundState;



    public CustomSwipeAdapter (Context ctx){
        this.ctx=ctx;

    }

    @Override
    public int getCount() {
            return second_layout.kemo.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view==(RelativeLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater=(LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View item_view=layoutInflater.inflate(R.layout.image,container,false);
        ImageView imageView=(ImageView)item_view.findViewById(R.id.image_view);

        textView=(TextView)item_view.findViewById(R.id.roomInformation);
        imageView.setImageResource(second_layout.kemo[position]);

        stringID=getSelectedFeatures.roomName;
        Toast.makeText(ctx, getSelectedFeatures.NotfoundState+"", Toast.LENGTH_SHORT).show();
        if(getSelectedFeatures.NotfoundState) {
            textView.setText("Not Found");
        }
        else
        {
            textView.setText(ctx.getText(Integer.parseInt(stringID)));
        }
        int pos= position+1;
//        textView.setText("image : "+pos);
        container.addView(item_view);



        return item_view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((RelativeLayout)object);
    }
}
