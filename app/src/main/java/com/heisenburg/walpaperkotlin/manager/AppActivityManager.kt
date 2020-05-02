package com.heisenburg.walpaperkotlin.manager

import android.app.Activity
import android.content.Intent
import com.heisenburg.walpaperkotlin.MainActivity

class AppActivityManager {

    companion object {

        fun gotoMainActivity(activity: Activity) {
            val intent = Intent(activity, MainActivity::class.java);
            activity.startActivity(intent);
        }

    }
}