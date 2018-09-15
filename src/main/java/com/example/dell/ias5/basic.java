package com.example.dell.ias5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class basic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);

        final String[] base = {"Exam Description","Eligibility Criteria","Exam Pattern","Syllabus","Preparation Tips","Coaching Centres","Important Dates","Apllication Procedure"};
        ListAdapter saAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,base);
        ListView list1 = (ListView)findViewById(R.id.list1);
        list1.setAdapter(saAdapter);

        list1.setOnItemClickListener(
                new AdapterView.OnItemClickListener(){
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                       // String base = String.valueOf(parent.getItemAtPosition(position));
                       // Toast.makeText(basic.this,base,Toast.LENGTH_LONG).show();
                        if(position==0)
                        {
                            Intent i = new Intent(basic.this,exam_description.class);
                            startActivity(i);
                        }
                        else if(position==1)
                        {
                            Intent i = new Intent(basic.this,eligibility_criteria.class);
                            startActivity(i);
                        }
                        else if(position==2)
                        {
                            Intent i = new Intent(basic.this,exam_pattern.class);
                            startActivity(i);
                        }
                        else if(position==3)
                        {
                            Intent i = new Intent(basic.this,syllabus.class);
                            startActivity(i);
                        }

                        else if(position==4)
                        {
                            Intent i = new Intent(basic.this,preparation_tips.class);
                            startActivity(i);
                        }
                        else if(position==5)
                        {
                            Intent i = new Intent(basic.this,coaching_centres.class);
                            startActivity(i);
                        }
                        else if(position==6)
                        {
                            Intent i = new Intent(basic.this,important_dates.class);
                            startActivity(i);
                        }
                        else if (position==7)
                        {
                            Intent i = new Intent(basic.this,application_proc.class);
                            startActivity(i);
                        }



                    }
                }

        );
    }
}
