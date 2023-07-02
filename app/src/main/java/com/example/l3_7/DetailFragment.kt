package com.example.l3_7

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.example.l3_7.databinding.FragmentDetailBinding


class DetailFragment : Fragment() {
    private lateinit var list: ArrayList<iconModel>
    private lateinit var binding: FragmentDetailBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var item = arguments?.getSerializable(iconKeys.IconKet) as iconModel
        binding.tv1.text = item.name
        binding.tv2.text = item.username
        binding.tv3.text = item.number
        Glide.with(binding.img).load(item.img).into(binding.img)


    }


}