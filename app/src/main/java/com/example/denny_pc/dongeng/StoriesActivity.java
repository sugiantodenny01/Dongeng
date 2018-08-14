package com.example.denny_pc.dongeng;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;




import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class StoriesActivity extends AppCompatActivity {
    Intent intent;

    String[] simpleArray;
    HashMap<String,String> hashStories = new HashMap<>();
    String stories;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stories);
        intent = getIntent();
        String story = intent.getStringExtra("story");
        TextView txt = (TextView) findViewById(R.id.TxtVwStory);

        if (story.equals("Cinderella")){
            readCinderella();
        }else if(story.equals("Tarzan")){
            readTarzan();
        }else {
            readSuperman();
        }
        txt.setText(stories.replace("null",""));

    }

    public void readCinderella() {
        ArrayList<String> keyword = intent.getStringArrayListExtra("hashKey");
        Scanner scan = new Scanner(getResources().openRawResource(R.raw.cinderella));
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            line = line.replace("[1]",keyword.get(0));
            line = line.replace("[2]",keyword.get(1));
            line = line.replace("[3]",keyword.get(2));
            line = line.replace("[4]",keyword.get(3));
            line = line.replace("[5]",keyword.get(4));
            line = line.replace("[6]",keyword.get(5));
            line = line.replace("[7]",keyword.get(6));
            line = line.replace("[8]",keyword.get(7));
            line = line.replace("[0]",keyword.get(8));
            stories += line;
        }
        scan.close();

    }

    public void readTarzan() {
        ArrayList<String> keyword = intent.getStringArrayListExtra("hashKey");
        Scanner scan = new Scanner(getResources().openRawResource(R.raw.tarzan));
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            line = line.replace("[1]",keyword.get(0));
            line = line.replace("[2]",keyword.get(1));
            line = line.replace("[3]",keyword.get(2));
            line = line.replace("[4]",keyword.get(3));
            line = line.replace("[5]",keyword.get(4));
            line = line.replace("[6]",keyword.get(5));
            line = line.replace("[7]",keyword.get(6));
            line = line.replace("[8]",keyword.get(7));
            line = line.replace("[9]",keyword.get(8));
            line = line.replace("[10]",keyword.get(9));
            line = line.replace("[0]",keyword.get(10));
            stories += line;
        }
        scan.close();

    }
    public void readSuperman() {
        ArrayList<String> keyword = intent.getStringArrayListExtra("hashKey");
        Scanner scan = new Scanner(getResources().openRawResource(R.raw.supes));
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            line = line.replace("[1]",keyword.get(0));
            line = line.replace("[2]",keyword.get(1));
            line = line.replace("[3]",keyword.get(2));
            line = line.replace("[4]",keyword.get(3));
            line = line.replace("[5]",keyword.get(4));
            line = line.replace("[6]",keyword.get(5));
            line = line.replace("[7]",keyword.get(6));
            line = line.replace("[0]",keyword.get(7));
            stories += line;
        }
        scan.close();

    }


}
