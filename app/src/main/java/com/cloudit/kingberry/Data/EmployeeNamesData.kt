package com.cloudit.kingberry.Data

import com.cloudit.kingberry.R
import com.cloudit.kingberry.model.EmployeeNamesModel

class EmployeeNamesData {

    fun getEmployeeData(): ArrayList<EmployeeNamesModel>? {
        var empNamesArrayList: ArrayList<EmployeeNamesModel>? = ArrayList()
        empNamesArrayList?.add(EmployeeNamesModel("Shubham Kurkute", R.drawable.user_icon))
        empNamesArrayList?.add(EmployeeNamesModel("Digvijay Bavlekar",R.drawable.user_icon))
        empNamesArrayList?.add(EmployeeNamesModel("Prathmesh Pawar",R.drawable.user_icon))
        empNamesArrayList?.add(EmployeeNamesModel("Shubham Kurkute",R.drawable.user_icon))
        empNamesArrayList?.add(EmployeeNamesModel("Shubham Kurkute",R.drawable.user_icon))
        empNamesArrayList?.add(EmployeeNamesModel("Shubham Kurkute",R.drawable.user_icon))
        empNamesArrayList?.add(EmployeeNamesModel("Shubham Kurkute",R.drawable.user_icon))
        empNamesArrayList?.add(EmployeeNamesModel("Shubham Kurkute",R.drawable.user_icon))
        empNamesArrayList?.add(EmployeeNamesModel("Shubham Kurkute",R.drawable.user_icon))
        empNamesArrayList?.add(EmployeeNamesModel("Shubham Kurkute",R.drawable.user_icon))
        empNamesArrayList?.add(EmployeeNamesModel("Shubham Kurkute",R.drawable.user_icon))

        return empNamesArrayList
    }


}