package com.example.rlaxotlr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)



        var intent:Intent=getIntent()
        var ame  = ArrayList<Set>()
//        kame.add(Set(0,0,0))
        var kname= intent.getParcelableExtra("세트", Set::class.java)
        if (kname != null) {
        ame.add(kname)
        }


//        if (intent.hasExtra("세트")) {
//            var kname = intent.getParcelableExtra("세트")
//            /* "nameKey"라는 이름의 key에 저장된 값이 있다면
//               textView의 내용을 "nameKey" key에서 꺼내온 값으로 바꾼다 */
//
        

        var i :Int =1

        var exercise_name = arrayListOf<String>("벤치프레스","렛풀다운","스쿼트")
        val btn_b: Button = findViewById(R.id.btn_b)
        btn_b.setOnClickListener {
            val nextintent = Intent(this, MainActivity::class.java)
            nextintent.putExtra("운동", Exercise_kind(Sets = ame, exercise_name = exercise_name[i]))
//            nextintent.putExtra("number", 12345)


            startActivity(nextintent)
//            setResult(99, nextintent)
//
//            finish()
        }


    }




}