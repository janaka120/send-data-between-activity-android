package com.example.sensdingdataapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    lateinit var tvName: TextView
    lateinit var tvEmail: TextView
    lateinit var tvPhone: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        tvEmail = findViewById(R.id.textViewEmail)
        tvName = findViewById(R.id.textViewName)
        tvPhone = findViewById(R.id.textViewPhone)
        val name = intent.getStringExtra("name").toString()
        val email = intent.getStringExtra("email").toString()
        val phone = intent.getStringExtra("phone").toString()
        tvName.text = "Hello $name"
        tvEmail.text = "Your email: $email"
        tvPhone.text = "Your phone $phone"
    }
}