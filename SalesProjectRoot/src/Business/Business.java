/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Markets.Markets;
import java.util.ArrayList;

/**
 *
 * @author smatcha
 */
public class Business {
    private ArrayList<Markets> markets;
    private String name;

    public Business(String name) {
        this.name = name;
        this.markets = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addMarket(Markets market) {
        this.markets.add(market);
    }

    public Markets getMarket(int index) {
        return this.markets.get(index);
    }

    public int getNumberOfMarkets() {
        return this.markets.size();
    }

    public ArrayList<Markets> getAllMarkets() {
        return this.markets;
    }

    public void removeMarket(Markets market) {
        this.markets.remove(market);
    }

    @Override
    public String toString() {
        String marketString = "";
        for (Markets market : markets) {
            marketString += market.toString() + "\n";
        }
        return "Business{" +
                "markets=" + marketString +
                ", name='" + name + '\'' +
                '}';
    }
}
