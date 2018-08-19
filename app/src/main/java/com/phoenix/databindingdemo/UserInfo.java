package com.phoenix.databindingdemo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class UserInfo extends BaseObservable{

    String name;

    int age;

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        notifyPropertyChanged(BR.age);
    }
}
