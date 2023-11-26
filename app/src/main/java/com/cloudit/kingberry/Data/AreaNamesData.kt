package com.cloudit.kingberry.Data

import com.cloudit.kingberry.R
import com.cloudit.kingberry.model.AreaNamesModel
import com.cloudit.kingberry.model.SubAreasModel

class AreaNamesData {

    fun getAreaNames(): ArrayList<AreaNamesModel>? {

        var areaNamesArrayList: ArrayList<AreaNamesModel>? = ArrayList()
        areaNamesArrayList?.add(AreaNamesModel("Pune",getSubAreaNames()))
        areaNamesArrayList?.add(AreaNamesModel("Satara",getSubAreaNames()))
        areaNamesArrayList?.add(AreaNamesModel("Sangli",getSubAreaNames()))
        areaNamesArrayList?.add(AreaNamesModel("Mumbai",getSubAreaNames()))
        areaNamesArrayList?.add(AreaNamesModel("Pune",getSubAreaNames()))

        return areaNamesArrayList






    }
    fun getSubAreaNames():ArrayList<SubAreasModel>{
        var subAreaNameArrayList : ArrayList<SubAreasModel> = ArrayList()
        subAreaNameArrayList.add(SubAreasModel("Swargate", R.drawable.location))
        subAreaNameArrayList.add(SubAreasModel("Katraj", R.drawable.location))
        subAreaNameArrayList.add(SubAreasModel("Dhankawadi", R.drawable.location))
        subAreaNameArrayList.add(SubAreasModel("Bharati Vidyapeeth", R.drawable.location))

        return subAreaNameArrayList
    }
}