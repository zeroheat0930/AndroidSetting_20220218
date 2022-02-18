package com.zeroheat.androidsetting_20220218

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

//         화면 이동 ~ 로딩화면 종료를, 2.5초 후에 실행시키고 싶다.
//          UI 동작을 담당하는 쓰레드에게, 2.5초 후에 > 이동 코드를 실행시켜달라고 등록하자.
//        등록 해주는 클래스 - Handler

        val myHandler = Handler( Looper.getMainLooper() ) //메인 쓰레드와 통신하는 핸들러 생성
        myHandler.postDelayed( {

            val myIntent = Intent(this,MainActivity::class.java)
            startActivity(myIntent)

//        화면을 이동하고 나면, 로딩화면은 닫아주자.
            finish()

        }, 2500)



    }
}