package com.aai.accommodateme;

import com.parse.ParseClassName;
import com.parse.ParseObject;

/**
 * Created by AbdulMuhsin on 9/12/2015.
 */
@ParseClassName("Accommodation")
public class Accommodation extends ParseObject {
    public Accommodation(){ super(); }

    public String getID(){
        return getString("objectId");
    }
    public void setID(String id){
        put("objectId", id);
    }
    public String getAccType(){
        return getString("accType");
    }
    public void setAccType(String accType){
        put("accType",accType);
    }
    public boolean getFlagged(){
        return getBoolean("flagged");
    }
    public void setFlagged(boolean flagged){
        put("flagged", flagged);
    }
    /*public Relation<Location> getLocationID(){
        return getLocationID();
    }*/
}
