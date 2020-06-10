package com.heisenburg.walpaperkotlin.model

import java.io.File

class FileStateModel {
    var SUCCESSFULL = 200
    var UNAUTHORIZED = 401

    private var code = 0

    private var file: File? = null

    fun FileStateModel(code: Int) {
        this.code = code
    }

}