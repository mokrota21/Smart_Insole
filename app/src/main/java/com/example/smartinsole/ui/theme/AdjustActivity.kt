package com.example.smartinsole.ui.theme

import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Point
import android.os.Bundle
import android.util.Log
import android.view.WindowManager
import android.widget.Button
import android.widget.ImageView
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity
import com.example.smartinsole.R
import com.example.smartinsole.ShowProgressActivity

class AdjustActivity : ComponentActivity() {

    private lateinit var mQRImageView: ImageView
    private lateinit var mLatestResultButton: Button

    private lateinit var mBitmap: Bitmap

    companion object {

        fun newIntent(packageContext: Context): Intent {
            val intent = Intent(packageContext, AdjustActivity::class.java)
            return intent
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adjust)

        mQRImageView = findViewById(R.id.qr_code_image_view)

        mLatestResultButton = findViewById(R.id.latest_result_button)
        mLatestResultButton.setOnClickListener {
            mBitmap = BitmapFactory.decodeResource(resources, R.drawable.qr_code)
            mQRImageView.setImageBitmap(mBitmap)
        }
    }
}