package com.min.myapp01

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var btnNate: Button //Button btnNate << 자바식으로 표현 했을때
    lateinit var btn911: Button
    lateinit var btnGal: Button
    lateinit var btnEnd: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnNate = findViewById<Button>(R.id.btnNate)
        btn911 = findViewById<Button>(R.id.btn911)
        btnGal = findViewById<Button>(R.id.btnGal)
        btnEnd = findViewById<Button>(R.id.btnEnd)

        btnNate.setOnClickListener() {   // setOnClickListener == 버튼 클릭 시  수행할 동작을 지정하는 리스너
            val mIntent = Intent(       // 자바의 모델 같은 역할 코틀린 에서는 클래스를 옮길떄 객체를 만들면 됨
                Intent.ACTION_VIEW,
                Uri.parse("http://m.nate.com")
            )
            startActivity(mIntent)  //startActivity = 실행
        }

    }
}