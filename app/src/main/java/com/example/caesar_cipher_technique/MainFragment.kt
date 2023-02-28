package com.example.caesar_cipher_technique

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity

import android.widget.Button



class MainFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }
    fun changeFragment(fragment : Fragment){

        val fragmentTransaction = fragmentManager?.beginTransaction()
        fragmentTransaction?.add(R.id.container,fragment)
        fragmentTransaction?.addToBackStack(" ")
        fragmentTransaction?.commit()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       val v= inflater.inflate(R.layout.fragment_main, container, false)
        val EncryptionBtn=v.findViewById<Button>(R.id.Encryption_Btn)
        val DecryptionBtn =v.findViewById<Button>(R.id.Decryption_Btn)
        EncryptionBtn.setOnClickListener { changeFragment(EncryptionFragment())

        }
        DecryptionBtn.setOnClickListener { changeFragment(DecryptionFragment())
          }

        return v;
    }




}