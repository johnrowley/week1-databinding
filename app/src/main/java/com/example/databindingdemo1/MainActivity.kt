package com.example.databindingdemo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.databinding.DataBindingUtil
import com.example.databindingdemo1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val myName: MyName = MyName("John Rowley")
    private val myAddress : MyAddress = MyAddress("dublin", "ireland")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

       binding.myName = myName
       binding.myAddress =myAddress

       val demoButton: Button = findViewById(R.id.buttonDemo)

       demoButton.setOnClickListener{ addNickName()}

    }


    public fun addNickName() {

        Log.i("DEMO","BUTTON CLICKED")
    }
}