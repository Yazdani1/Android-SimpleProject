package androidsqlite.com.androidproject;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class OneFragment extends android.app.Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_one, container, false);
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {

        Button btn=(Button)getActivity().findViewById(R.id.frA_BTN);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder mydialog=new AlertDialog.Builder(getActivity());
                LayoutInflater inflater=LayoutInflater.from(getActivity());

                View mview=inflater.inflate(R.layout.customdialog,null);

                mydialog.setView(mview);
                final AlertDialog builder=mydialog.create();
                builder.setCancelable(false);

                Button btnm=(Button)mview.findViewById(R.id.ok_btn);

                btnm.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(getActivity(),"OK",Toast.LENGTH_SHORT).show();
                        builder.dismiss();
                    }
                });

                builder.show();



            }
        });

        super.onActivityCreated(savedInstanceState);
    }
}
