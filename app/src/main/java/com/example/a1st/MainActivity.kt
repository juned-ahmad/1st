package com.example.a1st

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val upload=findViewById<Button>(R.id.btnup)
        val download=findViewById<Button>(R.id.btndown)
        upload.setOnClickListener {
            Toast.makeText(applicationContext,"Uploading",Toast.LENGTH_SHORT).show()
            download.setOnClickListener{
                Toast.makeText(applicationContext,"Downloading",Toast.LENGTH_SHORT).show()
            }
        }


    }
}