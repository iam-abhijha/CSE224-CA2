package com.mrtechy.cse224ca2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class Question2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question2)


        /* For radio buttons */
        var radioGroup = findViewById<RadioGroup>(R.id.radioGrp)
        radioGroup.clearCheck()
        radioGroup.setOnCheckedChangeListener( RadioGroup.OnCheckedChangeListener
        { group, checkedId ->
                val radioBtn: RadioButton = findViewById(checkedId)
                Toast.makeText(this,"Gender: "+"${radioBtn.text}", Toast.LENGTH_SHORT).show()
        })

        /* CheckBox Initialization*/
        var cpp = findViewById<CheckBox>(R.id.checkCPP)
        var java = findViewById<CheckBox>(R.id.checkJava)
        var python = findViewById<CheckBox>(R.id.checkPython)
        var kotlin = findViewById<CheckBox>(R.id.checkKotlin)

        /* Called CheckBox Toast Functions */
        checkBoxToast(cpp)
        checkBoxToast(java)
        checkBoxToast(python)
        checkBoxToast(kotlin)

        /* For Button */
        var btnSubmit = findViewById<Button>(R.id.btnSubmit)
        var etName = findViewById<EditText>(R.id.etName)
        btnSubmit.setOnClickListener {
            if(etName.text.toString() == ""){
                Toast.makeText(this, "You don't know your name? ",Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this, "${etName.text}"+" Your form has been submitted",Toast.LENGTH_LONG).show()
                val intent = intent
                finish()
                startActivity(intent)
            }


        }
    }

    /* Function for check box toast message */
    private fun checkBoxToast(x:CheckBox){
        x.setOnClickListener(View.OnClickListener {
            if(x.isChecked){
                Toast.makeText(
                    this,
                    "Subject: " + "${x.text}",
                    Toast.LENGTH_SHORT
                ).show()
            }
        })
    }


}