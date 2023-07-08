package com.example.sensdingdataapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    lateinit var etName: TextInputEditText
    lateinit var etPhone: TextInputEditText
    lateinit var etEmail: TextInputEditText
    lateinit var signup: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etName = findViewById(R.id.editTextName)
        etPhone = findViewById(R.id.editTextPhone)
        etEmail = findViewById(R.id.editTextEmail)

        signup = findViewById(R.id.buttonSignup)

        signup.setOnClickListener {
            val name: String = etName.text.toString()
            val phone: String = etPhone.text.toString()
            val email: String = etEmail.text.toString()

            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            intent.putExtra("name", name)
            intent.putExtra("email", email)
            intent.putExtra("phone", phone)
//
            startActivity(intent)
        }
    }

}