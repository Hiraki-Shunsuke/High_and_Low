package com.example.highandlow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.view.ViewManager
import android.widget.Button

class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        val btnIntent = findViewById<Button>(R.id.gameStart)
        btnIntent.setOnClickListener (object : View.OnClickListener {
            override fun onClick(v: View?) {
                val intent = Intent(this@StartActivity, MainActivity::class.java)
                startActivity(intent)
            }
        })
        val btnFinished = findViewById<Button>(R.id.btn_exit)
        btnFinished.setOnClickListener (object : View.OnClickListener {
            override fun onClick(v: View?) {
                finish();
            }
        });
    }
}
