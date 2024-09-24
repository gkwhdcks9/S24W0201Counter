package kr.ac.kumoh.ce.s20201240.s24w0201counter

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kr.ac.kumoh.ce.s20201240.s24w0201counter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var main: ActivityMainBinding
    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        main = ActivityMainBinding.inflate(layoutInflater)
        //setContentView(R.layout.activity_main)
        setContentView(main.root)

        main.btnAdd.setOnClickListener {
            main.txtCount.text = (++count).toString() //${++count}
        }
        main.btnSub.setOnClickListener{
            if(count > 0)
                main.txtCount.text = (--count).toString()
        }
        main.btnReset.setOnClickListener{
            count = 0
            main.txtCount.text = "$count"
        }
    }
}