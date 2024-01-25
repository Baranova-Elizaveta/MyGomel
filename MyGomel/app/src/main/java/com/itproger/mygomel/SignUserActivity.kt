package com.itproger.mygomel

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView

class SignUserActivity : AppCompatActivity() {

    private lateinit var goLoginPage : AppCompatTextView
    private lateinit var goLocationPage : AppCompatButton

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_user)

        goLoginPage = findViewById(R.id.go_user_login)

        goLoginPage.setOnClickListener{
            val intent = Intent(this@SignUserActivity, LoginActivity :: class.java)
            startActivity(intent)
            finish()
        }

        goLocationPage = findViewById(R.id.button3)

        goLocationPage.setOnClickListener{
            val intent = Intent(this@SignUserActivity, LocationActivity :: class.java)
            startActivity(intent)
            finish()
        }

    }
}