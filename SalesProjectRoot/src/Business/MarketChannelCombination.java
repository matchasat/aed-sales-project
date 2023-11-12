/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Channels.Channels;
import Business.Markets.Markets;

/**
 *
 * @author smatcha
 */
public class MarketChannelCombination {
    private Markets market;
    private Channels channel;

    public MarketChannelCombination(Markets market, Channels channel) {
        this.market = market;
        this.channel = channel;
    }

    public Markets getMarket() {
        return market;
    }

    public void setMarket(Markets market) {
        this.market = market;
    }

    public Channels getChannel() {
        return channel;
    }

    public void setChannel(Channels channel) {
        this.channel = channel;
    }

    @Override
    public String toString() {
        return "MarketChannelCombination{" +
                "market=" + market +
                ", channel=" + channel +
                '}';
    }
}

