package com.example.giuaki.myFragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.giuaki.R
import com.example.giuaki.SecondActivity
import com.example.giuaki.databinding.FragmentHomeBinding




class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val bind = FragmentHomeBinding.inflate(layoutInflater)
        bind.btnOpenSecondActivity.setOnClickListener {
            val intent = Intent (this@HomeFragment.requireContext(), SecondActivity::class.java)
            startActivity(intent)
        }
        return bind.root
    }
}