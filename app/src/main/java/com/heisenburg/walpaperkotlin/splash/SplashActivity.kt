package com.heisenburg.walpaperkotlin.splash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.heisenburg.walpaperkotlin.R
import com.heisenburg.walpaperkotlin.manager.AppActivityManager
import com.heisenburg.walpaperkotlin.repository.Repository

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler().postDelayed(Runnable {
            AppActivityManager.gotoMainActivity(this)
        }, 500)
    }
}
