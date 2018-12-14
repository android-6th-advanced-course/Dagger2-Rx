package com.example.rathana.mvp_dagger2_demo.data;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.Preference;

import com.example.rathana.mvp_dagger2_demo.model.User;

import javax.inject.Inject;

public class UserPreference {
    public static final String USER_PRE="user_pre";
    public static final String ID="id";
    public static final String NAME="name";
    public static final String GENDER="gender";
    public static final String EMAIL="email";
    public static final String PASSWORD="password";

    private Context mContext;
    private SharedPreferences preference;

    @Inject
    public UserPreference(Context mContext) {
        this.mContext = mContext;
        preference=mContext.getSharedPreferences(USER_PRE,Context.MODE_PRIVATE);
    }

    public void save(User user){
        SharedPreferences.Editor editor=preference.edit();
        editor.putInt(ID,user.getId());
        editor.putString(NAME,user.getName());
        editor.putString(GENDER,user.getGender());
        editor.putString(EMAIL,user.getEmail());
        editor.putString(PASSWORD,user.getPassword());
        editor.apply();
    }

    public User get(){
        return new User(
                preference.getInt(ID,0),
                preference.getString(NAME,""),
                preference.getString(EMAIL,""),
                preference.getString(GENDER,""),
                preference.getString(PASSWORD,"")
        );
    }

}
