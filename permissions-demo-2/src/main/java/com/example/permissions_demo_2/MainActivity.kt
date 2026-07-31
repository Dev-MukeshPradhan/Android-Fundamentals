package com.example.permissions_demo_2

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var requestPermissionLauncher : ActivityResultLauncher<String> // declaring here so that the variable can be used anywhere inside the app, not only when oncreate is being called
    private val CAMERA_PERMISSION = android.Manifest.permission.CAMERA

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        requestPermissionLauncher = registerForActivityResult(
            androidx.activity.result.contract.ActivityResultContracts.RequestPermission()
        ) { isGranted: Boolean ->
            if (isGranted) {
                Toast.makeText(this, "Camera Permission Granted", Toast.LENGTH_SHORT).show()
                // Proceed with camera action
            } else {
                Toast.makeText(this, "Camera Permission Denied", Toast.LENGTH_SHORT).show()
            }
        }

    }

    private fun askCameraPermission() {
        when {
            ContextCompat.checkSelfPermission(this, CAMERA_PERMISSION) == android.content.pm.PackageManager.PERMISSION_GRANTED -> {
                Toast.makeText(this, "Permission already granted", Toast.LENGTH_SHORT).show()
            }
            shouldShowRequestPermissionRationale(CAMERA_PERMISSION) -> {
                // In a real app, show an educational UI (e.g., a dialog) explaining why the permission is needed
                Toast.makeText(this, "Camera permission is needed to take photos", Toast.LENGTH_LONG).show()
                requestPermissionLauncher.launch(CAMERA_PERMISSION)
            }
            else -> {
                requestPermissionLauncher.launch(CAMERA_PERMISSION)
            }
        }
    }
}