package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var btn1: Button
    private lateinit var btn2: Button
    private lateinit var btn3: Button
    private lateinit var btn4: Button
    private lateinit var btn5: Button
    private lateinit var btn6: Button
    private lateinit var btn7: Button
    private lateinit var btn8: Button
    private lateinit var btn9: Button
    private lateinit var text1: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initial()

    }

    private fun initial() {
         btn1 = findViewById(R.id.btn1)
         btn2 = findViewById(R.id.btn2)
         btn3 = findViewById(R.id.btn3)
         btn4 = findViewById(R.id.btn4)
         btn5 = findViewById(R.id.btn5)
         btn6 = findViewById(R.id.btn6)
         btn7 = findViewById(R.id.btn7)
         btn8 = findViewById(R.id.btn8)
         btn9 = findViewById(R.id.btn9)
        text1=findViewById(R.id.textView1)
    }

    private var playerTurn: Int = 0
    private var count: Int = 0
    @SuppressLint("SetTextI18n")
    fun check(view: View) {

        val btnCurrent: Button = view as Button
        if (btnCurrent.text.toString() == "" && text1.text.toString()=="") {
            if (playerTurn == 0) {
                btnCurrent.text = "X"
                playerTurn = 1
            } else {
                btnCurrent.text = "O"
                playerTurn = 0
            }
            count++
            if (count > 4) {
                val b1 = btn1.text.toString()
                val b2 = btn2.text.toString()
                val b3 = btn3.text.toString()
                val b4 = btn4.text.toString()
                val b5 = btn5.text.toString()
                val b6 = btn6.text.toString()
                val b7 = btn7.text.toString()
                val b8 = btn8.text.toString()
                val b9 = btn9.text.toString()
                if (b1 != "" && b1 == b2 && b2 == b3) {
                    text1.text = "WINNER IS $b1"
                } else if (b4 != "" && b4 == b5 && b5 == b6) {
                    text1.text = "WINNER IS $b4"
                } else if (b7 != "" && b7 == b8 && b8 == b9) {
                    text1.text = "WINNER IS $b7"
                } else if (b1 != "" && b1 == b4 && b4 == b7) {
                    text1.text = "WINNER IS $b4"

                } else if (b2 != "" && b2 == b5 && b5 == b8) {
                    text1.text = "WINNER IS $b2"

                } else if (b3 != "" && b3 == b6 && b6 == b9) {
                    text1.text = "WINNER IS $b3"

                } else if (b1 != "" && b1 == b5 && b5 == b9) {
                    text1.text = "WINNER IS $b1"

                } else if (b3 != "" && b3 == b5 && b5 == b7) {
                    text1.text = "WINNER IS $b3"

                }
                else if(count==9){
                    text1.text = "GAME DRAW"
                }
            }
        }
    }

    fun reset(view: View) {
        btn1.text = ""
        btn2.text = ""
        btn3.text = ""
        btn4.text = ""
        btn5.text = ""
        btn6.text = ""
        btn7.text = ""
        btn8.text = ""
        btn9.text = ""
        text1.text=""
        count=0
        playerTurn=0
    }


}