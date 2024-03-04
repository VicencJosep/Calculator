package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String variable = "";
    double [] num = new double[2];
    char operador ='x';
    int k =0;
    int f=0;

    TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView2 = findViewById(R.id.textView2);
    }
    public void btndelClick(View v)
    {
        textView2.setText("");
        variable = "";
        num[0]=0;
        num[1]=0;

    }
    public void btn1Click(View v)
    {

        variable = variable + '1';

        textView2.setText(variable);

        op_auto();

    }
    public void btn2Click(View v)
    {

        variable = variable + '2';
        textView2.setText(variable);
        op_auto();


    }
    public void btn3Click(View v)
    {

        variable = variable + '3';

        textView2.setText(variable);

        op_auto();
    }
    public void btn4Click(View v)
    {

        variable = variable + '4';

        textView2.setText(variable);

       op_auto();
    }
    public void btn5Click(View v)
    {

        variable = variable + '5';

        textView2.setText(variable);

       op_auto();
    }
    public void btn6Click(View v)
    {

        variable = variable + '6';

        textView2.setText(variable);

        op_auto();
    }
    public void btn7Click(View v)
    {

        variable = variable + '7';

        textView2.setText(variable);

        op_auto();
    }
    public void btn8Click(View v)
    {

        variable = variable + '8';

        textView2.setText(variable);
        op_auto();
    }
    public void btn9Click(View v)
    {

        variable = variable + '9';
        textView2.setText(variable);
        op_auto();
    }
    public void btn0Click(View v)
    {
        variable = variable + '0';
        textView2.setText(variable);
        op_auto();
    }
    public void btnsinClick(View v){
        textView2.setText("sin(");
        k=5;
    }
    public void btntangClick(View v){
        textView2.setText("tang(");
        k=6;
    }
    public void btncosClick(View v){
        textView2.setText("cos(");
        k=7;
    }

    public void btnSumClick (View v) //--> k=1
    {
        num[0]= Double.parseDouble(variable);
        textView2.setText(variable);
        variable ="";
        k=1;
        f=1;

    }
    public void btnMinusClick(View v) //--> k=2
    {
        num[0]= Double.parseDouble(variable);
        variable ="";
        k=2;
        f=1;
    }
    public void btnDivClick (View v)//--> k=4
    {

        num[0]= Double.parseDouble(variable);
        variable ="";
        k=4;
        f=1;
    }
    public void btnMultClick (View v)
    {

        num[0]= Double.parseDouble(variable);
        variable ="";
        k=3;
        f=1;

    }
    public void btnEqualClick (View v){
        operacion();
        textView2.setText(String.valueOf(num[1]));
        num[0]=0;
        num[1]=0;
        variable = "";

    }
    public void operacion ()
    {
        if (k==3)
        { num[1] = num[0]*(Double.parseDouble(variable));}
        if (k==2)
        { num[1] = num[0]-(Double.parseDouble(variable));}
        if (k==1)
        { num[1] = num[0] + (Double.parseDouble(variable));}
        if(k==4)
        { num[1] = num[0]/(Double.parseDouble(variable));}
        if (k==5)
        {Math.sin(Math.toRadians(Double.parseDouble(variable)));}
        if(k==6)
        {Math.tan(Math.toRadians(Double.parseDouble(variable)));}
        if (k==7)
        {Math.cos(Math.toRadians(Double.parseDouble(variable)));}

    }
    public void op_auto ()
    {
        if(f==1)
        {
            operacion();
            textView2.setText(String.valueOf(num[1]));
            variable = String.valueOf(num[1]);

            variable = String.valueOf(num[1]);
            num[0]=0;
            num[1]=0;
            f=0;
        }
    }
}