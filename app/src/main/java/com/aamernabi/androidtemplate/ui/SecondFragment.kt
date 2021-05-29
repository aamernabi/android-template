package com.aamernabi.androidtemplate.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.aamernabi.androidtemplate.R
import com.aamernabi.androidtemplate.core.extension.viewBinding
import com.aamernabi.androidtemplate.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private val binding by viewBinding(FragmentSecondBinding::bind)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonPrevious.setOnClickListener {
            findNavController().popBackStack()
        }
    }
}
