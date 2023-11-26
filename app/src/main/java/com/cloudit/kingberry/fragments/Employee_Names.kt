package com.cloudit.kingberry.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cloudit.kingberry.Data.EmployeeNamesData
import com.cloudit.kingberry.R
import com.cloudit.kingberry.adaptors.Employee_Names_Adaptor
import com.cloudit.kingberry.model.EmployeeNamesModel


class Employee_Names : Fragment() {




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_employee__names, container, false)
        val namesRV = view.findViewById<RecyclerView>(R.id.recyclerView)
        val empNames : ArrayList<EmployeeNamesModel> = EmployeeNamesData().getEmployeeData()!!
        val itemAdaptor = Employee_Names_Adaptor(this,empNames)
        val linearLayoutManager = LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
        namesRV.layoutManager = linearLayoutManager
        namesRV.adapter = itemAdaptor

        itemAdaptor.setOnClickListener(object : Employee_Names_Adaptor.OnClickListener{
            override fun onClick(position: Int, emp_names: EmployeeNamesModel) {
                val mfragment = Area_Names()
                fragmentManager?.beginTransaction()?.replace(R.id.first_activity,mfragment)
                    ?.addToBackStack(null)
                    ?.commit()
            }

        })









        return view



    }




}