package com.example.mutablelivedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.mutablelivedata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var myviewmodel: Myviewmodel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        myviewmodel = ViewModelProvider(this).get(Myviewmodel::class.java)


        //Observe Data for First Textview
        myviewmodel.textfirstLivedata.observe(this,Observer{
            binding.textViewfirst.text = it
        })


        //Observe Data for Second TextView
        myviewmodel.textsecondLivedata.observe(this,Observer{
            binding.textViewsecond.text = it
        })


        binding.buttonfirst.setOnClickListener{
            myviewmodel.getFirstText()
        }

        //Another method for clickListner
        binding.buttonsecond.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                myviewmodel.getSecondText()
            }

        })


//        //In case of ViewModel --> No need to observe the data
//        binding.buttonfirst.setOnClickListener{
//            binding.textViewfirst.text = myviewmodel.showfirstText()
//        }
//
//        binding.buttonsecond.setOnClickListener{
//            binding.textViewsecond.text = myviewmodel.showSecondText()
//        }



    }
}