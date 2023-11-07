package com.cloudit.kingberry.model

class EmployeeNamesModel (private var employee_name:String ,private var user_icon:Int ){
    fun getEmployee_Name():String{
        return employee_name
    }
    fun setEmployee_Name(employee_name: String) {
        this.employee_name = employee_name
    }
    fun getUser_Icon():Int{
        return user_icon
    }
    fun setUser_Icon(user_icon: Int) {
        this.user_icon=user_icon
    }

}