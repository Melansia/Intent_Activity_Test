package com.example.activity_intent_train

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var etEnterMessage: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etEnterMessage = findViewById(R.id.etEnterMessage)

    }

    fun onClickSendMsg(view: View) {
        val message = etEnterMessage.text.toString()
        val intent = Intent(this, ReceiveMessageActivity::class.java)
        intent.putExtra("msg", message)
        startActivity(intent)
    }
}