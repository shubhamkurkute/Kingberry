package com.cloudit.kingberry.adaptors

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cloudit.kingberry.R
import com.cloudit.kingberry.fragments.Area_Names
import com.cloudit.kingberry.model.AreaNamesModel
import com.cloudit.kingberry.model.SubAreasModel

class Areas_Names_Adaptor(private val context:Area_Names,areasNameArrayList:ArrayList<AreaNamesModel>):
    RecyclerView.Adapter<Areas_Names_Adaptor.ViewHolder>() {

    private var areasNameArrayList:ArrayList<AreaNamesModel>
    var subAreaNameArrayList = ArrayList<SubAreasModel>()



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.area_cardview,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return areasNameArrayList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val areaModel : AreaNamesModel = areasNameArrayList[position]
        holder.areaname.setText(areaModel.getAreaNames())
        subAreaNameArrayList = areaModel.getsubAreaArrayList()
        val linearLayoutManager = LinearLayoutManager(context.requireContext(),LinearLayoutManager.VERTICAL,false)
        val subAreaNameAdaptor = Sub_Area_Name_Adaptor(context,subAreaNameArrayList)
        holder.nestedRV.layoutManager = linearLayoutManager
        holder.nestedRV.adapter = subAreaNameAdaptor
        holder.areaname.setOnClickListener {

            holder.nestedRV.visibility = if(holder.nestedRV.isShown) View.GONE else View.VISIBLE
            holder.card.background.setTint(if (holder.nestedRV.isShown) holder.card.resources.getColor(R.color.white)
            else holder.card.resources.getColor(R.color.card_color)

            )


        }














    }

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        val areaname : TextView
        val card :CardView
        val nestedRV:RecyclerView




        init {
            areaname = itemView.findViewById(R.id.area_text)
            card = itemView.findViewById(R.id.area_card)
            nestedRV = itemView.findViewById(R.id.nestedRV)




        }

    }
    init {
        this.areasNameArrayList=areasNameArrayList
    }

}