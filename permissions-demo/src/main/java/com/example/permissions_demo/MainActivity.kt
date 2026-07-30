package com.example.permissions_demo

import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private val CAMERA_PERMISSION = android.Manifest.permission.CAMERA
    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    private val permissions = arrayOf(
        android.Manifest.permission.CAMERA,
        android.Manifest.permission.ACCESS_COARSE_LOCATION,
        android.Manifest.permission.POST_NOTIFICATIONS
    );
    private val CAM_PERM_CODE =100
    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        checkAndRequestPermission()

    }
    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    private fun checkAndRequestPermission(){
        if(ContextCompat.checkSelfPermission(this, CAMERA_PERMISSION) == PackageManager.PERMISSION_GRANTED){

        }else{
            ActivityCompat.requestPermissions(this, permissions, CAM_PERM_CODE) // can use any integer if CAM_PERM_CODE is not declared
        }
    }

    override fun onRequestPermissionsResult(  // this function can be used only once but gets everytime a permission is asked, to identify which permission is asked we use permission code
        requestCode: Int,
        permissions: Array<out String?>,
        grantResults: IntArray,
        deviceId: Int
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults, deviceId)
        if (requestCode == CAM_PERM_CODE){
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED){

            }
        }
    }
}