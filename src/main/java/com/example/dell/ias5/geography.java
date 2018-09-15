package com.example.dell.ias5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class geography extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geography);

        final String[] hisbooks = {"NCERT","\t\tThe Earth:Our Habitat","\t\tOur Environment","\t\tResources and Development","\t\tFundamentals of Phy Geography","\t\tFundamentals of Human Geography"};
        ListAdapter saAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,hisbooks);
        ListView list3 = (ListView)findViewById(R.id.list3);
        list3.setAdapter(saAdapter);

        list3.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        // String base = String.valueOf(parent.getItemAtPosition(position));
                        // Toast.makeText(basic.this,base,Toast.LENGTH_LONG).show();
                        if (position == 1) {
                            // Intent i = new Intent(geography.this, his9th.class);
                            //  startActivity(i);
                            Toast.makeText(geography.this,"Class 6th",Toast.LENGTH_LONG).show();
                        }
                        else if(position==2)
                        {
                            Toast.makeText(geography.this,"Class 7th",Toast.LENGTH_LONG).show();
                        }
                        else if(position==3)
                        {
                            Toast.makeText(geography.this,"Class 8th",Toast.LENGTH_LONG).show();
                        }
                        else if(position==4)
                        {
                            Toast.makeText(geography.this,"Class 11th",Toast.LENGTH_LONG).show();
                        }
                        else if(position==5)
                        {
                            Toast.makeText(geography.this,"Class 12th",Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );
    }
}
