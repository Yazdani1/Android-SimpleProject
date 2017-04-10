package androidsqlite.com.androidproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Yazdani on 1/29/2017.
 */

public class CustomAdapter extends BaseAdapter {

    String[] textshow;
    int[] imageshow;
    Context ct;

    private static LayoutInflater inflater=null;
     public CustomAdapter(MainActivity mainact,String[] text,int[] mimage){
         textshow=text;
         imageshow=mimage;
         ct=mainact;

         inflater=(LayoutInflater)ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return textshow.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    public class MyHolder{
        ImageView cusimg;
        TextView custext;
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {

        MyHolder myh=new MyHolder();

        View myview=inflater.inflate(R.layout.custom_list,null);
        myh.custext=(TextView)myview.findViewById(R.id.Textview_id);
        myh.cusimg=(ImageView)myview.findViewById(R.id.imageview_id);
        myh.custext.setText(textshow[i]);
        myh.cusimg.setImageResource(imageshow[i]);


        myview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ct,"Clicked on "+textshow[i],Toast.LENGTH_SHORT).show();
            }
        });


        return myview;
    }




}
