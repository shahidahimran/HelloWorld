package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//Making changes to code by adding this line
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}