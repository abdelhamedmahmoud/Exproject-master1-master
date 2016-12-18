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

//    int [] imageRecources={R.drawable.bl101,R.drawable.bl102,R.drawable.bl103,R.drawable.bl104,
//                           R.drawable.bl105,R.drawable.bl106,R.drawable.bl107,R.drawable.bl108,
//                           R.drawable.bl109,R.drawable.bl110,R.drawable.bl201,R.drawable.bl202,
//                           R.drawable.bl203,R.drawable.bl204,R.drawable.bl205,R.drawable.bl206,
//                           R.drawable.bl207,R.drawable.bl208,R.drawable.bl209,R.drawable.bl210,
//                           R.drawable.bl301,R.drawable.bl302,R.drawable.bl303,R.drawable.bl401,
//                           R.drawable.bl402,R.drawable.bl403};

    int omgPos = 0;
    Context ctx;
    LayoutInflater layoutInflater;
    static TextView textView;




//    public int chooser() {
//

//        return piccount;
//    }


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

        imageView.setImageResource(second_layout.kemo[position]);

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
