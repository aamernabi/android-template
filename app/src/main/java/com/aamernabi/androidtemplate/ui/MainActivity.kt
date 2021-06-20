package com.aamernabi.androidtemplate.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aamernabi.androidtemplate.core.extension.viewBinding
import com.aamernabi.androidtemplate.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val binding by viewBinding(ActivityMainBinding::inflate)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}
