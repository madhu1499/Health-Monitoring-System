package com.example.currencyconverter;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button7;
    Button button6;
    EditText editText;
    EditText editText2;
    EditText editText3;
    EditText editText4;

    public void convert(View view)
    {
        int flag=0;
         editText=(EditText) findViewById(R.id.editText);
         editText2=(EditText) findViewById(R.id.editText2);
         editText3=(EditText) findViewById(R.id.editText3);
         editText4=(EditText) findViewById(R.id.editText4);
        textView =(TextView) findViewById(R.id.textView2);
        int a= Integer.parseInt(editText2.getText().toString());
        //int b= Integer.parseInt(editText3.getText().toString());
        String bp=editText3.getText().toString();
        String first="";
        String second="";

        for(int i=0;i<bp.length();i++)
        {

            if(bp.charAt(i)=='/')
            {
              flag=1;
              continue;
            }
            if(flag==0)
            {
                first+=bp.charAt(i);
            }
            else if(flag==1)
            {
                second+=bp.charAt(i);
            }
        }
        int bp1=Integer.parseInt(first);
        int bp2=Integer.parseInt(second);

        int c= Integer.parseInt(editText4.getText().toString());
        int d= Integer.parseInt(editText.getText().toString());
        flag=0;

        if(d<=100&&d>=60)
        {
            button2.setBackgroundColor(Color.GREEN);
        }
        else
        {
            flag=1;
            button2.setBackgroundColor(Color.RED);

        }
        if(a>=97&&a<=99)
        {
            button4.setBackgroundColor(Color.GREEN);
        }
        else
        {
            flag=1;
            button4.setBackgroundColor(Color.RED);
        }
        if(c>=135&&c<=145)
        {
            button3.setBackgroundColor(Color.GREEN);
        }
        else
        {
            flag=1;
            button3.setBackgroundColor(Color.RED);
        }
        if(bp1<=120&&bp1>=90&&bp2<=80&&bp2>=60)
        {
            button5.setBackgroundColor(Color.GREEN);
        }
        else
        {
            flag=1;
            button5.setBackgroundColor(Color.RED);
        }
        button5.setVisibility(View.VISIBLE);
        button2.setVisibility(View.VISIBLE);
        button3.setVisibility(View.VISIBLE);
        button4.setVisibility(View.VISIBLE);
        button7.setVisibility(View.VISIBLE);
        if(flag==1)
        {
            textView.setText("Status:Unhealthy.Consult a doctor");
            button6.setVisibility(View.VISIBLE);
        }
        else
        {
            textView.setText("Status:Normal");


        }


        int val = Integer.parseInt(editText.getText().toString() );
        textView.setVisibility(View.VISIBLE);
       // Toast.makeText(this, "Amount in Rs "+(69*val), Toast.LENGTH_SHORT).show();

    }
    public void clear(View view)
    {
        editText.setText("");
        editText2.setText("");
        editText3.setText("");
        editText4.setText("");
        button5.setVisibility(View.INVISIBLE);
        button2.setVisibility(View.INVISIBLE);
        button3.setVisibility(View.INVISIBLE);
        button4.setVisibility(View.INVISIBLE);
        textView.setVisibility(View.INVISIBLE);
        button6.setVisibility(View.INVISIBLE);

    }
    public void sendReport(View view)
    {
        Toast.makeText(this, "Report Sent", Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView) findViewById(R.id.textView2);
        button2 =(Button) findViewById(R.id.button2);
        button3 =(Button) findViewById(R.id.button3);
        button4 =(Button) findViewById(R.id.button4);
        button5 =(Button) findViewById(R.id.button5);
        button6=(Button) findViewById(R.id.button6);
        button7=(Button) findViewById(R.id.button7);
        button5.setVisibility(View.INVISIBLE);
        button2.setVisibility(View.INVISIBLE);
        button3.setVisibility(View.INVISIBLE);
        button4.setVisibility(View.INVISIBLE);
        button6.setVisibility(View.INVISIBLE);
        button7.setVisibility(View.INVISIBLE);
        textView.setVisibility(View.INVISIBLE);

    }
}
