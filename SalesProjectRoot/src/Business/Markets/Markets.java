/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Markets;

/**
 *
 * @author smatcha
 */
public class Markets {
    private String region;
    private String country;
    private String currency;
    
    public Markets(String region, String country, String currency) {
        this.region = region;
        this.country = country;
        this.currency = currency;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Market{" +
                "region='" + region + '\'' +
                ", country='" + country + '\'' +
                ", currency='" + currency + '\'' +
                '}';
    }
}

