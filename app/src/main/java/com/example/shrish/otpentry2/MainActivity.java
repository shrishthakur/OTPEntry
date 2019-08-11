package com.example.shrish.otpentry2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    String t1;String t2,t3,t4,t5,t6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            final EditText ed1=(EditText)findViewById(R.id.text1);
            final  EditText ed2=(EditText)findViewById(R.id.text2);
             final   EditText ed3=(EditText)findViewById(R.id.text3);
            final       EditText ed4=(EditText)findViewById(R.id.text4);
            final       EditText ed5=(EditText)findViewById(R.id.text5);
           final        EditText ed6=(EditText)findViewById(R.id.text6);

           final Button b =(Button)findViewById(R.id.butt);
         //  final Button b2 = (Button)findViewById(R.id.butt2);
           final LinearLayout ll = (LinearLayout)findViewById(R.id.ll);


        ed1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

                Integer l1 = ed1.getText().length();
                t1=ed1.getText().toString();

                if(l1 >= 1)
                {
                    ed2.requestFocus();
                }

            }
        });

        ed2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {


                Integer l2 = ed2.getText().length();
                t2=ed2.getText().toString();
                if(l2 >= 1)
                {
                    ed3.requestFocus();
                }
                else if (l2==0)
                {
                    ed1.requestFocus();
                }
            }

        });

         ed3.addTextChangedListener(new TextWatcher() {
             @Override
             public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

             }

             @Override
             public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

             }

             @Override
             public void afterTextChanged(Editable editable) {

                 Integer l3 = ed3.getText().length();

                 t3= ed3.getText().toString();
                 if(l3 >= 1)
                 {
                     ed4.requestFocus();
                 }
                 else if (l3==0)
                 {
                     ed2.requestFocus();
                 }


             }
         });

         ed4.addTextChangedListener(new TextWatcher() {
             @Override
             public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

             }

             @Override
             public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

             }

             @Override
             public void afterTextChanged(Editable editable) {

                 Integer l4 = ed4.getText().length();

                 t4= ed4.getText().toString();
                 if(l4 >= 1)
                 {
                     ed5.requestFocus();
                 }
                 else if (l4==0)
                 {
                     ed3.requestFocus();
                 }

             }
         });

         ed5.addTextChangedListener(new TextWatcher() {
             @Override
             public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {


             }

             @Override
             public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

             }

             @Override
             public void afterTextChanged(Editable editable) {

                 Integer l5 = ed5.getText().length();

                 t5=ed5.getText().toString();
                 if(l5 >= 1)
                 {
                     ed6.requestFocus();
                 }
                 else if (l5==0)
                 {
                     ed4.requestFocus();
                 }

             }
         });

         ed6.addTextChangedListener(new TextWatcher() {
             @Override
             public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

             }

             @Override
             public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

             }

             @Override
             public void afterTextChanged(Editable editable) {

                 Integer l6 = ed6.getText().length();
                 t6=ed6.getText().toString();
                 if(l6==0)
                 {
                     ed5.requestFocus();
                 }

             }
         });

         b.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {

                 String str = t1+t2+t3+t4+t5+t6;

                 if(str.equals("123456"))
                 {
                     Toast.makeText(MainActivity.this, "SUCCESS", Toast.LENGTH_SHORT).show();
                 }
                 else
                 {
                     Toast.makeText(MainActivity.this, "Failure", Toast.LENGTH_SHORT).show();

                     ed1.setText(null);
                     ed2.setText(null);
                     ed3.setText(null);
                     ed4.setText(null);
                     ed5.setText(null);
                     ed6.setText(null);

                     ed1.requestFocus();
                 }

             }
         });

        /* b2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {

                 EditText x = (EditText)ll.getFocusedChild();
                 Integer y = x.findFocus()

             }
         });*/
    }

}
