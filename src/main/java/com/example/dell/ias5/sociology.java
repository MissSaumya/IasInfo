package com.example.dell.ias5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class sociology extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sociology);

        final String[] hisbooks = {"NCERT","\t\tIntroducing Sociology","\t\tIndian Society"};
        ListAdapter saAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,hisbooks);
        ListView list7 = (ListView)findViewById(R.id.list7);
        list7.setAdapter(saAdapter);

        list7.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        // String base = String.valueOf(parent.getItemAtPosition(position));
                        // Toast.makeText(basic.this,base,Toast.LENGTH_LONG).show();
                        if (position == 1) {
                            // Intent i = new Intent(economics.this, his9th.class);
                            //  startActivity(i);
                            Toast.makeText(sociology.this, "Class 11th", Toast.LENGTH_LONG).show();
                        } else if (position == 2) {
                            Toast.makeText(sociology.this, "Class 12th", Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );
    }
}
