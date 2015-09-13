package com.aai.accommodateme;

import com.parse.ParseClassName;
import com.parse.ParseGeoPoint;
import com.parse.ParseObject;

/**
 * Created by AbdulMuhsin on 9/12/2015.
 */
@ParseClassName("Location")
public class Location extends ParseObject {
    public Location(){ super(); }
    public String getID(){
        return getString("objectId");
    }
    public void setID(String id){
        put("objectId", id);
    }
    public ParseGeoPoint getCoordinates(){
        return getParseGeoPoint("coordinates");
    }
    public void setCoordinates(ParseGeoPoint coordinates){
        put("coordinates",coordinates);
    }
    public String getInfo(){
        return getString("info");
    }
    public void setInfo(String info){
        put("info", info);
    }
    public String getLocType(){
        return getString("locationType");
    }
    public void setLocType(String locType){
        put("locationType", locType);
    }
    public Number getPhone(){
        return getNumber("phoneNum");
    }
    public void setPhone(Number num){
        put("phoneNum",num);
    }
    public String getWebsite(){
        return getString("website");
    }
    public void setWebsite(String website){
        put("website",website);
    }
    public boolean getFlagged(){
        return getBoolean("flagged");
    }
    public void setFlagged(boolean flagged){
        put("flagged", flagged);
    }
}
