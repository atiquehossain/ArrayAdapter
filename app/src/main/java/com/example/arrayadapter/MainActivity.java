package com.example.arrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    TextView textView;
    String[] name={"MD","Atique","Hossain","Abid"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.textview);
        listView=findViewById(R.id.listview);

        ArrayAdapter<String> arrayAdapter
                =new ArrayAdapter<String>(this,R.layout.listlayout,R.id.textview,name);

        listView.setAdapter(arrayAdapter);
    }
}