package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.example.calculator.models.Calculator

class MainActivity : AppCompatActivity() {

    lateinit var edtNumber1:EditText
    lateinit var edtNumber2:EditText

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtNumber1 = findViewById(R.id.edtNum1)
        edtNumber2 = findViewById(R.id.edtNum2)


    }

    fun buttonClick(v:View)
    {
        var answer = 0.0

        val calculator = Calculator(
            edtNumber1.text.toString().toDouble(),
            edtNumber2.text.toString().toDouble()
        )

        when(v.id)
        {
            R.id.btnAdd -> answer = calculator.add()
            R.id.btnSub -> answer = calculator.subtract()
            R.id.btnMul -> answer = calculator.multiply()
            R.id.btnDiv -> answer = calculator.divide()

        }

        Toast.makeText(this,"Answer = $answer", Toast.LENGTH_LONG).show()
    }


}