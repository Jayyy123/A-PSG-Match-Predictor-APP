package com.jay.psgmatchpredictor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = intent.getStringExtra(HEllO).toString()
        Log.d(Hi, name)
        Handler().postDelayed({
            welc.setText("Welcome back $name")
        }, 3000)

        entry.animate().translationY(-1600f).setDuration(2000)
        pV.animate().translationY(-700f).setDuration(3000)



    }
}