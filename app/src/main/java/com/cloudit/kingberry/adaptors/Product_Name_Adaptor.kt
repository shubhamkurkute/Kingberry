package com.cloudit.kingberry.adaptors

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.cloudit.kingberry.R
import com.cloudit.kingberry.fragments.Prod_Image
import com.cloudit.kingberry.fragments.Product_Names
import com.cloudit.kingberry.model.SubAreasModel

class Product_Name_Adaptor(private var context:Product_Names,productNamesArrayList: ArrayList<SubAreasModel>):
RecyclerView.Adapter<Product_Name_Adaptor.ViewHolder>() {
    private  var productNamesArrayList:ArrayList<SubAreasModel>
    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val prodName:TextView
        val prodImage:ImageView
        init {
            prodName = view.findViewById(R.id.prod_name)
            prodImage=view.findViewById(R.id.prod_Image)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.prod_card,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return productNamesArrayList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val prod_model:SubAreasModel =productNamesArrayList[position]
        holder.prodName.setText(prod_model.getsubAreaName())
        holder.prodImage.setImageResource(prod_model.getlocIcon())

        holder.prodImage.setOnClickListener {
            val mfragment = Prod_Image()
            context.parentFragmentManager.beginTransaction().replace(R.id.first_activity,mfragment)
                .addToBackStack(null)
                .commit()
        }

    }
    init {
        this.productNamesArrayList = productNamesArrayList
    }
}
