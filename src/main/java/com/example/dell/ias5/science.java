package com.example.dell.ias5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class science extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science);

        final String[] hisbooks = {"NCERT","\t\tScience VI","\t\tScience VII","\t\tScience VIII","\t\tScience IX","\t\tScience X","\t\tBiology"};
        ListAdapter saAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,hisbooks);
        ListView list6 = (ListView)findViewById(R.id.list6);
        list6.setAdapter(saAdapter);

        list6.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        // String base = String.valueOf(parent.getItemAtPosition(position));
                        // Toast.makeText(basic.this,base,Toast.LENGTH_LONG).show();
                        if (position == 1) {
                            // Intent i = new Intent(science.this, his9th.class);
                            //  startActivity(i);
                            Toast.makeText(science.this, "Class 6th", Toast.LENGTH_LONG).show();
                        } else if (position == 2) {
                            Toast.makeText(science.this, "Class 7th", Toast.LENGTH_LONG).show();
                        } else if (position == 3) {
                            Toast.makeText(science.this, "Class 8th", Toast.LENGTH_LONG).show();
                        } else if (position == 4) {
                            Toast.makeText(science.this, "Class 9th", Toast.LENGTH_LONG).show();
                        }else if (position == 5) {
                            Toast.makeText(science.this, "Class 10th", Toast.LENGTH_LONG).show();
                        }
                        else if (position == 6) {
                            Toast.makeText(science.this, "Class 12th", Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );
    }
}
