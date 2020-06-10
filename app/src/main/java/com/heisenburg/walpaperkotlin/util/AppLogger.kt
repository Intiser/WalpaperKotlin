package com.heisenburg.walpaperkotlin.util

import android.util.Log

class AppLogger {

    companion object {

        fun log(tag: String?, message: String) {
            Log.d(tag, "Logger: $message")
        }

    }

}