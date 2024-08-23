package com.example.eletriccarapp.ui

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.eletriccarapp.R
import com.example.eletriccarapp.databinding.ActivityMainBinding
import com.example.eletriccarapp.ui.adapter.TabAdapter
import com.google.android.material.tabs.TabLayout


class MainActivity : AppCompatActivity() {

  private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

  lateinit var tabLayout: TabLayout
  lateinit var viewPager: ViewPager2

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(binding.root)
  }
}