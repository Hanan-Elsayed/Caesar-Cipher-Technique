package com.example.caesar_cipher_technique

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText

class EncryptionFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
fun Ceaser_Encryption( Plain_Txt : String, shift : Int): String {
    val alpha ="abcdefghijklmnopqrstuvwxyz"
    val plainText :String = Plain_Txt
    val shift =shift
    var cipherTxt =" "
    for (character in plainText ) {
        for (char in alpha) {
            if (character == char) {
                val characterValue = alpha.indexOf(char)

                val shiftCharacter = (characterValue + shift) % alpha.length
                // adding the string back to cipher text
                cipherTxt += alpha[shiftCharacter]            }
        }
    }

        return cipherTxt

}
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_encryption, container, false)
        val siftET = v.findViewById<EditText>(R.id.shift_Edit_Text)
        val plainET = v.findViewById<EditText>(R.id.Plain_Txt_Edit_Text)
        val cipherEt =v.findViewById<EditText>(R.id.Cipher_Txt_Edit_Text)
        val encryptBtn=v.findViewById<Button>(R.id.Encrypt_Btn)
        encryptBtn.setOnClickListener {
            val siftValue : Int? =siftET.text.toString().toIntOrNull()
            val plainText : String=plainET.text.toString()

            cipherEt.setText(Ceaser_Encryption(plainText, siftValue!!))
            cipherEt.setTextColor(Color.parseColor("#ff1515"))

        }
return v
    }
}
