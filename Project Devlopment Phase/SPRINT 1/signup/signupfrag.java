package com.example.kaapalan;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class signupfrag extends Fragment {

    EditText username,Email,passwd,confirmpass;
    TextView forgetpasswd;
    Button signup;
    float v=0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.signup_frag,container,false);

        Email=root.findViewById(R.id.Email);
        username=root.findViewById(R.id.Usrname);
        confirmpass=root.findViewById(R.id.cnfpasswd);
        forgetpasswd=root.findViewById(R.id.forgetpswd);
        signup=root.findViewById(R.id.signupbutton);
        passwd=root.findViewById(R.id.passwd);

        Email.setTranslationY(800);
        forgetpasswd.setTranslationY(800);
        signup.setTranslationY(800);
        passwd.setTranslationY(800);
        username.setTranslationY(800);
        confirmpass.setTranslationY(800);

        Email.setAlpha(v);
        forgetpasswd.setAlpha(v);
        signup.setAlpha(v);
        passwd.setAlpha(v);
        username.setAlpha(v);
        confirmpass.setAlpha(v);

        Email. animate().translationY(0).alpha(1).setDuration(800).setStartDelay(300).start();
        username. animate().translationY(0).alpha(1).setDuration(800).setStartDelay(300).start();
        confirmpass. animate().translationY(0).alpha(1).setDuration(800).setStartDelay(500).start();
        forgetpasswd. animate().translationY(0).alpha(1).setDuration(800).setStartDelay(500).start();
        signup. animate().translationY(0).alpha(1).setDuration(800).setStartDelay(700).start();
        passwd. animate().translationY(0).alpha(1).setDuration(800).setStartDelay(500).start();

        return  root;
    }
}
