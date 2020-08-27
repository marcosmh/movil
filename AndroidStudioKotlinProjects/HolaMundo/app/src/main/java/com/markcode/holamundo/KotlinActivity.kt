package com.markcode.holamundo

import android.content.Intent
import android.os.Bundle
import android.view.View;
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class KotlinActivity : AppCompatActivity() {

    private val btn: Button? = null
    private val GREETER = "Hello from the other side!"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_java)
        supportActionBar!!.setDisplayShowHomeEnabled(true)
        btn!!.setOnClickListener {

            //Acceder al segundo activity y mandarle un string
            val intent = Intent(this@KotlinActivity, MainActivity::class.java)
            intent.putExtra("greeter", GREETER)
            startActivity(intent)
        }
    }
}