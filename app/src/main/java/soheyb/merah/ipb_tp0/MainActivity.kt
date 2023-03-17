package soheyb.merah.ipb_tp0

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var content: TextView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        content = findViewById(R.id.counter);
    }

    var idx = 0;
    fun increment(view: View) {
        idx++;
        content.text =  idx.toString()
    }
}