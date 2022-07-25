package com.example.activity_intent_train

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ReceiveMessageActivity : AppCompatActivity() {

    private lateinit var tvMessageView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recive_message)

        tvMessageView = findViewById(R.id.tvMessageView)

        val msg = intent.getStringExtra("msg")
        tvMessageView.text = msg
    }
}