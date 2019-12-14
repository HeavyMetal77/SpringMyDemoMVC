package ua.tarastom.springdemo;

import java.util.LinkedHashMap;

public class Student {
    private String firstName;
    private String lastName;
    private String country;
    private LinkedHashMap<String, String> countryOptions;
    private String favoriteLanguage;
    private String[] operationSystem;


    public Student() {
        countryOptions = new LinkedHashMap<>();
        countryOptions.put("IN", "India"); //key/kod   - value/label
        countryOptions.put("GB", "Great Britain"); //key/kod   - value/label
        countryOptions.put("DE", "Germany"); //key/kod   - value/label
        countryOptions.put("US", "United States of America"); //key/kod   - value/label
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public String[] getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String[] operationSystem) {
        this.operationSystem = operationSystem;
    }
}
