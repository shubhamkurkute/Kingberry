package com.cloudit.kingberry.adaptors

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.cloudit.kingberry.R
import com.cloudit.kingberry.fragments.Area_Names
import com.cloudit.kingberry.model.SubAreasModel


class Sub_Area_Name_Adaptor(private var context : Area_Names,subAreaNameArrayList: ArrayList<SubAreasModel>):
    RecyclerView.Adapter<Sub_Area_Name_Adaptor.ViewHolder>() {

    private var subAreaNameArrayList :ArrayList<SubAreasModel>



    class ViewHolder(view: View): RecyclerView.ViewHolder(view){


            val subAreaText:TextView
            val locIcon:ImageView
            init {
                this.subAreaText = view.findViewById(R.id.subAreaName)
                this.locIcon = view.findViewById(R.id.locIcon)
            }



    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.nested_card_view,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {

        return subAreaNameArrayList.size

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val subAreaModel : SubAreasModel = subAreaNameArrayList[position]
        holder.subAreaText.setText(subAreaModel.getsubAreaName())
        holder.locIcon.setImageResource(subAreaModel.getlocIcon())
        holder.subAreaText.setOnClickListener {
            Toast.makeText(context.requireContext(),"hello",Toast.LENGTH_SHORT).show()
        }




    }
    init {
        this.subAreaNameArrayList = subAreaNameArrayList
    }
}