package com.jay.psgmatchpredictor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_result.*
import kotlinx.android.synthetic.main.activity_splash.*

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        supportActionBar?.hide()

        pl.animate().translationY(-2500f).setDuration(3500)
        author.animate().translationY(-750f).setDuration(4000)
        jl.animate().translationY(780f).setDuration(4000)
        Handler().postDelayed({
                              val intent = Intent(this,Registration::class.java)
            finish()
            startActivity(intent)
        },5000)

        //734-492
        //740-392
    }
}