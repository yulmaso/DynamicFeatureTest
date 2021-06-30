package com.yulmaso.featurecomponenttest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.yulmaso.featurecomponenttest.data.Repository
import javax.inject.Inject

/**
 *  Created by yulmaso
 *  Date: 30.06.2021
 */
class MainFragment : Fragment() {

    @Inject
    lateinit var repository: Repository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (requireActivity().application as App).component.getActivityComponent().inject(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val mainBtn = view.findViewById<Button>(R.id.main_btn)
        val featureBtn = view.findViewById<Button>(R.id.to_feature_btn)

        (requireActivity() as AppCompatActivity).supportActionBar?.title = "Main Fragment"

        mainBtn.setOnClickListener {
            Toast.makeText(requireContext(), repository.getString(), Toast.LENGTH_SHORT).show()
        }

        featureBtn.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_featureFragment)
        }
    }
}