package com.example.caesar_cipher_technique

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class DecryptionFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    fun ceaserdecryption(cipherTxt : String, shift : Int): String {
        val alpha: String ="abcdefghijklmnopqrstuvwxyz"
        val cipherTxt :String = cipherTxt
        val shift:Int =shift
        var plainText :String =" "
        for (character in cipherTxt ) {
            for (char in alpha) {
                if (character == char) {
                    val characterValue = alpha.indexOf(char)

                    val shiftCharacter = (characterValue - shift) % alpha.length

                    plainText += alpha[shiftCharacter]            }
            }
        }

        return plainText

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v= inflater.inflate(R.layout.fragment_decryption, container, false)
        val shiftET = v.findViewById<EditText>(R.id.shift_Edit_Text)
        val plainET = v.findViewById<EditText>(R.id.Plain_Txt_Edit_Text)
        val cipherEt =v.findViewById<EditText>(R.id.Cipher_Txt_Edit_Text)
        val decryptBtn=v.findViewById<Button>(R.id.Decrypt_Btn)
        decryptBtn.setOnClickListener {
            val siftValue : Int? =shiftET.text.toString().toIntOrNull()
            val cipherText : String=cipherEt.text.toString()

            plainET.setText(ceaserdecryption(cipherText, siftValue!!))
        }
        return v
    }
    }