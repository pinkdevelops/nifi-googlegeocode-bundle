package org.apache.nifi.processors.googlegeocode.util;

import org.apache.nifi.processors.googlegeocode.GoogleGeocode;

/**
 * Created by dpinkston on 6/25/16.
 */
public class GoogleGeocodeURLBuilder {

    private String address;
    private String city;
    private String state;

    public GoogleGeocodeURLBuilder(){}

    public GoogleGeocodeURLBuilder(String address, String city, String state, String apiKey){
        this.address = address.trim().replaceAll("\\s", "+");
        this.city = city.trim().replaceAll("\\s", "+");
        this.state = state.trim();
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

    public String getFormattedAddress(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.address).append(" ").append(this.city).append(", ").append(this.state);
        return sb.toString();
    }
}
