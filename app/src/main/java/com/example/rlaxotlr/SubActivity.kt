package com.example.rlaxotlr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)



        var x = arrayOf(1, 2, 3, 4, 5)
        var y = arrayOf(1, 2, 3, 4, 5)
        var i : Int = 3
        val btn_a: Button = findViewById(R.id.btn_a)
        btn_a.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("세트", Data(x[i],y[i]))
            i++
            startActivity(intent)


        }


    }




}