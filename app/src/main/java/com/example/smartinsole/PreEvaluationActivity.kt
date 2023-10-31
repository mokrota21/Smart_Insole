package com.example.smartinsole

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.ComponentActivity
import com.example.smartinsole.ui.theme.AdjustActivity

class PreEvaluationActivity : ComponentActivity() {

    private lateinit var mQRImageView: ImageView

    companion object {

        fun newIntent(packageContext: Context): Intent {
            val intent = Intent(packageContext, PreEvaluationActivity::class.java)
            return intent
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pre_evaluation)

        mQRImageView = findViewById<ImageView>(R.id.qr_code_image_view_pre)
        mQRImageView.setOnClickListener {
            val i: Intent = EvaluationActivity.newIntent(this@PreEvaluationActivity)
            startActivity(i)
        }
    }
}