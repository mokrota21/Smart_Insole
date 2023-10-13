package com.example.smartinsole

import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.RelativeLayout
import androidx.activity.ComponentActivity


class EvaluationActivity : ComponentActivity() {

    fun addLoadingBar(context: Context, layout: RelativeLayout): ProgressBar {
        val progressBar = ProgressBar(context)
        val params = RelativeLayout.LayoutParams(
            RelativeLayout.LayoutParams.WRAP_CONTENT,
            RelativeLayout.LayoutParams.WRAP_CONTENT
        )
        params.addRule(RelativeLayout.CENTER_IN_PARENT)
        progressBar.layoutParams = params

        layout.addView(progressBar)
        progressBar.visibility = View.VISIBLE

        return progressBar
    }

    // Function to remove a loading bar from a layout
    fun removeLoadingBar(layout: RelativeLayout, progressBar: ProgressBar) {
        layout.removeView(progressBar)
    }

    companion object {

        fun newIntent(packageContext: Context): Intent {
            val intent = Intent(packageContext, EvaluationActivity::class.java)
            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_evaluation)
        val imageLayout: RelativeLayout = findViewById(R.id.kk)

        val tmp: Button = findViewById(R.id.button)
        tmp.setOnClickListener {
            val imageView = findViewById<ImageView>(R.id.loadingImageView)
            val bar = addLoadingBar(this@EvaluationActivity, imageLayout)
            Thread.sleep(3000)
            removeLoadingBar(imageLayout, bar)
            imageView.setImageResource(R.drawable.feet)
        }



    }
}