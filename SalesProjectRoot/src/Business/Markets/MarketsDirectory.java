/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Markets;

/**
 *
 * @author smatcha
 */
import Business.Markets.Markets;
import java.util.ArrayList;

public class MarketsDirectory {
    private ArrayList<Markets> markets;

    public MarketsDirectory() {
        this.markets = new ArrayList<>();
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
        return marketString;
    }
}

