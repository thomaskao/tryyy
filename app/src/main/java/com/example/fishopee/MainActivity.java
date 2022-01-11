package com.example.fishopee;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import java.util.*;
import java.lang.*;
import java.io.*;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button enter,signup;
    private EditText user,password;

    String username1="123",userpassword1="456";

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enter = findViewById(R.id.btnenter);
        signup = findViewById(R.id.btnsignup);
        user = findViewById(R.id.edittext1);
        password = findViewById(R.id.edittext2);


        Toast.makeText(MainActivity.this,"歡迎來到魚皮購物\n請先登入",Toast.LENGTH_SHORT).show();


        enter.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {


                Bundle bundle = getIntent().getExtras().getBundle("key");
                String username1 = bundle.getString("name");
                String userpassword1 = bundle.getString("password");



                String userinput=user.getText().toString(),passwordinput=password.getText().toString();


                if((username1.equals(userinput))&&(userpassword1.equals(passwordinput))){
                    //     text.setText("登入成功");
                    Toast toast =  Toast.makeText(MainActivity.this, "登入成功", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.BOTTOM|Gravity.CENTER,0,0);   //靠中下
                    toast.show();
                    Intent intent12 = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(intent12);
                }

                else {
                    //       text.setText("帳號或密碼錯誤");

                    Toast toast1 =  Toast.makeText(MainActivity.this, "帳號或密碼錯誤", Toast.LENGTH_SHORT);
                    toast1.setGravity(Gravity.BOTTOM|Gravity.CENTER,0,0);   //靠中下
                    toast1.show();
                }

            }
        });

        signup.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intent2 = new Intent(MainActivity.this, MainActivity5.class);

                startActivity(intent2);

            }
        });



    }
    /*
    protected void onActivity  ( int requestCode, int resultCode, @Nullable Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        if (data == null) return;
          if (requestCode == 1) {
                  if (resultCode == 202) {
                Bundle bundle1 = data.getExtras();
                 String  username1 = bundle1.getString("name");
                 String   userpassword1 = bundle1.getString("password");


            }

        }
    }

     */

}