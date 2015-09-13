package com.aai.accommodateme;

import com.parse.ParseClassName;
import com.parse.ParseObject;

import java.util.Date;

/**
 * Created by AbdulMuhsin on 9/12/2015.
 */
@ParseClassName("User")
public class User extends ParseObject {

    public User(){ super(); }

    public String getID(){
        return getString("objectId");
    }
    public void setID(String id){
        put("objectId", id);
    }
    public String getUName(){
        return getString("username");
    }
    public void setUName(String username){
        put("username",username);
    }
    public String getPassword(){
        return getString("password");
    }
    public void setPassword(String password){
        put("password", password);
    }
    public boolean getBooleanVerified(){
        return getBoolean("emailVerified");
    }
    public void setBooleanVerified(boolean verified){
        put("emailVerified", verified);
    }
    public String getEmail(){
        return getString("email");
    }
    public void setEmail(String email){
        put("email",email);
    }
    public boolean getFlagged(){
        return getBoolean("flagged");
    }
    public void setFlagged(boolean flagged){
        put("flagged", flagged);
    }

}
