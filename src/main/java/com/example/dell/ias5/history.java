package com.example.dell.ias5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class history extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        final String[] hisbooks = {"NCERT","\t\tOur Past I","\t\tOur Past II","\t\tOur Past III","\t\tIndia and Contemporary World I","\t\tIndia and Contemporary World II","\t\tThemes in World History I","\t\tThemes in World History II"};
        ListAdapter saAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,hisbooks);
        ListView list2 = (ListView)findViewById(R.id.list2);
        list2.setAdapter(saAdapter);

        list2.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        // String base = String.valueOf(parent.getItemAtPosition(position));
                        // Toast.makeText(basic.this,base,Toast.LENGTH_LONG).show();
                        if (position == 1) {
                           // Intent i = new Intent(history.this, his9th.class);
                          //  startActivity(i);
                            Toast.makeText(history.this,"Class 6th",Toast.LENGTH_LONG).show();
                        }
                        else if(position==2)
                        {
                            Toast.makeText(history.this,"Class 7th",Toast.LENGTH_LONG).show();
                        }
                        else if(position==3)
                        {
                            Toast.makeText(history.this,"Class 8th",Toast.LENGTH_LONG).show();
                        }
                        else if(position==4)
                        {
                            Toast.makeText(history.this,"Class 9th",Toast.LENGTH_LONG).show();
                        }
                        else if(position==5)
                        {
                            Toast.makeText(history.this,"Class 10th",Toast.LENGTH_LONG).show();
                        }
                        else if(position==6)
                        {
                            Toast.makeText(history.this,"Class 11th",Toast.LENGTH_LONG).show();
                        }
                        else if(position==7)
                        {
                            Toast.makeText(history.this,"Class 12th",Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );
     }
}

