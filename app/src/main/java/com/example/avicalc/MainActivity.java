package com.example.avicalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.*;

public class MainActivity extends AppCompatActivity {

    TextView tv,tv2;
    ImageButton bx,bclear,b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bpow,broot,bdiv,bmulti,bminus,badd,beq;
    Button bdot;
    double a=0,b=0,opt=0;
    int multi=0,add=0,minus=0,div=0,dot=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);
        b0=findViewById(R.id.b0);
        tv2=findViewById(R.id.tv2);
        bdiv=findViewById(R.id.bdiv);
        bmulti=findViewById(R.id.bmulti);
        bminus=findViewById(R.id.bminus);
        badd=findViewById(R.id.badd);
        bdot=findViewById(R.id.bdot);
        bclear=findViewById(R.id.bclear);
        broot=findViewById(R.id.broot);
        bpow=findViewById(R.id.bpow);
        bx=findViewById(R.id.bx);
        beq=findViewById(R.id.beq);
        tv=findViewById(R.id.tv);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*a=Integer.parseInt(tv.getText().toString());
                tv.setText(a+"1");*/
                tv.setText(tv.getText()+"1");

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText()+"2");

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText()+"3");

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText()+"4");

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText()+"5");

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText()+"6");

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText()+"7");

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText()+"8");

            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText()+"9");

            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText()+"0");

            }
        });
        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=Float.parseFloat(tv.getText().toString());
                tv2.setText(a+"+");
                add=1;
                tv.setText("");
                dot=0;

            }
        });
        bminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=Float.parseFloat(tv.getText().toString());
                tv2.setText(a+"-");
                minus=1;
                tv.setText("");
                dot=0;

            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=Float.parseFloat(tv.getText().toString());
                tv2.setText(a+"/");
                div=1;
                tv.setText("");
                dot=0;

            }
        });
        bmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tv.getText()!="") {
                    a = Float.parseFloat(tv.getText().toString());
                    tv2.setText(a + "*");
                    multi = 1;
                    tv.setText("");
                    dot = 0;
                }
                else
                    Toast.makeText(MainActivity.this, "Field Empty...", Toast.LENGTH_SHORT).show();

            }
        });
       broot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=Float.parseFloat(tv.getText().toString());
                a=Math.sqrt(a);
                tv.setText(a+"");

            }
        });
        bpow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=Float.parseFloat(tv.getText().toString());
                a=a*a;
                tv.setText(a+"");

            }
        });
        beq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tv.getText()!=null){
                    if(multi==1)
                    {
                        b=Float.parseFloat(tv.getText().toString());
                        opt=a*b;
                        tv.setText(opt+"");
                        tv2.setText(tv2.getText().toString()+b+"");
                    }
                    else if(div==1)
                    {
                        b=Float.parseFloat(tv.getText().toString());
                        opt=a/b;
                        tv.setText(opt+"");
                        tv2.setText(tv2.getText().toString()+b+"");
                    }
                    else if(minus==1)
                    {
                        b=Float.parseFloat(tv.getText().toString());
                        opt=a-b;
                        tv.setText(opt+"");
                        tv2.setText(tv2.getText().toString()+b+"");
                    }
                    else
                    {
                        b=Float.parseFloat(tv.getText().toString());
                        opt=a+b;
                        tv.setText(opt+"");
                        tv2.setText(tv2.getText().toString()+b+"");
                    }
                }
                else{
                    tv.setText("No Input");
                }
                dot=0;
                multi=0;add=0;minus=0;div=0;

            }
        });
        bclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("");
                tv2.setText("");
                dot=0;

            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (dot == 0)
                {
                    tv.setText(tv.getText() + ".");
                    dot = 1;
                }

            }});
        bx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if (tv.getText()!=""){
                    String str = tv.getText().toString();
                    str = str.substring(0, str.length() - 1);
                    tv.setText(str);
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Please enter a number", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
