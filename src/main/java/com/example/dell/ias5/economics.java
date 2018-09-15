package com.example.dell.ias5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class economics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_economics);

        final String[] hisbooks = {"NCERT","\t\tEconomics","\t\tUnderstanding Economic Develop","\t\tIndian Economic Development","\t\tIntroductory Microeconomic"};
        ListAdapter saAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,hisbooks);
        ListView list4 = (ListView)findViewById(R.id.list4);
        list4.setAdapter(saAdapter);

        list4.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        // String base = String.valueOf(parent.getItemAtPosition(position));
                        // Toast.makeText(basic.this,base,Toast.LENGTH_LONG).show();
                        if (position == 1) {
                            // Intent i = new Intent(economics.this, his9th.class);
                            //  startActivity(i);
                            Toast.makeText(economics.this, "Class 9th", Toast.LENGTH_LONG).show();
                        } else if (position == 2) {
                            Toast.makeText(economics.this, "Class 10th", Toast.LENGTH_LONG).show();
                        } else if (position == 3) {
                            Toast.makeText(economics.this, "Class 11th", Toast.LENGTH_LONG).show();
                        } else if (position == 4) {
                            Toast.makeText(economics.this, "Class 12th", Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );
    }
}
