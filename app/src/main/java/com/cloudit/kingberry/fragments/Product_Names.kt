package com.cloudit.kingberry.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridLayout
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cloudit.kingberry.Data.ProdNamesData
import com.cloudit.kingberry.R
import com.cloudit.kingberry.adaptors.Product_Name_Adaptor
import com.cloudit.kingberry.model.SubAreasModel

class Product_Names : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view:View = inflater.inflate(R.layout.fragment_product__names,container,false)
        var prodRV = view?.findViewById<RecyclerView>(R.id.prodRV)
        val navIcon = view?.findViewById<ImageView>(R.id.back_btn)
        val navText = view?.findViewById<TextView>(R.id.nav_text)

        navText?.setText("Products")
        navIcon?.setOnClickListener {
            parentFragmentManager.popBackStack()

        }

        val productNameArrayList: ArrayList<SubAreasModel>? = ProdNamesData().getProductData()

        val itemAdaptor = Product_Name_Adaptor(this, productNameArrayList!!)
        val gridLayout = GridLayoutManager(context,3)

        prodRV?.layoutManager = gridLayout
        prodRV?.adapter = itemAdaptor







        return view
    }


}