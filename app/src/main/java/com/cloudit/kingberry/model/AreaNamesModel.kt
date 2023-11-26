package com.cloudit.kingberry.model

class AreaNamesModel(private var areaNames:String,private var subAreaArrayList: ArrayList<SubAreasModel>) {



    fun getAreaNames():String{
        return areaNames

    }

    fun setAreaNames(areaNames: String){
        this.areaNames = areaNames
    }

    fun getsubAreaArrayList():ArrayList<SubAreasModel>{
        return subAreaArrayList
    }

    fun setsubAreaArrayList(subAreaArrayList: ArrayList<SubAreasModel>){
        this.subAreaArrayList = subAreaArrayList

    }
}