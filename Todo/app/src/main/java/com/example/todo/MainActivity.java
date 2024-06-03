package com.example.todo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> items;
    private ArrayAdapter<String> itemsAdapater;
    private ListView listView;
    private Button button;
    private int i;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        listView = findViewById(R.id.listView);
        button=findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                addItem(view);

            }
        });



        items = new ArrayList<>();
        itemsAdapater = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,items);
        listView.setAdapter(itemsAdapater);
        setUpListViewListener();

    }

    private void setUpListViewListener() {

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Context context=getApplicationContext();
                Toast.makeText(context,"Item Removed",Toast.LENGTH_LONG).show();


                items.remove(i);
                itemsAdapater.notifyDataSetChanged();
                return true;
            }
        });
    }

    private void addItem(View view) {
        EditText input=findViewById(R.id.editTextText);
        String itemText = input.getText().toString();


        if(!(itemText.equals(" "))){
            itemsAdapater.add(itemText);
            input.setText(" ");
        }
        else{
            Toast.makeText(getApplicationContext(),"Please enter text...",Toast.LENGTH_LONG).show();
        }
    }
}