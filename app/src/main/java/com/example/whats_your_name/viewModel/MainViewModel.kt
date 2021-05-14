package com.example.whats_your_name.viewModel

import android.view.View
import android.widget.EditText
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.whats_your_name.R

class MainViewModel : ViewModel() {
    private val mutableLiveData = MutableLiveData<String>()
    val liveData: LiveData<String> = mutableLiveData

    fun tappedButton() {
        mutableLiveData.value = "Tapped Button!!"
    }

    fun getEditText (view: View) {
//        val editText: String by lazy { view.findViewById<EditText>(R.id.editText).text.toString() }
//        mutableLiveData.value = editText
    }
}