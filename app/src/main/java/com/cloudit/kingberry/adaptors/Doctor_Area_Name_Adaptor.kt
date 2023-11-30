package com.cloudit.kingberry.adaptors

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.view.marginStart
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cloudit.kingberry.R
import com.cloudit.kingberry.fragments.Doctors_Names
import com.cloudit.kingberry.model.AreaNamesModel
import com.cloudit.kingberry.model.SubAreasModel

class Doctor_Area_Name_Adaptor(private val context: Doctors_Names, doctor_area_name_arraylist:ArrayList<SubAreasModel>):
RecyclerView.Adapter<Doctor_Area_Name_Adaptor.ViewHolder>(){

    private  var doctor_area_name_arraylist : ArrayList<SubAreasModel>
    class ViewHolder(item : View):RecyclerView.ViewHolder(item) {

        val doc_name:TextView
        val doc_icon:ImageView
        val card : CardView


        init {
            doc_name = item.findViewById(R.id.subAreaName)
            doc_icon = item.findViewById(R.id.locIcon)
            card = item.findViewById(R.id.cardView)


        }


    }




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view:View = LayoutInflater.from(parent.context).inflate(R.layout.nested_card_view,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return doctor_area_name_arraylist.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val docModel : SubAreasModel = doctor_area_name_arraylist[position]
        holder.doc_name.setText(docModel.getsubAreaName())
        holder.doc_icon.setImageResource(docModel.getlocIcon())





        holder.doc_name.setOnClickListener {









        }





    }
    init {
        this.doctor_area_name_arraylist = doctor_area_name_arraylist
    }
}