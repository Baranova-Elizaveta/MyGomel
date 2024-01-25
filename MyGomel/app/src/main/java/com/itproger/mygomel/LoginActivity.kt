package com.itproger.mygomel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatTextView

class LoginActivity : AppCompatActivity() {

    private lateinit var goSignPage : AppCompatTextView
    private lateinit var goLocationPage : AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        goSignPage = findViewById(R.id.go_sign_up_user)

        goSignPage.setOnClickListener{
            val intent = Intent(this@LoginActivity, SignUserActivity :: class.java)
            startActivity(intent)
            finish()
        }

        goLocationPage = findViewById(R.id.button3)

        goLocationPage.setOnClickListener{
            val intent = Intent(this@LoginActivity, LocationActivity :: class.java)
            startActivity(intent)
            finish()
        }
    }
}