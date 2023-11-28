package com.example.rlaxotlr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btn: Button = findViewById(R.id.btn)
        btn.setOnClickListener {
            val intent = Intent(this, SubActivity::class.java)
            startActivity(intent)


        }

        var intent:Intent=getIntent()
        var kame = intent.getParcelableExtra("세트", Data::class.java)
//        if (intent.hasExtra("세트")) {
//            var kname = intent.getParcelableExtra("세트")
//            /* "nameKey"라는 이름의 key에 저장된 값이 있다면
//               textView의 내용을 "nameKey" key에서 꺼내온 값으로 바꾼다 */
//
//        }
        val textView : TextView = findViewById(R.id.textView)
        val textView1 : TextView = findViewById(R.id.textView1)

        if (kame != null) {
            textView.text=kame.weight.toString()
        }
        if (kame != null) {
            textView1.text=kame.num.toString()
        }


    }
}