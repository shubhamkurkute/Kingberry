package com.cloudit.kingberry.Data

import com.cloudit.kingberry.R
import com.cloudit.kingberry.model.EmployeeNamesModel
import com.cloudit.kingberry.model.SubAreasModel

class ProdNamesData {
    fun getProductData(): ArrayList<SubAreasModel>? {
        var empNamesArrayList: ArrayList<SubAreasModel>? = ArrayList()
        empNamesArrayList?.add(SubAreasModel("Dismis", R.drawable.doc_icon))
        empNamesArrayList?.add(SubAreasModel("Calcidence", R.drawable.doc_icon))
        empNamesArrayList?.add(SubAreasModel("HBRoot", R.drawable.doc_icon))
        empNamesArrayList?.add(SubAreasModel("MontiRoot", R.drawable.doc_icon))
        empNamesArrayList?.add(SubAreasModel("Dismis", R.drawable.doc_icon))
        empNamesArrayList?.add(SubAreasModel("Calcidence", R.drawable.doc_icon))
        empNamesArrayList?.add(SubAreasModel("HBRoot", R.drawable.doc_icon))
        empNamesArrayList?.add(SubAreasModel("MontiRoot", R.drawable.doc_icon))

        return empNamesArrayList
    }
}