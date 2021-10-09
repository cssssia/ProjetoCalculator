package com.example.projetocalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CalculatorHistory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_history);

        ListView listHistory;

        HistoryAdapter adapter;

        listHistory = findViewById(R.id.listHistory);
        Intent it = getIntent();
        List<History> historyList = (List<History>) it.getSerializableExtra("historyList");
        adapter = new HistoryAdapter(historyList, getBaseContext());
        listHistory.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }

    public void handleBackClick(View v){
        finish();
    }

}