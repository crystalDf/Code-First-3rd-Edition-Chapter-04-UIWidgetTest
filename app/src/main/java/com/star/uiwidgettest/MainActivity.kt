package com.star.uiwidgettest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
//            val inputText = editText.text.toString()
//            Toast.makeText(this, inputText, Toast.LENGTH_SHORT).show()

//            imageView.setImageResource(R.drawable.img_2)

//            progressBar.visibility = when(progressBar.visibility) {
//                View.VISIBLE -> View.GONE
//                else -> View.VISIBLE
//            }

//            progressBar.progress += 10

            AlertDialog.Builder(this).apply {
                setTitle("This is a Dialog")
                setMessage("Something important.")
                setCancelable(false)
                setPositiveButton("OK") { dialog, which ->  }
                setNegativeButton("Cancel") { dialog, which ->  }
                show()
            }
        }
    }
}
