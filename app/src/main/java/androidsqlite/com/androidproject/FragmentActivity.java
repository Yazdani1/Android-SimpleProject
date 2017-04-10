package androidsqlite.com.androidproject;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class FragmentActivity extends AppCompatActivity {

    OneFragment frA=new OneFragment();
    TwoFragment frB=new TwoFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        Toolbar toolbar=(Toolbar)findViewById(R.id.fragment_toolbar);
        setSupportActionBar(toolbar);

    }


    public void method1(View v){

        FragmentManager fm=getFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.fragment_xml,frA,"fragmentA");
        ft.commit();

    }


    public void method2(View v){

        FragmentManager fm=getFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.fragment_xml,frB,"fragmentb");
        ft.commit();

    }




}
