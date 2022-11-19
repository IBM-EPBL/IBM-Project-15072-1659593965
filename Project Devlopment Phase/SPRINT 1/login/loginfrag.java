package com.example.kaapalan;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class loginfrag extends Fragment {

    EditText Email,passwd;
    Button login;
    TextView forgetpasswd;
    float v=0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.login_frag,container,false);

        Email=root.findViewById(R.id.Email);
        forgetpasswd=root.findViewById(R.id.forgetpswd);
        login=root.findViewById(R.id.loginbutton);
        passwd=root.findViewById(R.id.passwd);

        Email.setTranslationY(800);
        forgetpasswd.setTranslationY(800);
        login.setTranslationY(800);
        passwd.setTranslationY(800);

        Email.setAlpha(v);
        forgetpasswd.setAlpha(v);
        login.setAlpha(v);
        passwd.setAlpha(v);

        Email. animate().translationY(0).alpha(1).setDuration(800).setStartDelay(300).start();
        forgetpasswd. animate().translationY(0).alpha(1).setDuration(800).setStartDelay(500).start();
        login. animate().translationY(0).alpha(1).setDuration(800).setStartDelay(700).start();
        passwd. animate().translationY(0).alpha(1).setDuration(800).setStartDelay(500).start();



        return  root;
}}
