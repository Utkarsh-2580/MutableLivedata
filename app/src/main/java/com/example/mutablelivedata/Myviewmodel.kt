package com.example.mutablelivedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Myviewmodel : ViewModel() {


    var textfirstLivedata = MutableLiveData<String>("Utkarsh Parekh")
    var textsecondLivedata = MutableLiveData<String>("Twara Parekh")


    fun getFirstText(){
        textfirstLivedata.value = textfirst
    }

    fun getSecondText(){
        textsecondLivedata.value = textsecond
    }

    //In case of ViewModel
    private var textfirst = "My First Text"
    private var textsecond = "My Second Text"

    fun showfirstText() : String{
        return textfirst
    }

    fun showSecondText() : String{
        return textsecond
    }




}