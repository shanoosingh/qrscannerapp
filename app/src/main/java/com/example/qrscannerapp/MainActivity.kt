package com.example.qrscannerapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.qrscannerapp.ui.theme.QRSCANNERAPPTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // ViewModel instance
        val authViewModel: AuthViewModel by viewModels()

        // Set the content of the activity
        setContent {
            QRSCANNERAPPTheme { // Use the app's theme
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // Call the navigation composable with padding applied
                    MyAppNavigation(
                        modifier = Modifier.padding(innerPadding),
                        authViewModel = authViewModel
                    )
                }
            }
        }
    }
}