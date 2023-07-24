package com.example.telephone

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.text.set

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var result: Double? = null
        var result_a: Double? = null
        var znak = ""

        var znak_plus = false
        var znak_minus = false


        val ED_Label:EditText = findViewById(R.id.editTextTextPersonName)
        val tv_result:TextView = findViewById(R.id.TV_result)

        val btn_1:Button = findViewById(R.id.btn_1)
        val btn_2:Button = findViewById(R.id.btn_2)
        val btn_3:Button = findViewById(R.id.btn_3)
        val btn_4:Button = findViewById(R.id.btn_4)
        val btn_5:Button = findViewById(R.id.btn_5)
        val btn_6:Button = findViewById(R.id.btn_6)
        val btn_7:Button = findViewById(R.id.btn_7)
        val btn_8:Button = findViewById(R.id.btn_8)
        val btn_9:Button = findViewById(R.id.btn_9)
        val btn_zero:Button = findViewById(R.id.btn_zero)
        val btn_znak:Button = findViewById(R.id.btn_znak)

        val btn_plus:Button = findViewById(R.id.btn_plus)
        val btn_result:Button = findViewById(R.id.btn_result)
        val btn_AC:Button = findViewById(R.id.btn_AC)
        val btn_minus:Button = findViewById(R.id.btn_nimus)




        btn_plus.setOnClickListener {
            if (tv_result.text.isEmpty()) {
                result = toDouble(ED_Label.text.toString())
                znak = "+"
                tv_result.text = "$result $znak"
                Toast.makeText(this, "$result", Toast.LENGTH_SHORT).show()
                ED_Label.text.clear()
            }
            else {
                znak = "+"
                result_a = try {
                    toDouble(ED_Label.text.toString())
                } catch (e:NumberFormatException) {
                    Toast.makeText(this, "Число введите", Toast.LENGTH_SHORT).show()
                    0.0
                }
                tv_result.text = "$result $znak $result_a = ${result!!.toDouble()+ result_a!!.toDouble()}"
                result = result!!.toDouble()+ result_a!!.toDouble()
                result_a = 0.0
                ED_Label.text.clear()
            }
        }

        btn_minus.setOnClickListener {
            if (tv_result.text.isEmpty()) {
                result = toDouble(ED_Label.text.toString())
                znak = "-"
                tv_result.text = "$result $znak"
                Toast.makeText(this, "$result", Toast.LENGTH_SHORT).show()
                ED_Label.text.clear()
            }
            else {
                znak = "-"
                result_a = try {
                    toDouble(ED_Label.text.toString())
                } catch (e:NumberFormatException) {
                    Toast.makeText(this, "Число введите", Toast.LENGTH_SHORT).show()
                    0.0
                }
                tv_result.text = "$result $znak $result_a = ${result!!.toDouble() - result_a!!.toDouble()}"
                result = result!!.toDouble() - result_a!!.toDouble()
                result_a = 0.0
                ED_Label.text.clear()
            }
        }



        btn_result.setOnClickListener {
            if (znak == "+") {
                result_a = try {
                    toDouble(ED_Label.text.toString())
                } catch (e:NumberFormatException) {
                    Toast.makeText(this, "Число введите", Toast.LENGTH_SHORT).show()
                    0.0
                }
                val a = result!!.toDouble() + result_a!!.toDouble()
                ED_Label.setText(a.toString())
                tv_result.text = ""
            }
            else if (znak == "-") {
                result_a = try {
                    toDouble(ED_Label.text.toString())
                } catch (e:NumberFormatException) {
                    Toast.makeText(this, "Число введите", Toast.LENGTH_SHORT).show()
                    0.0
                }
                val a = result!!.toDouble() - result_a!!.toDouble()
                ED_Label.setText(a.toString())
                tv_result.text = ""
            }
        }




        btn_AC.setOnClickListener {
            result = null
            result_a = null
            tv_result.text = ""
            ED_Label.text.clear()
        }








        btn_1.setOnClickListener { ED_Label.setText("${ED_Label.text}1") }
        btn_2.setOnClickListener { ED_Label.setText("${ED_Label.text}2") }
        btn_3.setOnClickListener { ED_Label.setText("${ED_Label.text}3") }
        btn_4.setOnClickListener { ED_Label.setText("${ED_Label.text}4") }
        btn_5.setOnClickListener { ED_Label.setText("${ED_Label.text}5") }
        btn_6.setOnClickListener { ED_Label.setText("${ED_Label.text}6") }
        btn_7.setOnClickListener { ED_Label.setText("${ED_Label.text}7") }
        btn_8.setOnClickListener { ED_Label.setText("${ED_Label.text}8") }
        btn_9.setOnClickListener { ED_Label.setText("${ED_Label.text}9") }
        btn_zero.setOnClickListener { ED_Label.setText("${ED_Label.text}0") }
        btn_znak.setOnClickListener { ED_Label.setText("${ED_Label.text}.") }




    }


    fun provznaka(tv:TextView ,a:Boolean,b:Boolean) {


    }

    fun toDouble(s: String): Double {
        return s.toDouble()
    }
}

