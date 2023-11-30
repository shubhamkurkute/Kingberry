package com.cloudit.kingberry

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toolbar
import com.cloudit.kingberry.fragments.Employee_Names

class employee_names : AppCompatActivity() {
    val employeeNameFragment = Employee_Names()


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_employee_names)





        supportFragmentManager.beginTransaction().add(R.id.first_activity,employeeNameFragment)
            
            .commit()


    }
}