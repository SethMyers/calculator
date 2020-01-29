package com.example.sethmyers1.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnAdd, btnSub, btnDiv,
            btnMult, btnDec, btnC, btnEq, btnMC, btnMR, btnMAdd, btnMSub, btnPM;
    TextView numField;
    float val1, val2, mem = 0;
    int max = 0;

    /*op is a flag to tell when an operand has been pressed

    add2/sub2/div2/mult2/eq are for checking if a specific operand has been pressed

    eq is flag for operands when equals is pressed, eqop is flag for numbers when
    equals is pressed (since ops and nums react differently but both must know when equals is pressed)

    dec is to make sure one cannot press decimal more than once per field
    */
    boolean eqop=true, op, add2, sub2, div2, mult2, eq, dec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn0 = (Button) findViewById(R.id.btn0);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnMult = (Button) findViewById(R.id.btnMult);
        btnDec = (Button) findViewById(R.id.btnDec);
        btnC = (Button) findViewById(R.id.btnC);
        btnEq = (Button) findViewById(R.id.btnEq);
        btnMC = (Button) findViewById(R.id.btnMC);
        btnMR = (Button) findViewById(R.id.btnMR);
        btnMAdd = (Button) findViewById(R.id.btnMAdd);
        btnMSub = (Button) findViewById(R.id.btnMSub);
        btnPM = (Button) findViewById(R.id.btnPM);
        numField = (TextView) findViewById(R.id.numField);
        numField.setText("0");

        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                //if last button pressed was not an op, add the number to the end of the textfield
                if(op==false&&eqop==false) {
                    //only 10 digits allowed to be inputted
                    if(checkMax()) {
                        numField.setText(numField.getText() + "1");
                        max++;
                    }
                }
                //else overwrite the textfield with the inputted number and switch the appropriate flags
                else {
                    numField.setText("1");
                    op=false;
                    eqop=false;
                    dec=false;
                    max=1;
                }
            }
        });
        //rest of number buttons use same logic
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(op==false&&eqop==false) {
                    if(checkMax()) {
                        numField.setText(numField.getText() + "2");
                        max++;
                    }                }
                else {
                    numField.setText("2");
                    op = false;
                    eqop=false;
                    dec=false;
                    max=1;
                    
                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(op==false&&eqop==false) {
                    if(checkMax()) {
                        numField.setText(numField.getText() + "3");
                        max++;
                    }                }
                else{
                    numField.setText("3");
                    op = false;
                    eqop=false;
                    dec=false;
                    max=1;
                    
                }
            }
        });
        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(op==false&&eqop==false) {
                    if(checkMax()) {
                        numField.setText(numField.getText() + "4");
                        max++;
                    }                }
                else{
                    numField.setText("4");
                    op = false;
                    eqop=false;
                    dec=false;
                    max=1;
                    
                }
            }
        });
        btn5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(op==false&&eqop==false) {
                    if(checkMax()) {
                        numField.setText(numField.getText() + "5");
                        max++;
                    }                }
                else{
                    numField.setText("5");
                    op = false;
                    eqop=false;
                    dec=false;
                    max=1;
                    
                }
            }
        });
        btn6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(op==false&&eqop==false) {
                    if(checkMax()) {
                        numField.setText(numField.getText() + "6");
                        max++;
                    }                }
                else{
                    numField.setText("6");
                    op = false;
                    eqop=false;
                    dec=false;
                    max=1;
                    
                }
            }
        });
        btn7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(op==false&&eqop==false) {
                    if(checkMax()) {
                        numField.setText(numField.getText() + "7");
                        max++;
                    }                }
                else{
                    numField.setText("7");
                    op = false;
                    eqop=false;
                    dec=false;
                    max=1;
                    
                }
            }
        });
        btn8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(op==false&&eqop==false) {
                    if(checkMax()) {
                        numField.setText(numField.getText() + "8");
                        max++;
                    }                }
                else{
                    numField.setText("8");
                    op = false;
                    eqop=false;
                    dec=false;
                    max=1;
                    
                }
            }
        });
        btn9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(op==false&&eqop==false) {
                    if(checkMax()) {
                        numField.setText(numField.getText() + "9");
                        max++;
                    }                }
                else{
                    numField.setText("9");
                    op=false;
                    eqop=false;
                    dec=false;
                    max=1;
                    
                }
            }
        });
        btn0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(op==false&&eqop==false) {
                    if(checkMax()) {
                        numField.setText(numField.getText() + "0");
                        max++;
                    }                }
                else{
                    numField.setText("0");
                    op = false;
                    eqop=false;
                    dec=false;
                    max=1;
                }
            }
        });
        btnDec.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                //if btnDec is pressed and dec is true, nothing should happen
                if(op==false&&eqop==false&&dec==false) {
                    numField.setText(numField.getText() + ".");
                    dec=true;
                }
                else if (dec==false){
                    numField.setText("0.");
                    op = false;
                    eqop=false;
                    dec=true;
                }
                
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (numField!=null){
                    //if the last button pressed was
                    // not an operation(meaning it was a number), perform any lingering operation
                    if((eq==false&&op==false)) {

                        //if the operation pressed before the + was a -
                        if (sub2 == true) {
                            //print result of sub operation in the text field
                            numField.setText(val1 - Float.parseFloat(numField.getText() + "") + "");
                            //save the result of the operation
                            val1 = Float.parseFloat(numField.getText() + "");
                            //turn off subtraction flag
                            sub2 = false;
                            //turn on 'last button pressed was an op' flag
                            op = true;
                            //turn on addition flag
                            add2 = true;
                        }
                        //same logic for other operands
                        else if (div2 == true) {
                            numField.setText(val1 / Float.parseFloat(numField.getText() + "") + "");
                            val1 = Float.parseFloat(numField.getText() + "");
                            div2 = false;
                            op = true;
                            add2=true;
                        } else if (mult2 == true) {
                            numField.setText(val1 * Float.parseFloat(numField.getText() + "") + "");
                            val1 = Float.parseFloat(numField.getText() + "");
                            mult2 = false;
                            op = true;
                            add2=true;
                        }
                        //if it is the first time pressing add in this calculation, will not execute the operation, just switch flags
                        else if (add2 == false) {
                            val1 = Float.parseFloat(numField.getText() + "");
                            op = true;
                            add2 = true;
                        } else {
                            numField.setText(val1 + Float.parseFloat(numField.getText() + "") + "");
                            val1 = Float.parseFloat(numField.getText() + "");
                            op = true;
                            add2 = true;
                        }
                    }
                    else{
                        /*avoids performing operands on the produced text field contents printed by an op
                        still switches flags*/
                        val1 = Float.parseFloat(numField.getText() + "");
                        op = true;
                        add2 = true;
                        eq=false;
                        sub2=false;
                        div2=false;
                        mult2=false;
                    }
                }
                else {
                    numField.setText("");
                }
            }
        });
        //rest of operands have the same logic
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (numField!=null){
                    if((eq==false&&op==false)) {
                        if (add2 == true) {
                            numField.setText(val1 + Float.parseFloat(numField.getText() + "") + "");
                            val1 = Float.parseFloat(numField.getText() + "");
                            add2 = false;
                            op = true;
                            sub2=true;
                        } else if (div2 == true) {
                            numField.setText(val1 / Float.parseFloat(numField.getText() + "") + "");
                            val1 = Float.parseFloat(numField.getText() + "");
                            div2 = false;
                            op = true;
                            sub2=true;
                        } else if (mult2 == true) {
                            numField.setText(val1 * Float.parseFloat(numField.getText() + "") + "");
                            val1 = Float.parseFloat(numField.getText() + "");
                            mult2 = false;
                            op = true;
                            sub2=true;
                        } else if (sub2==false){
                            val1 = Float.parseFloat(numField.getText() + "");
                            op = true;
                            sub2 = true;
                        } else{
                            numField.setText(val1 - Float.parseFloat(numField.getText() + "") + "");
                            val1 = Float.parseFloat(numField.getText() + "");
                            op = true;
                            sub2 = true;
                        }
                    }
                    else{
                        val1 = Float.parseFloat(numField.getText() + "");
                        op = true;
                        sub2 = true;
                        eq=false;
                        add2=false;
                        div2=false;
                        mult2=false;
                    }
                }
                else {
                    numField.setText("");
                }
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (numField!=null){
                    if((eq==false&&op==false)) {
                        if (add2 == true) {
                            numField.setText(val1 + Float.parseFloat(numField.getText() + "") + "");
                            val1 = Float.parseFloat(numField.getText() + "");
                            add2 = false;
                            op = true;
                            div2=true;
                        } else if (sub2 == true) {
                            numField.setText(val1 - Float.parseFloat(numField.getText() + "") + "");
                            val1 = Float.parseFloat(numField.getText() + "");
                            sub2 = false;
                            op = true;
                            div2=true;
                        } else if (mult2 == true) {
                            numField.setText(val1 * Float.parseFloat(numField.getText() + "") + "");
                            val1 = Float.parseFloat(numField.getText() + "");
                            mult2 = false;
                            op = true;
                            div2=true;
                        } else if (div2 == false) {
                            val1 = Float.parseFloat(numField.getText() + "");
                            op = true;
                            div2 = true;
                        } else{
                            numField.setText(val1 / Float.parseFloat(numField.getText() + "") + "");
                            val1 = Float.parseFloat(numField.getText() + "");
                            op = true;
                            div2 = true;
                        }
                    }
                    else{
                        val1 = Float.parseFloat(numField.getText() + "");
                        op = true;
                        div2 = true;
                        eq=false;
                        add2=false;
                        sub2=false;
                        mult2=false;
                    }
                }
                else {
                    numField.setText("");
                }
            }
        });
        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (numField!=null){
                    if((eq==false&&op==false)) {
                        if (add2 == true) {
                            numField.setText(val1 + Float.parseFloat(numField.getText() + "") + "");
                            val1 = Float.parseFloat(numField.getText() + "");
                            add2 = false;
                            op = true;
                            mult2=true;
                        } else if (div2 == true) {
                            numField.setText(val1 / Float.parseFloat(numField.getText() + "") + "");
                            val1 = Float.parseFloat(numField.getText() + "");
                            div2 = false;
                            op = true;
                            mult2=true;
                        } else if (sub2 == true) {
                            numField.setText(val1 - Float.parseFloat(numField.getText() + "") + "");
                            val1 = Float.parseFloat(numField.getText() + "");
                            sub2 = false;
                            op = true;
                            mult2=true;
                        } else if (mult2==false) {
                            val1 = Float.parseFloat(numField.getText() + "");
                            op = true;
                            mult2 = true;
                        } else {
                            numField.setText(val1 * Float.parseFloat(numField.getText() + "") + "");
                            val1 = Float.parseFloat(numField.getText() + "");
                            op = true;
                            mult2 = true;
                        }
                    }
                    else{
                        val1 = Float.parseFloat(numField.getText() + "");
                        op = true;
                        mult2 = true;
                        eq=false;
                        add2=false;
                        sub2=false;
                        div2=false;
                    }
                }
                else {
                    numField.setText("");
                }
            }
        });
        btnEq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val2 = Float.parseFloat(numField.getText() + "");
                //condition for ignoring if an op was pressed right before the equals button
                if(op==true){
                    if(div2==true||mult2==true){
                        val2=1;
                    }
                    else {
                        val2 = 0;
                    }
                }
                //conditions for if op is valid for execution (pressed in the correct order)
                if(add2==true){
                    numField.setText(val1+val2+"");
                    val1=Float.parseFloat(numField.getText()+"");
                    add2=false;
                }
                if(sub2==true){
                    numField.setText(val1-val2+"");
                    val1=Float.parseFloat(numField.getText()+"");
                    sub2=false;
                }
                if(mult2==true){
                    numField.setText(val1*val2+"");
                    val1=Float.parseFloat(numField.getText()+"");
                    mult2=false;
                }
                if(div2==true){
                    numField.setText(val1/val2+"");
                    val1=Float.parseFloat(numField.getText()+"");
                    div2=false;
                }
                eq=true;
                eqop=true;
            }
        });
        //reset everything except eqop so that when a number is pressed it will overwrite the printed 0
        //(eqop is only for number presses anyways)
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numField.setText("0");
                val1=0;
                mem=0;
                op=false;
                eqop=true;
                eq=false;
                add2=false;
                sub2=false;
                div2=false;
                mult2=false;
            }
        });
        //reset memory value and stop current calculation
        //(wasn't sure if stopping the calculation was necessary but would be an easy fix if it was not)
        btnMC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                op=false;
                add2=false;
                sub2=false;
                div2=false;
                mult2=false;
                eq=false;
                mem=0;
            }
        });
        //set numField to memory value, switch eqop flag so the next inputted number
        // overwrites the mem vlaue on the numField (as before)
        btnMR.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                numField.setText(Float.toString(mem));
                eqop=true;
            }
        });
        //add numField value to memory, toggle op for same reason as eqop above
        btnMAdd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (numField.getText() != null) {
                    mem = mem + Float.parseFloat(numField.getText() + "");
                    op=true;
                }
            }
        });
        //same logic as btnMAdd
        btnMSub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (numField.getText() != null) {
                    mem = mem - Float.parseFloat(numField.getText() + "");
                    op=true;
                }
            }
        });
        //set value to current * -1, operand logic pulls val1 from numField so no need to redefine it
        btnPM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numField.setText(Float.toString(Float.parseFloat(numField.getText()+"")*(-1)));
            }
        });


    }
    public boolean checkMax(){
        if(max>=10){
            return false;
        }
        return true;
    }
}
