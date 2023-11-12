/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Solution;

import Business.Markets.Markets;
import Business.Product.Product;
import java.util.ArrayList;

/**
 *
 * @author smatcha
 */
public class SolutionCatalog {
    private ArrayList<Solution> solutions;

    public SolutionCatalog() {
        this.solutions = new ArrayList<>();
    }

    public void addSolution(Solution solution) {
        this.solutions.add(solution);
    }

    public Solution getSolution(int index) {
        return this.solutions.get(index);
    }

    public int getNumberOfSolutions() {
        return this.solutions.size();
    }

    public ArrayList<Solution> getAllSolutions() {
        return this.solutions;
    }

    public void removeSolution(Solution solution) {
        this.solutions.remove(solution);
    }

    public Solution findSolutionByName(String solutionName) {
        for (Solution solution : solutions) {
            if (solution.getName().equals(solutionName)) {
                return solution;
            }
        }
        return null;
    }

    public ArrayList<Solution> findSolutionsByDescription(String descriptionText) {
        ArrayList<Solution> matchingSolutions = new ArrayList<>();
        for (Solution solution : solutions) {
            if (solution.getDescription().contains(descriptionText)) {
                matchingSolutions.add(solution);
            }
        }
        return matchingSolutions;
    }

    // public ArrayList<Solution> findSolutionsForMarket(Markets market) {
    //     ArrayList<Solution> matchingSolutions = new ArrayList<>();
    //     for (Solution solution : solutions) {
    //         for (Product product : solution.getAllProducts()) {
    //             if (product.isAvailableInMarket(market)) {
    //                 matchingSolutions.add(solution);
    //                 break;
    //             }
    //         }
    //     }
    //     return matchingSolutions;
    // }

    @Override
    public String toString() {
        String solutionString = "";
        for (Solution solution : solutions) {
            solutionString += solution.toString() + "\n";
        }
        return solutionString;
    }
}

