package com.id.subhanurakbar.rizky.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.id.subhanurakbar.rizky.R
import com.example.dicodingsubmission.ListUnivAdapter
import com.example.dicodingsubmission.Univ
import com.example.dicodingsubmission.UnivData

class DashboardFragment : Fragment() {

    private lateinit var rvUniv: RecyclerView
    private var list: ArrayList<Univ> = arrayListOf()


    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragment_dashboard, container, false)
        rvUniv = v.findViewById(R.id.rv_univ)
        rvUniv.setHasFixedSize(true)
        list.addAll(UnivData.listData)
        showRecyclerList()
        return v
    }

    private fun showRecyclerList() {
        rvUniv.layoutManager = LinearLayoutManager(context)
        val listUnivAdapter = ListUnivAdapter(list)
        rvUniv.adapter = listUnivAdapter
    }
}