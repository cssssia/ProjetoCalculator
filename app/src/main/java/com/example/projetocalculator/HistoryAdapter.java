package com.example.projetocalculator;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class HistoryAdapter extends BaseAdapter {

    LayoutInflater inflater;
    List<History> historyList;

    public HistoryAdapter(List<History> historyList, Context ctx){
        this.historyList = historyList;
        inflater = LayoutInflater.from(ctx);
    }

    @Override
    public int getCount() {
        return historyList.size();
    }

    @Override
    public Object getItem(int position) {
        return historyList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = inflater.inflate(R.layout.history_item, null);
        TextView txtFirstInput = v.findViewById(R.id.txtFirstInput);
        TextView txtOperator = v.findViewById(R.id.txtOperator);
        TextView txtSecondInput = v.findViewById(R.id.txtSecondInput);
        TextView txtResult = v.findViewById(R.id.txtResult);

        History h = historyList.get(position);
        txtFirstInput.setText(h.getFirstInput() + "");
        txtOperator.setText(h.getOperator());
        txtSecondInput.setText(h.getSecondInput() + "");
        txtResult.setText(h.getResult() + "");
        return v;
    }
}