package com.example.belanja

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    private lateinit var inputUsername : TextView
    private lateinit var inputPassword : TextView
    private lateinit var buttonLogin : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        checkLogin()
    }

    private fun checkLogin() {
        inputUsername = findViewById(R.id.ev_username)
        inputPassword = findViewById(R.id.ev_password)

        val username = inputUsername
        val password = inputPassword

        buttonLogin = findViewById(R.id.btnLogin)
        buttonLogin.setOnClickListener {
            if (username.text.toString() != "Zaan") {
                Toast.makeText(applicationContext, "Ups, ${username.text.toString()} not registered", Toast.LENGTH_LONG).show()
            } else {
                if (password.text.toString() != "zanuk12345") {
                    Toast.makeText(applicationContext, "Ups, ${username.text.toString()} does not match password", Toast.LENGTH_LONG).show()
                } else {
                    Toast.makeText(applicationContext, "Welcome ${username.text.toString()}", Toast.LENGTH_LONG).show()
                    val intent = Intent(this, HomeActivity::class.java)
                    startActivity(intent)
                }
            }

        }
    }
}