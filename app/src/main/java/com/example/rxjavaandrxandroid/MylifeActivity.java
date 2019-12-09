package com.example.rxjavaandrxandroid;

import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.OnLifecycleEvent;

public class MylifeActivity  {

    //MutableLiveData :
    public MutableLiveData<String> name = new MutableLiveData<>();
    public void setName(String chuoi){
        name.setValue(chuoi);
    }

}
