package com.jigsaw.scpi_kt

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jigsaw.lib.SimpleSCPIParser

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myParser = SimpleSCPIParser()
        for (result in myParser.accept("*IDN?")) {
            println(result)
        }
    }
}
