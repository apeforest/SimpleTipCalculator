package com.codepath.simpletipcalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	private EditText totalAmountText;
	private TextView tipValueText;
	private double totalAmount = 0.0;
	private double tipValue = 0.0;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        totalAmountText = (EditText) findViewById(R.id.total_amount_label);
        tipValueText = (TextView) findViewById(R.id.tip_amount_label);
    }
    
    public void OnTenPercent(View v) {
        if(!(totalAmountText.getText().toString()).isEmpty())
        	totalAmount = Double.parseDouble(totalAmountText.getText().toString());

    	tipValue = totalAmount * 0.1;
        tipValueText.setText(String.format("%.2f", tipValue));
    }
    
    public void OnFifteenPercent(View v) {
        if(!(totalAmountText.getText().toString()).isEmpty())
        	totalAmount = Double.parseDouble(totalAmountText.getText().toString());

    	tipValue = totalAmount * 0.15;
        tipValueText.setText(String.format("%.2f", tipValue));
    }
    
    public void OnTwentyPercent(View v) {
        if(!(totalAmountText.getText().toString()).isEmpty())
        	totalAmount = Double.parseDouble(totalAmountText.getText().toString());

    	tipValue = totalAmount * 0.2;
        tipValueText.setText(String.format("%.2f", tipValue));
    }
    
    public void OnReset(View v) {
    	tipValueText.setText("");
    }
}
