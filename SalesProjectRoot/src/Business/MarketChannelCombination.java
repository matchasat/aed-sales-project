/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Channels.Channels;
import Business.Markets.Markets;
import Business.Solution.Solution;
import Business.Solution.SolutionCatalog;
import java.util.ArrayList;

/**
 *
 * @author smatcha
 */
public class MarketChannelCombination {
    private Markets market;
    private Channels channel;
    private SolutionCatalog solutionCatalog;
    
    public MarketChannelCombination(Markets market, Channels channel) {
        this.market = market;
        this.channel = channel;
        this.solutionCatalog = new SolutionCatalog();
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
    
    public SolutionCatalog getSolutionCatalog() {
        return solutionCatalog;
    }

    public void addSolution(Solution solution) {
        solutionCatalog.addSolution(solution);
    }

    public ArrayList<Solution> getAllSolutions() {
        return solutionCatalog.getAllSolutions();
    }

    public Solution findSolutionByName(String solutionName) {
        return solutionCatalog.findSolutionByName(solutionName);
    }

    public ArrayList<Solution> findSolutionsByDescription(String descriptionText) {
        return solutionCatalog.findSolutionsByDescription(descriptionText);
    }

    // public ArrayList<Solution> findSolutionsForMarket(Markets market) {
    //     return solutionCatalog.findSolutionsForMarket(market);
    // }

    @Override
    public String toString() {
        return "MarketChannelCombination{" +
                "market=" + market +
                ", channel=" + channel +
                '}';
    }
}

