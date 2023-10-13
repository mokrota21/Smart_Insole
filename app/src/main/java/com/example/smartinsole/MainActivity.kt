package com.example.smartinsole

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.result.ActivityResultLauncher
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.smartinsole.ui.theme.SmartInsoleTheme

class MainActivity : ComponentActivity() {
    private lateinit var mEvaluationButton: Button
    private lateinit var mShowGraphButton: Button
    private lateinit var mContactButton: Button

    private lateinit var mEvaluationLauncher: ActivityResultLauncher<Intent>
    private lateinit var mShowGraphLauncher: ActivityResultLauncher<Intent>
    private lateinit var mContactLauncher: ActivityResultLauncher<Intent>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

        mEvaluationButton = findViewById(R.id.evaluate_button)
        mEvaluationButton.setOnClickListener {
            val i: Intent = EvaluationActivity.newIntent(this@MainActivity)
            startActivity(i)
        }
    }
}
