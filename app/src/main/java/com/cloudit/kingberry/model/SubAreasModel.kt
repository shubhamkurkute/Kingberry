package com.cloudit.kingberry.model

import android.widget.ImageView

class SubAreasModel(private var subAreaName:String,private var locIcon:Int) {

    fun getsubAreaName():String{
        return subAreaName
    }

    fun getlocIcon():Int{
        return locIcon
    }

   fun setsubAreaName(subAreaName: String){
       this.subAreaName = subAreaName
   }

    fun setlocIcon(locIcon: Int){
        this.locIcon = locIcon
    }

}