package com.example.coffeefinderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends ListActivity {

   // ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] coffee={"The Haus Coffee Shop","Bandit Coffee Co","Sadboy Lounge","Ohana Coffee Kava Tea"};
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, coffee));
    }
    protected void onListItemClick(ListView l, View v, int position, long id){
        switch (position){
            case 0:
                startActivity(new Intent(MainActivity.this, TheHausCoffeeShop.class));
                break;
            case 1:
                startActivity(new Intent(MainActivity.this, BanditCoffeeCo.class));
                break;
            case 2:
                startActivity(new Intent(MainActivity.this, SadboyLounge.class));
                break;
            case 3:
                startActivity(new Intent(MainActivity.this, OhanaCoffeeKavaTea.class));
                break;
        }
    }
}
