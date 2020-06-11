package com.heisenburg.walpaperkotlin.model

import java.io.File

class FileStateModel {
    companion object{
        const val SUCCESSFULL = 200
        const val UNAUTHORIZED = 401

    }


    private var code = 0

    private var file: File? = null

    fun FileStateModel(code: Int) {
        this.code = code
    }

}