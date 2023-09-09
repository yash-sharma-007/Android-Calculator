package com.example.simplecalculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.simplecalculator.ui.theme.SimpleCalculatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val plus = findViewById<Button>(R.id.btnAdd)
        plus.setOnClickListener {
            val input1 = findViewById<EditText>(R.id.input1).text.toString().toInt()
            val input2 = findViewById<EditText>(R.id.input2).text.toString().toInt()
            findViewById<TextView>(R.id.result).text = (input1+input2).toString()

        }

        val minus = findViewById<Button>(R.id.btnSubtract)
        minus.setOnClickListener {
            val input1 = findViewById<EditText>(R.id.input1).text.toString().toInt()
            val input2 = findViewById<EditText>(R.id.input2).text.toString().toInt()
            findViewById<TextView>(R.id.result).text = (input1-input2).toString()

        }

        val multiply = findViewById<Button>(R.id.btnMul)
        multiply.setOnClickListener {
            val input1 = findViewById<EditText>(R.id.input1).text.toString().toInt()
            val input2 = findViewById<EditText>(R.id.input2).text.toString().toInt()
            findViewById<TextView>(R.id.result).text = (input1*input2).toString()

        }

        val divison = findViewById<Button>(R.id.btnDiv)
        divison.setOnClickListener {
            val input1 = findViewById<EditText>(R.id.input1).text.toString().toInt()
            val input2 = findViewById<EditText>(R.id.input2).text.toString().toInt()
            findViewById<TextView>(R.id.result).text = (input1/input2).toFloat().toString()

        }

    }
}