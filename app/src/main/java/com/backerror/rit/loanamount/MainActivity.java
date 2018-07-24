package com.backerror.rit.loanamount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText loanAmountET;
    EditText interestRateET;
    EditText yearET;
    Button calculateBTN;
    TextView totalAmountET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        loanAmountET=findViewById( R.id.bankLoanAmount );
        interestRateET=findViewById( R.id.interestRate );
        yearET=findViewById( R.id.yearEditText );
        totalAmountET=findViewById( R.id.totalAmount );
        calculateBTN=findViewById( R.id.calculateBtn );
        calculateBTN.setOnClickListener( this );
    }

    @Override
    public void onClick(View v) {
        double BankloanAmount=Double.parseDouble( loanAmountET.getText().toString());
        double ineterestRate=Double.parseDouble( interestRateET.getText().toString());
        int year=Integer.parseInt( yearET.getText().toString());
        
        LoanAmount loanAmount=new LoanAmount(BankloanAmount,ineterestRate, year );


        totalAmountET.setText( "Total Payable Amount : " + loanAmount.getCalculation()+ " TK");
    }
}
