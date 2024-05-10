package com.example.pdfapp

data class PdfFile(val fileName: String, val downloadUrl: String){
    constructor(): this("","")
}
