package org.apache.nifi.processors.googlegeocode.util;

import org.apache.nifi.processors.googlegeocode.GoogleGeocode;

/**
 * Created by dpinkston on 6/25/16.
 */
public class GoogleGeocodeURLBuilder {

    private String address;
    private String city;
    private String state;
    private String apiKey;
    private final String baseURL = "https://maps.googleapis.com/maps/api/geocode/json?address=";


    public GoogleGeocodeURLBuilder(){}

    public GoogleGeocodeURLBuilder(String address, String city, String state, String apiKey){
        this.address = address.trim().replaceAll("\\s", "+");
        this.city = city.trim().replaceAll("\\s", "+");
        this.state = state.trim();
        this.apiKey = apiKey.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getGoogleGeocodeURL(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.baseURL).append(this.address).append(",+").append(this.city).append(",+").append(this.state).append("&key=").append(this.apiKey);
        return sb.toString();

    }


}
