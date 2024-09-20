package com.example.lab14real

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
                   ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
                val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val doobS = listOf("Д", "д", "D", "d")
        val dooPole : TextInputEditText = findViewById(R.id.textedit)
        val dooB: Button = findViewById(R.id.button)

        dooB.setOnClickListener {
            if ("${dooPole.text}" in doobS){
                Toast.makeText(this@MainActivity, "${dooPole.text} - это дуб!", LENGTH_SHORT).show()
            }
            else Toast.makeText(this@MainActivity, "Нет, это не дуб!", LENGTH_SHORT).show()
        }
    }
}