package com.example.caesar_cipher_technique

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        changeFragment(MainFragment())
    }
 fun changeFragment(fragment : Fragment){
val fragmentManager = supportFragmentManager
val fragmentTransaction =fragmentManager.beginTransaction()
fragmentTransaction.add(R.id.container,fragment)
     fragmentTransaction.addToBackStack("  ")
    fragmentTransaction.commit()
}
}