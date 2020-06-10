package com.heisenburg.walpaperkotlin.executor

import java.util.concurrent.Executors

class Executor {
    companion object {
        fun execute(runnable: Runnable?) {
            val executorService =
                Executors.newFixedThreadPool(4)
            executorService.execute(runnable)
        }

    }


}