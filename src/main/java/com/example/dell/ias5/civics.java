package com.example.dell.ias5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class civics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civics);

        final String[] hisbooks = {"NCERT","\t\tSocial and Political Life I","\t\tSocial and Political Life II","\t\tSocial and Political Life","\t\tDemocratic Politics I","\t\tDemocratic Politics II","\t\tIndian Constitution at Work","\t\tContemporary World Politics"};
        ListAdapter saAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,hisbooks);
        ListView list5 = (ListView)findViewById(R.id.list5);
        list5.setAdapter(saAdapter);

        list5.setOnItemClickListener(

                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        // String base = String.valueOf(parent.getItemAtPosition(position));
                        // Toast.makeText(basic.this,base,Toast.LENGTH_LONG).show();
                        if (position == 1) {
                            // Intent i = new Intent(civics.this, his9th.class);
                            //  startActivity(i);
                            Toast.makeText(civics.this, "Class 6th", Toast.LENGTH_SHORT).show();
                        } else if (position == 2) {
                            Toast.makeText(civics.this, "Class 7th", Toast.LENGTH_SHORT).show();
                        } else if (position == 3) {
                            Toast.makeText(civics.this, "Class 8th", Toast.LENGTH_SHORT).show();
                        } else if (position == 4) {
                            Toast.makeText(civics.this, "Class 9th", Toast.LENGTH_SHORT).show();
                        }else if (position == 5) {
                            Toast.makeText(civics.this, "Class 10th", Toast.LENGTH_SHORT).show();
                        }
                        else if (position == 6) {
                            Toast.makeText(civics.this, "Class 11th", Toast.LENGTH_SHORT).show();
                        }
                        else if (position == 7) {
                            Toast.makeText(civics.this, "Class 12th", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        );
    }
}
