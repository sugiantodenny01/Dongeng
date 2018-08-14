package com.example.denny_pc.dongeng;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnCinder(View view) {
        Intent intent = new Intent(this,KeywordActivity.class);
        intent.putExtra("story","Cinderella");
        startActivity(intent);
    }

    public void btnTarzan(View view) {
        Intent intent = new Intent(this,KeywordActivity.class);
        intent.putExtra("story","Tarzan");
        startActivity(intent);
    }

    public void btnSuperman(View view) {
        Intent intent = new Intent(this,KeywordActivity.class);
        intent.putExtra("story","Superman");
        startActivity(intent);
    }
    public void btnCredit(View view) {
        Intent intent = new Intent(this,CreditActivity.class);
        startActivity(intent);
    }


}
