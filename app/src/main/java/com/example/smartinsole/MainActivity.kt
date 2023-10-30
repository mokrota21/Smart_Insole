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
import com.example.smartinsole.ui.theme.AdjustActivity
import com.example.smartinsole.ui.theme.SmartInsoleTheme

class MainActivity : ComponentActivity() {
    private lateinit var mPreEvaluationButton: Button
    private lateinit var mShowGraphButton: Button
    private lateinit var mAdjustButton: Button
    private lateinit var mContactButton: Button

    private lateinit var mEvaluationLauncher: ActivityResultLauncher<Intent>
    private lateinit var mShowGraphLauncher: ActivityResultLauncher<Intent>
    private lateinit var mAdjustLauncher: ActivityResultLauncher<Intent>
    private lateinit var mContactLauncher: ActivityResultLauncher<Intent>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

        mPreEvaluationButton = findViewById(R.id.evaluate_button)
        mPreEvaluationButton.setOnClickListener {
            val i: Intent = PreEvaluationActivity.newIntent(this@MainActivity)
            startActivity(i)
        }

        mShowGraphButton = findViewById(R.id.show_graph_button)
        mShowGraphButton.setOnClickListener {
            val i: Intent = ShowProgressActivity.newIntent(this@MainActivity)
            startActivity(i)
        }

        mAdjustButton = findViewById(R.id.adjust_button)
        mAdjustButton.setOnClickListener {
            val i: Intent = AdjustActivity.newIntent(this@MainActivity)
            startActivity(i)
        }

    }
}
