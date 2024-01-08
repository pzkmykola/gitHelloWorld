package com.example.githelloworld_lh10

import android.app.Activity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.Toast

class MainActivity:Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        val button:Button = findViewById(R.id.myButton)
        button.setOnClickListener {
            val toast = Toast.makeText(this, "Button pressed!", Toast.LENGTH_LONG)
            toast.show()
        }

    }

}