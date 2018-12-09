package com.lee.databindingexam

data class InputData(var title: String?, var inputText: String? = "default", var imageUrl: String?) {

    var imageVisible: Boolean = false
}