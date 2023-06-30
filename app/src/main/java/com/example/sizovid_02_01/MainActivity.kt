package com.example.sizovid_02_01

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var login : EditText
    lateinit var  password : EditText
    lateinit var button: Button
    lateinit var sharePref : SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        login = findViewById(R.id.win1_et_login)
        password = findViewById(R.id.win1_et_password)
        button = findViewById(R.id.win1_but_reg)
        sharePref = getSharedPreferences("ACCAUNT", MODE_PRIVATE)

        if(sharePref.contains("LOGIN") && sharePref.contains("PASSWORD"))
        {
            var log = sharePref.getString("LOGIN", "NONE")
            var pass = sharePref.getString("PASSWORD", "NONE")
            login.setText(log)
            password.setText(pass)
        }

        button.setOnClickListener{

        }
    }

}