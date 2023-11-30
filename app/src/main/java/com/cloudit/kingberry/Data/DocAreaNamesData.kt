package com.cloudit.kingberry.Data

import com.cloudit.kingberry.R
import com.cloudit.kingberry.model.AreaNamesModel
import com.cloudit.kingberry.model.SubAreasModel

class DocAreaNamesData {

    fun getDocAreaNames(): ArrayList<AreaNamesModel>? {

        var areaNamesArrayList: ArrayList<AreaNamesModel>? = ArrayList()
        areaNamesArrayList?.add(AreaNamesModel("Swargate",getDocNames()))
        areaNamesArrayList?.add(AreaNamesModel("Katraj",getDocNames()))
        areaNamesArrayList?.add(AreaNamesModel("Dhankawadi",getDocNames()))
        areaNamesArrayList?.add(AreaNamesModel("Bharati Vidyapeeth",getDocNames()))
        areaNamesArrayList?.add(AreaNamesModel("Karve Nagar",getDocNames()))

        return areaNamesArrayList






    }
    fun getDocNames():ArrayList<SubAreasModel>{
        var subAreaNameArrayList : ArrayList<SubAreasModel> = ArrayList()
        subAreaNameArrayList.add(SubAreasModel("Dr. Shubham Kurkute", R.drawable.doc_icon))
        subAreaNameArrayList.add(SubAreasModel("Dr. Shubham Kurkute", R.drawable.doc_icon))
        subAreaNameArrayList.add(SubAreasModel("Dr. Shubham Kurkute", R.drawable.doc_icon))
        subAreaNameArrayList.add(SubAreasModel("Dr. Shubham Kurkute ", R.drawable.doc_icon))
        subAreaNameArrayList.add(SubAreasModel("Dr. Shubham Kurkute ", R.drawable.doc_icon))
        subAreaNameArrayList.add(SubAreasModel("Dr. Shubham Kurkute ", R.drawable.doc_icon))
        subAreaNameArrayList.add(SubAreasModel("Dr. Shubham Kurkute ", R.drawable.doc_icon))

        return subAreaNameArrayList
    }
}