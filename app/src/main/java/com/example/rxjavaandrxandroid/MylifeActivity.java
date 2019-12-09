package com.example.rxjavaandrxandroid;

import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.OnLifecycleEvent;

public class MylifeActivity  {

    //MutableLiveData :
    private MutableLiveData<String> name = new MutableLiveData<>();

    public LiveData<String> getName(){
        return  name;
    }

}
