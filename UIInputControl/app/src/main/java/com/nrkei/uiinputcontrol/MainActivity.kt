package com.nrkei.uiinputcontrol

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    private var onOffButton: ToggleButton? = null
    private var checkEnglish: CheckBox? = null
    private var checkHindi: CheckBox? = null
    private var radioFemale: RadioButton? = null
    private var radioMale: RadioButton? = null
    private var radioGroup: RadioGroup? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        onOffButton = findViewById(R.id.onOffButton)
        checkEnglish = findViewById(R.id.checkEnglish)
        checkHindi = findViewById(R.id.checkHindi)
        radioFemale = findViewById(R.id.radioFemale)
        radioMale = findViewById(R.id.radioMale)
        radioGroup = findViewById(R.id.radioGroup)
    }

    fun onEditName(v: View) {
        Toast.makeText(this, "On Edit Name", Toast.LENGTH_LONG).show()
    }

    fun onEditAge(v: View) {
        Toast.makeText(this, "On Edit Age", Toast.LENGTH_LONG).show()
    }

    fun onButtonToggle(v: View) {
        Toast.makeText(this,
                if (onOffButton!!.isChecked) "Button is ON" else "Button is OFF",
                Toast.LENGTH_LONG).show()
    }

    fun onEnglish(v: View) {
        Toast.makeText(this,
                if (checkEnglish!!.isChecked) "English is CHECKED" else "English is unchecked",
                Toast.LENGTH_LONG).show()
    }

    fun onHindi(v: View) {
        Toast.makeText(this,
                if (checkHindi!!.isChecked) "Hindi is CHECKED" else "Hindi is unchecked",
                Toast.LENGTH_LONG).show()
    }

    fun toggleRadioFemale(v: View) {
        Toast.makeText(this, "Female is CHECKED", Toast.LENGTH_LONG).show()
    }

    fun toggleRadioMale(v: View) {
        Toast.makeText(this, "Male is CHECKED", Toast.LENGTH_LONG).show()
        // Note: No notification upon losing the checked status of a radio button
        Log.i("UI controls", if (radioMale!!.isChecked) "Male is CHECKED" else "Male is unchecked")
    }

    fun radioGroupClick(v: View) {
        // Not triggered; perhaps because there are individual listeners on each radio button?
        Toast.makeText(this, "Selected id is " + (radioGroup?.checkedRadioButtonId ?: -2), Toast.LENGTH_LONG).show()
        Log.i("UI controls", "Selected id is " + (radioGroup?.checkedRadioButtonId ?: -2))
    }
}
