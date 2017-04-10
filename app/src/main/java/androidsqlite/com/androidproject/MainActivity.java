package androidsqlite.com.androidproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar=(Toolbar)findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.title);
        getSupportActionBar().setSubtitle(R.string.subtitle);
        getSupportActionBar().setIcon(R.drawable.ic_action_toolbar);


        ListView lst=(ListView)findViewById(R.id.listview_xml);

        String[] finaltext={"Mac","Windos","Apple","Samsung","WALTON","Mac",
                "Windos","Apple","Samsung","WALTON",
                "Mac","Windos","Apple","Samsung","WALTON"
        };
        int[] finakmage={

                R.drawable.a,
                R.drawable.b,
                R.drawable.c,
                R.drawable.d,
                R.drawable.e,
                R.drawable.f,
                R.drawable.g,
                R.drawable.h,
                R.drawable.i,
                R.drawable.a,
                R.drawable.b,
                R.drawable.c,
                R.drawable.a,
                R.drawable.b,
                R.drawable.c

        };


        CustomAdapter adapter=new CustomAdapter(this,finaltext,finakmage);
        lst.setAdapter(adapter);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.menu1:
                Toast.makeText(getApplicationContext(),"First position",Toast.LENGTH_SHORT).show();
                break;

            case R.id.menu2:
                startActivity(new Intent(MainActivity.this,listviewActivity.class));
                Toast.makeText(getApplicationContext(),"List View",Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu3:
                startActivity(new Intent(MainActivity.this,FragmentActivity.class));
                Toast.makeText(getApplicationContext(),"Third position",Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu4:
                Toast.makeText(getApplicationContext(),"Fifth position",Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu5:
                Toast.makeText(getApplicationContext(),"Fifth position",Toast.LENGTH_SHORT).show();
                break;

            case R.id.menu6:
                Toast.makeText(getApplicationContext(),"Six position",Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
