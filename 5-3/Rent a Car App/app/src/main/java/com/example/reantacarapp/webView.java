package com.example.reantacarapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.app.Activity;
import android.text.Html;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class webView extends AppCompatActivity {
    TextView HyperLink;
    Spanned Text;

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        listView=(ListView)findViewById(R.id.listview);
        ArrayList<String> arrayList= new ArrayList<>();

        arrayList.add("Hertz");
        arrayList.add("enterprise");
        arrayList.add("National");
        arrayList.add("Alamo");
        arrayList.add("dollar.");
        arrayList.add("Budget");

        ArrayAdapter arrayAdapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList);

        listView.setAdapter(arrayAdapter);




     /*   HyperLink = (TextView)findViewById(R.id.opt1);

        Text = Html.fromHtml("Click on this link to visit my Website <br />" +
                "<a href='https://www.android-examples.com//'>Android-Examples.com</a>");

        HyperLink.setMovementMethod(LinkMovementMethod.getInstance());
        HyperLink.setText(Text);*/
    }
    protected void onListItemClick(ListView l, View v, int position, long id){
        switch (position){
            case 0:

            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.hertz.com")));
            break;
        }


    }

}
