package com.yulmaso.feature1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.findNavController
import com.yulmaso.feature1.di.DaggerFeatureComponent
import com.yulmaso.featurecomponenttest.App
import com.yulmaso.featurecomponenttest.data.Repository
import javax.inject.Inject

class FeatureFragment : Fragment() {

    @Inject
    lateinit var repository: Repository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val appComponent = (requireActivity().application as App).component
        DaggerFeatureComponent.factory().create(appComponent).inject(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val featureBtn = view.findViewById<Button>(R.id.feature_btn)
        val backBtn = view.findViewById<Button>(R.id.back_btn)

        (requireActivity() as AppCompatActivity).supportActionBar?.title = "Feature Fragment"

        featureBtn.setOnClickListener {
            Toast.makeText(requireContext(), repository.getFeatureString(), Toast.LENGTH_SHORT).show()
        }

        backBtn.setOnClickListener {
            findNavController().popBackStack()
        }
    }

}