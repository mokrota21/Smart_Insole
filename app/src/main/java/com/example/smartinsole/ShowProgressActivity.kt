package com.example.smartinsole

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
//import androidx.compose.ui.graphics.Color
import com.db.williamchart.view.LineChartView
import android.graphics.Color



class ShowProgressActivity : ComponentActivity() {

    private val lineSet = listOf(
        "Oct 23" to 5f,
        "Nov" to 4.5f,
        "Dec" to 4.7f,
        "Jan 24" to 3.5f,
        "Feb" to 3.6f,
        "Mar" to 7.5f,
        "Apr" to 7.5f,
        "May" to 10f,
        "Jun" to 5f,
        "Jul" to 6.5f,
        "Aug" to 3f,
        "Sep" to 4f
    )
    lateinit var mLineChart: LineChartView
    lateinit var mTVChartData: TextView
    val animationDuration: Long = 10
    companion object {

        fun newIntent(packageContext: Context): Intent {
            val intent = Intent(packageContext, ShowProgressActivity::class.java)
            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_progress)

        mLineChart = findViewById(R.id.lineChart)
        mTVChartData = findViewById(R.id.tvChartData)
        mLineChart.gradientFillColors =
            intArrayOf(
                Color.parseColor("#80000000"),
                Color.TRANSPARENT
            )
        mLineChart.animation.duration = animationDuration
        mLineChart.onDataPointTouchListener = { index, _, _ ->
            mTVChartData.text =
                lineSet.toList()[index]
                    .second
                    .toString()
        }
        mLineChart.animate(lineSet)
    }
}