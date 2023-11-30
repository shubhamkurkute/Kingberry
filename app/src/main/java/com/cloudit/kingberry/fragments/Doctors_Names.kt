package com.cloudit.kingberry.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cloudit.kingberry.Data.AreaNamesData
import com.cloudit.kingberry.Data.DocAreaNamesData
import com.cloudit.kingberry.R
import com.cloudit.kingberry.adaptors.Doctor_Area_Name_Adaptor
import com.cloudit.kingberry.model.AreaNamesModel
import com.cloudit.kingberry.model.SubAreasModel


class Doctors_Names : Fragment() {




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_doctors__names, container, false)
        val nav_name : TextView = view.findViewById(R.id.nav_text)
        val doc_area_rv :RecyclerView = view.findViewById(R.id.doc_area_RV)
        val back_btn : ImageView = view.findViewById(R.id.back_btn)
        nav_name.setText("Doctors")

        back_btn.setOnClickListener {
            parentFragmentManager?.popBackStack()
        }


        val doc_area_names : ArrayList<SubAreasModel>? = DocAreaNamesData().getDocNames()
        val itemAdapter = Doctor_Area_Name_Adaptor(this, doc_area_names!!)
        val linearLayoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)

        doc_area_rv.layoutManager = linearLayoutManager
        doc_area_rv.adapter = itemAdapter



        return view
    }


}