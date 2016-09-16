package com.example.ndabre0405.lab2listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    ArrayList items =new ArrayList<String>();
    ArrayAdapter<String> myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    items.add("Text1");

    myAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,items);

        ListView myList = (ListView)findViewById(R.id.listView);
        myList.setAdapter(myAdapter);
    }
    void AddTask(View v)
    {
        EditText text=(EditText)findViewById(R.id.editText);
        String selecteditem = text.getText().toString();
        items.add(selecteditem);
        myAdapter.notifyDataSetChanged();
    }
}
