package com.example.colouredtoastkot22

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bt=findViewById<Button>(R.id.button)
        bt.setOnClickListener {
            val mtoast = Toast.makeText(this@MainActivity, "this is toast..", Toast.LENGTH_SHORT)
            mtoast.view?.setBackgroundResource(R.drawable.toast_background)
            mtoast.view?.findViewById<TextView>(android.R.id.message)
                ?.setTextColor(Color.parseColor("#FFFFFF"))
            mtoast.show()

        }
    }
}