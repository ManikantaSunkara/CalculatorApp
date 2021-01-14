package com.example.calculatorapp;

import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity<buttonEqual,buttonDel, buttonDot, Remainder> extends AppCompatActivity {
    double input1 = 0, input2 = 0;
    TextView edt1,edt2;
    boolean Addition, Subtract, Multiplication, Division, mRemainder, decimal;
    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button buttonAdd;
    Button buttonSub;
    private Object buttonDot;
    private Object buttonEqual;
    //declare button;
     buttonEqual,buttonDel,buttonDot, Remainder;
     
     @Override
     public void onCreate(Bundle savedInstanceState)
     {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //binding the button with xml
        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonDot = (Button) findViewById(R.id.buttonDot);
        buttonAdd = (Button) findViewById(R.id.buttonadd);
        buttonSub = (Button) findViewById(R.id.buttonsub);
         Button buttonMul = (Button) findViewById(R.id.buttonmul);
        buttonDivision = (Button) findViewById(R.id.buttondiv);
        buttonDel = (Button) findViewById(R.id.buttonDel);
        buttonEqual = (Button) findViewById(R.id.buttoneql);
         edt1 = (TextView) findViewById(R.id.display);
         edt2 = (TextView) findViewById(R.id.display1);

         button1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 edt1.setText(edt1.getText() + "1");                     //is set 1 when button click
             }

         });
         button2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 edt1.setText(edt1.getText() + "2");                     //is set 2 when button click
             }
         });

         button3.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 edt1.setText(edt1.getText() + "3");                     //is set 3 when button click
             }
         });

         button4.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 edt1.setText(edt1.getText() + "4");                     //is set 4 when button click
             }
         });

         button5.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 edt1.setText(edt1.getText() + "5");                     //is set 5 when button click
             }
         });

         button6.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 edt1.setText(edt1.getText() + "6");                     //is set 6 when button click
             }
         });

         button7.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 edt1.setText(edt1.getText() + "7");                     //is set 7 when button click
             }
         });

         button8.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 edt1.setText(edt1.getText() + "8");                     //is set 8 when button click
             }
         });

         button9.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 edt1.setText(edt1.getText() + "9");                     //is set 9 when button click
             }
         });

         button0.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 edt1.setText(edt1.getText() + "0";                      //is set 0 when button click
             }
         });
         buttonDel.setOnClickListener(new View.OnClickListener() {               //is clear function excute when button click
             @Override
             public void onClick(View v) {
                 edt1.setText("");
                 input1 = 0.0;
                 input2 = 0.0;
                 edt2.setText("");
             }
         });

         buttonDot.setOnClickListener(new View.OnClickListener() {               //decimal num allow when button click
             @Override
             public void onClick(View v) {
                 if (decimal) {

                 } else {
                     edt1.setText(edt1.getText() + ".");
                     decimal = true;
                 }

             }
         });
         buttonAdd.setOnClickListener(new View.OnClickListener() {               //sum /addition(+) function
             @Override
             public void onClick(View v) {
                 if (edt1.getText().length() != 0) {
                     input1 = Float.parseFloat(edt1.getText() + "");
                     edt2.setText("+");
                     Addition = true;
                     decimal = false;
                     edt1.setText(null);
                 }
             }
         });
         buttonSub.setOnClickListener(new View.OnClickListener() {               //substract/minus(-) function
             @Override
             public void onClick(View v) {
                 if (edt1.getText().length() != 0) {
                     input1 = Float.parseFloat(edt1.getText() + "");
                     edt2.setText("-");
                     Subtract = true;
                     decimal = false;
                     edt1.setText(null);
                 }
             }
         });

         buttonMul.setOnClickListener(new View.OnClickListener() {               //multiple(*) function
             @Override
             public void onClick(View v) {
                 if (edt1.getText().length() != 0) {
                     input1 = Float.parseFloat(edt1.getText() + "");
                     edt2.setText("*");
                     Multiplication = true;
                     decimal = false;
                     edt1.setText(null);
                 }
             }
         });

         buttonDivision.setOnClickListener(new View.OnClickListener() {  //divide(/) function
             @Override
             public void onClick(View v) {
                 if (edt1.getText().length() != 0) {
                     input1 = Float.parseFloat(edt1.getText() + "");
                     edt2.setText("/");
                     Division = true;
                     decimal = false;
                     edt1.setText(null);
                 }
             }
         });
         buttonEqual.setOnClickListener(new View.OnClickListener() {             .//equal(=) function
             @Override
             public void onClick(View v) {
                 if (Addition || Subtract || Multiplication || Division) {
                     input2 = Float.parseFloat(edt1.getText() + "");
                     edt2.setText("=");
                 }

                 if (Addition) {

                     edt1.setText(input1 + input2 + "");
                     Addition = false;
                 }

                 if (Subtract) {

                     edt1.setText(input1 - input2 + "");
                     Subtract = false;
                 }

                 if (Multiplication) {
                     edt1.setText(input1 * input2 + "");
                     Multiplication = false;
                 }

                 if (Division) {
                     edt1.setText(input1 / input2 + "");
                     Division = false;
                 }
             }
         });
     }
}
