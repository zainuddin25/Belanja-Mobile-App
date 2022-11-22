package com.example.belanja

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.belanja.listcategory.ListItem
import com.example.belanja.listcategory.MyAdapter

class CategoryList : Fragment() {

    private lateinit var adapter: MyAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var listCategoryList: ArrayList<ListItem>

    lateinit var imageId: ArrayList<Int>
    lateinit var title: ArrayList<String>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_category_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataInitialize()
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        recyclerView = view.findViewById(R.id.rv_listCategories)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = MyAdapter(listCategoryList)
        recyclerView.adapter = adapter
    }

    private fun dataInitialize(){

        listCategoryList = arrayListOf<ListItem>()

        imageId = arrayListOf(
            R.drawable.icon_square,
            R.drawable.icon_tshirt,
            R.drawable.icon_skirt,
            R.drawable.icon_shoe,
            R.drawable.icon_slippers,
            R.drawable.icon_hat,
            R.drawable.icon_glasess
        )

        title = arrayListOf(
            "All",
            "T-Shirt",
            "Skirt",
            "Shoe",
            "Slipper",
            "Hat",
            "Glasses",
        )

        for (i in imageId.indices){
            val listItem = ListItem(imageId[i], title[i])
            listCategoryList.add(listItem)
        }

    }

}