package com.example.layoutconst

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tela_coffe)

        if (supportActionBar != null) {
            supportActionBar!!.hide() }


    }
}
