package com.example.rlaxotlr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class Sub2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub2)



        var x = arrayOf(1, 2, 3, 4, 5)
        var y = arrayOf(1, 2, 3, 4, 5)
        var z= arrayOf(1,2,3,4,5)
        var i : Int = 0
        val plus_btn: Button = findViewById(R.id.plus_btn)
        plus_btn.setOnClickListener {
            i++;
        }

        val btn_a: Button = findViewById(R.id.btn_a)
        btn_a.setOnClickListener {
            val intent = Intent(this, SubActivity::class.java)
            intent.putExtra("세트", Set(x[i],y[i],z[i]))
            startActivity(intent)


        }


    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == 98 && resultCode == 99) {
//            Log.d("태그", data?.getParcelableExtra<Exercise_kind>("운동").toString())
        }
    }
}