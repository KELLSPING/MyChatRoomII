package com.example.mychatroomii;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.firebase.auth.FirebaseAuth;

public class HomeActivity extends AppCompatActivity {

    FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        startActivity(new Intent(HomeActivity.this, LoginActivity.class));

//        if (auth.getCurrentUser() == null){
//            startActivity(new Intent(HomeActivity.this, LoginActivity.class));
//        }
    }
}