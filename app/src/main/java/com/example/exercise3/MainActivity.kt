package com.example.exercise3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ageGroup = findViewById<View>(R.id.spinner)

        val btn = findViewById<View>(R.id.btnCalculate)

        btn.setOnClickListener() {
            val age = spinner.selectedItemPosition

            var total: Double =0.0

            if (age.equals(0)) {
                if (radMale.isChecked || checkBox.isChecked)
                    total = 60.0

            } else if (age.equals(1)) {
                total = 70.0

                if (radMale.isChecked ) {
                    total = 120.0

                }
                if (checkBox.isChecked)
                    total = 170.0
                if (radMale.isChecked && checkBox.isChecked) {
                    total = 320.0
                }


            } else if (age.equals(2)) {
                total = 90.0

                if (radMale.isChecked) {
                    total = 190.0

                }
                if (checkBox.isChecked)
                    total = 240.0
                if (radMale.isChecked && checkBox.isChecked) {
                    total = 340.0
                }


            } else if (age.equals(3)) {
                total = 120.0

                if (radMale.isChecked) {
                    total = 270.0

                }
                if (checkBox.isChecked)
                    total = 220.0
                if (radMale.isChecked && checkBox.isChecked) {
                    total = 470.0
                }


            } else if (age.equals(4)) {
                total = 150.0

                if (radMale.isChecked) {
                    total = 350.0

                }
                if (checkBox.isChecked)
                    total = 400.0
                if (radMale.isChecked &&checkBox.isChecked) {
                    total = 600.0
                }


            } else if (age.equals(4)) {
                total = 150.0

                if (radMale.isChecked) {
                    total = 350.0

                }
                if (checkBox.isChecked)
                    total = 400.0
                if (radMale.isChecked && checkBox.isChecked) {
                    total = 600.0
                }


            } else if (age.equals(5)) {
                total = 150.0

                if (radMale.isChecked) {
                    total = 350.0

                }
                if (checkBox.isChecked)
                    total = 450.0
                if (radMale.isChecked && checkBox.isChecked) {
                    total = 650.0
                }


            }
            textViewPremium.text = "RM %.2f".format(total)
        }
        btnReset.setOnClickListener(){
            textViewPremium.text = ""
            radioGroup3.clearCheck()
            checkBox.isChecked = false
            spinner.clearFocus()
        }


    }
}
