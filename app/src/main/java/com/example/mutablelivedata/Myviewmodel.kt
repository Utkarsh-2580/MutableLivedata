package com.example.mutablelivedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Myviewmodel : ViewModel() {


    var textfirstLivedataobj = MutableLiveData<String>("Utkarsh Parekh")
    var textsecondLivedataonbj = MutableLiveData<String>("Twara Parekh")

    //If we don't want to expose our data that can be overwrite then

    val textfirstLivedata : LiveData<String>
    get() = textfirstLivedataobj

    val textsecondLivedata : LiveData<String>
    get() = textsecondLivedataonbj



    fun getFirstText(){
        textfirstLivedataobj.value = textfirst
    }

    fun getSecondText(){
        textsecondLivedataonbj.value = textsecond
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