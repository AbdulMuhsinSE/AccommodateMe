package com.aai.accommodateme;

import com.parse.ParseFile;
import com.parse.ParseObject;

import java.io.ByteArrayInputStream;
import java.io.File;

/**
 * Created by AbdulMuhsin on 9/12/2015.
 */
public class Image extends ParseObject {
    public String getID(){
        return getString("objectId");
    }
    public void setID(String id){
        put("objectId", id);
    }
    public ParseFile getImage(){
        return getParseFile("image");
    }
    public void setImage(ParseFile image){
        put("image",image);
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
