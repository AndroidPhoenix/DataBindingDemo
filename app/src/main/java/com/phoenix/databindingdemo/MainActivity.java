package com.phoenix.databindingdemo;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import com.phoenix.databindingdemo.databinding.ActivityMainBinding;

public class MainActivity extends Activity {

    EditText mName;
    EditText mAge;

    UserInfo mUser;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mUser = new UserInfo();
        binding.setUser(mUser);
        initView();
        setListener();
    }

    private void initView() {
        mName = (EditText) findViewById(R.id.edit_name);
        mAge = (EditText) findViewById(R.id.edit_age);
    }

    private void setListener() {
        mName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                mUser.setName(s.toString());
            }
        });

        mAge.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String age = s.toString();
                mUser.setAge(Integer.valueOf(age));
            }
        });
    }
}
