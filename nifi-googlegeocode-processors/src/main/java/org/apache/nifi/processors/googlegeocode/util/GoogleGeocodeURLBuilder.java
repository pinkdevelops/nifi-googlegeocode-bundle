/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.nifi.processors.googlegeocode.util;

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
