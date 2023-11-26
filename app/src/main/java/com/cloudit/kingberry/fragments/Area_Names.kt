package com.cloudit.kingberry.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cloudit.kingberry.Data.AreaNamesData
import com.cloudit.kingberry.R
import com.cloudit.kingberry.adaptors.Areas_Names_Adaptor
import com.cloudit.kingberry.model.AreaNamesModel

class Area_Names : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view : View = inflater.inflate(R.layout.fragment_area__names,container,false)
        val areaRV = view?.findViewById<RecyclerView>(R.id.areaRV)
        val areaNames : ArrayList<AreaNamesModel>? = AreaNamesData().getAreaNames()!!

        val adaptor =Areas_Names_Adaptor(this, areaNames!!)
        val linearLayoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
        areaRV?.layoutManager = linearLayoutManager
        areaRV?.adapter = adaptor










        return view
    }



}