package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnadd.setOnClickListener(View.OnClickListener{
            //     Toast.makeText(this@MainActivity,"Hello!",Toast.LENGTH_SHORT).show()
            var result = et1.text.toString().toInt()  + et2.text.toString().toInt()
            tw.text = result.toString()
        })
        btnsub.setOnClickListener( View.OnClickListener {
            var result  = et1.text.toString().toInt() - et2.text.toString().toInt();
            tw.text = result.toString();

        })
        btnmul.setOnClickListener( View.OnClickListener {
            var result  = et1.text.toString().toInt() * et2.text.toString().toInt();
            tw.text = result.toString();

        })
        btndiv.setOnClickListener( View.OnClickListener {
            var result  = et1.text.toString().toInt() / et2.text.toString().toInt();
            tw.text = result.toString();

        })
    }
}
