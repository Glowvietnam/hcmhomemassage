package com.example.homemassage

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.homemassage.ui.home.HomeScreen
import com.example.homemassage.viewmodel.TechnicianViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel = TechnicianViewModel()
        viewModel.fetchTechnicians()

        setContent {
            HomeScreen(viewModel)
        }
    }
}