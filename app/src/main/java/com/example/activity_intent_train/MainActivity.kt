package com.example.activity_intent_train

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickSendMsg(view: View) {
        val intent = Intent(this, ReceiveMessageActivity::class.java)
        startActivity(intent)
    }
}