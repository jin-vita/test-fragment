package com.jinvita.testfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.jinvita.testfragment.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            btnFirst.setOnClickListener {
                MainFragmentDirections.actionMainFragmentToFirstFragment().apply { findNavController().navigate(this) }
            }
            btnSecond.setOnClickListener {
                MainFragmentDirections.actionMainFragmentToSecondFragment().apply { findNavController().navigate(this) }
            }
        }
    }

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}