package com.example.van.piggybank;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Expenses extends Activity {

    Button income, expenses, budget, social;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expenses);

        income = (Button) findViewById(R.id.income);
        expenses = (Button) findViewById(R.id.expenses);
        budget = (Button) findViewById(R.id.budget);
        social = (Button) findViewById(R.id.social);

        expenses.setBackgroundColor(Color.parseColor("#959595"));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_expenses, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClick(View v) {
        if (v == income)
            onClick_income(v);
        else if (v == budget)
            onClick_budget(v);
        else if (v == social)
            onClick_social(v);
    }

    public void onClick_income(View v) {
        Intent i = new Intent(this, Income.class);
        startActivity(i);
    }


    public void onClick_budget(View v) {
        Intent i = new Intent(this, Budget.class);
        startActivity(i);
    }

    public void onClick_social(View v) {
        Intent i = new Intent(this, Social.class);
        startActivity(i);
    }
}
