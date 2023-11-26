package com.cloudit.kingberry.adaptors

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.cloudit.kingberry.R
import com.cloudit.kingberry.fragments.Area_Names
import com.cloudit.kingberry.fragments.Employee_Names
import com.cloudit.kingberry.model.AreaNamesModel
import com.cloudit.kingberry.model.EmployeeNamesModel

class Employee_Names_Adaptor(private val context: Employee_Names, empNamesArrayList: ArrayList<EmployeeNamesModel>?):
RecyclerView.Adapter<Employee_Names_Adaptor.Viewholder>(){
    private val empNamesArrayList:ArrayList<EmployeeNamesModel>
    private lateinit var onClickListener: OnClickListener


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder {
        val view:View = LayoutInflater.from(parent.context).inflate(R.layout.recycler_cardview,parent,false)
        return Viewholder(view)
    }

    override fun onBindViewHolder(holder: Viewholder, position: Int) {
        val model : EmployeeNamesModel = empNamesArrayList[position]
        holder.empName.setText(model.getEmployee_Name())
        holder.empIcon.setImageResource(model.getUser_Icon())
        holder.itemView.setOnClickListener {
            onClickListener?.onClick(position,model)
        }

    }
    fun setOnClickListener(onClickListener: OnClickListener) {
        this.onClickListener = onClickListener
    }
    interface OnClickListener {
        fun onClick(position: Int, emp_names:EmployeeNamesModel)
    }

    override fun getItemCount(): Int {
       return empNamesArrayList.size
    }

    class Viewholder (itemView:View):RecyclerView.ViewHolder(itemView){
        val empName : TextView
        val empIcon:ImageView

        init {
            empName= itemView.findViewById(R.id.emp_names)
            empIcon = itemView.findViewById(R.id.user_icon)
        }

    }
    init {
        this.empNamesArrayList= empNamesArrayList!!
    }

}