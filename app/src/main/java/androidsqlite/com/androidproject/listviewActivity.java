package androidsqlite.com.androidproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import static androidsqlite.com.androidproject.R.array.list_item;

public class listviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        Toolbar toolbar=(Toolbar)findViewById(R.id.list_toolbar);
        setSupportActionBar(toolbar);

        ListView lst=(ListView)findViewById(R.id.list_view_xml_ex);

        ArrayAdapter adapter=new ArrayAdapter(listviewActivity.this,android.R.layout.simple_list_item_1,getResources().getStringArray(list_item));

        lst.setAdapter(adapter);

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                switch (i){
                    case 0:
                        Toast.makeText(getApplicationContext(),"First position",Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(getApplicationContext(),"Second position",Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        Toast.makeText(getApplicationContext(),"Clicked on"+i,Toast.LENGTH_SHORT).show();
                        break;

                }

            }
        });



    }
}
