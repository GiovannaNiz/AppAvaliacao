package com.example.appavaliacao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnTeste: Button = findViewById(R.id.btnTeste)
        btnTeste.setOnClickListener { teste() }
    }
    private fun teste(){
        val edt01: EditText = findViewById(R.id.edt01)
        val edt02: EditText = findViewById(R.id.edt02)

        if (edt01.text.isNotEmpty() && edt02.text.isNotEmpty()){
            if (Integer.parseInt(edt01.text.toString()) > Integer.parseInt(edt02.text.toString())){
                Toast.makeText(this, "Campo 1 é maior que o Campo 2", Toast.LENGTH_SHORT).show()
            }else if (Integer.parseInt(edt01.text.toString()) == Integer.parseInt(edt02.text.toString())){
                Toast.makeText(this, "Campo 1 é igual ao Campo 2", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "Campo 2 é maior que o Campo 1", Toast.LENGTH_SHORT).show()
            }
        }else{
            Toast.makeText(this, "Preencha os dois campos", Toast.LENGTH_SHORT).show()
        }
    }
}