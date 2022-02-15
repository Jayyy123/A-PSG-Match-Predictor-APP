package com.jay.psgmatchpredictor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_registration.*

class Registration : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
        supportActionBar?.hide()

        user.animate().translationY(1400f).setDuration(1000)
        pass.animate().translationY(1300f).setDuration(1000)
        loginB.animate().translationY(-900f).setDuration(1500)

        titL.animate().translationX(910f).setDuration(2000)

        loginB.setOnClickListener {
            val a = user.text.toString()
            Log.d(Hi, a)
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(HEllO,a)
            startActivity(intent)
        }

    }
}