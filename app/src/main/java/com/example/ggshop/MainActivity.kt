package com.example.ggshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.login.*
import kotlinx.android.synthetic.main.user_registration.*

class MainActivity : AppCompatActivity() {

    private lateinit var handler:DatabaseHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        handler= DatabaseHelper(this)

        showHome()

        registration.setOnClickListener{
            showRegistration()
        }
        login.setOnClickListener {
            showLogIn()
        }

        save.setOnContextClickListener {
            handler.insertUserData(
                name = name.text.toString()
            )



        }
    }

    private fun showRegistration(){
        resgistration_layout.visibility=View.VISIBLE
        login_layout.visibility=View.GONE
        home_11.visibility=View.VISIBLE
    }

    private fun showLogIn() {
        resgistration_layout.visibility = View.VISIBLE
        login_layout.visibility = View.GONE
        home_11.visibility = View.VISIBLE
    }

    private fun showHome(){
        resgistration_layout.visibility = View.VISIBLE
        login_layout.visibility = View.GONE
        home_11.visibility = View.VISIBLE
    }
}