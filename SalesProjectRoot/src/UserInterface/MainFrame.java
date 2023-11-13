/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UserInterface;

import Business.Business;
import Business.Channels.Channels;
import Business.ExcelReader;
import Business.MarketChannelCombination;
import Business.Markets.Markets;
import Business.Solution.SolutionCatalog;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author smatcha
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
    }
    
    public static void dataGenerator(){
        
        // generateDataFromExcel(); <-- Run this to get to the Excel Sheet. Need to manage and prim imports before getting to the main part.
        
        Business myBusiness = new Business("Xerox Systems");
        
        //Create and name Markets for our Business

        myBusiness.addMarket(new Markets("North America","US","USD"));
        myBusiness.addMarket(new Markets("North America","Canada","CAD"));
        myBusiness.addMarket(new Markets("Asia","India","INR"));
        myBusiness.addMarket(new Markets("Asia","China","Yuan"));
        myBusiness.addMarket(new Markets("Asia","Japan","Yen"));
        
        System.out.println(myBusiness.getAllMarkets());
                
        Markets americanMarket = myBusiness.getMarket(0);
        Markets canadianMarket = myBusiness.getMarket(1);
        Markets indianMarket = myBusiness.getMarket(2);
        Markets chineseMarket = myBusiness.getMarket(3);
        Markets japaneseMarket = myBusiness.getMarket(4);
        
        // Get the corresponding channels
        
        Channels directSalesChannel = new Channels("Direct Sales", "Selling products directly to customers without intermediaries");
        Channels retailStoresChannel = new Channels("Retail Stores", "Selling products through retail stores");
        Channels onlineMarketplacesChannel = new Channels("Online Marketplaces", "Selling products through online marketplaces");

        // Get the corresponding MarketChannel Combinations

        MarketChannelCombination americanDirectSalesChannel = new MarketChannelCombination(americanMarket, directSalesChannel);
        MarketChannelCombination canadianDirectSalesChannel = new MarketChannelCombination(canadianMarket, directSalesChannel);
        MarketChannelCombination indianDirectSalesChannel = new MarketChannelCombination(indianMarket, directSalesChannel);
        MarketChannelCombination chineseDirectSalesChannel = new MarketChannelCombination(chineseMarket, directSalesChannel);
        MarketChannelCombination japaneseDirectSalesChannel = new MarketChannelCombination(japaneseMarket, directSalesChannel);

        MarketChannelCombination americanRetailStoresChannel = new MarketChannelCombination(americanMarket, retailStoresChannel);
        MarketChannelCombination canadianRetailStoresChannel = new MarketChannelCombination(canadianMarket, retailStoresChannel);
        MarketChannelCombination indianRetailStoresChannel = new MarketChannelCombination(indianMarket, retailStoresChannel);
        MarketChannelCombination chineseRetailStoresChannel = new MarketChannelCombination(chineseMarket, retailStoresChannel);
        MarketChannelCombination japaneseRetailStoresChannel = new MarketChannelCombination(japaneseMarket, retailStoresChannel);

        MarketChannelCombination americanOnlineMarketplacesChannel = new MarketChannelCombination(americanMarket, onlineMarketplacesChannel);
        MarketChannelCombination canadianOnlineMarketplacesChannel = new MarketChannelCombination(canadianMarket, onlineMarketplacesChannel);
        MarketChannelCombination indianOnlineMarketplacesChannel = new MarketChannelCombination(indianMarket, onlineMarketplacesChannel);
        MarketChannelCombination chineseOnlineMarketplacesChannel = new MarketChannelCombination(chineseMarket, onlineMarketplacesChannel);
        MarketChannelCombination japaneseOnlineMarketplacesChannel = new MarketChannelCombination(japaneseMarket, onlineMarketplacesChannel);
        
        // Get the corresponding SolutionCatalogs
        SolutionCatalog americanDirectSalesCatalog = americanDirectSalesChannel.getSolutionCatalog();
        SolutionCatalog canadianDirectSalesCatalog = canadianDirectSalesChannel.getSolutionCatalog();
        SolutionCatalog indianDirectSalesCatalog = indianDirectSalesChannel.getSolutionCatalog();
        SolutionCatalog chineseDirectSalesCatalog = chineseDirectSalesChannel.getSolutionCatalog();
        SolutionCatalog japaneseDirectSalesCatalog = japaneseDirectSalesChannel.getSolutionCatalog();

        SolutionCatalog americanRetailStoresCatalog = americanRetailStoresChannel.getSolutionCatalog();
        SolutionCatalog canadianRetailStoresCatalog = canadianRetailStoresChannel.getSolutionCatalog();
        SolutionCatalog indianRetailStoresCatalog = indianRetailStoresChannel.getSolutionCatalog();
        SolutionCatalog chineseRetailStoresCatalog = chineseRetailStoresChannel.getSolutionCatalog();
        SolutionCatalog japaneseRetailStoresCatalog = japaneseRetailStoresChannel.getSolutionCatalog();

        SolutionCatalog americanOnlineMarketplacesCatalog = americanOnlineMarketplacesChannel.getSolutionCatalog();
        SolutionCatalog canadianOnlineMarketplacesCatalog = canadianOnlineMarketplacesChannel.getSolutionCatalog();
        SolutionCatalog indianOnlineMarketplacesCatalog = indianOnlineMarketplacesChannel.getSolutionCatalog();
        SolutionCatalog chineseOnlineMarketplacesCatalog = chineseOnlineMarketplacesChannel.getSolutionCatalog();
        SolutionCatalog japaneseOnlineMarketplacesCatalog = japaneseOnlineMarketplacesChannel.getSolutionCatalog();
        
        
    }
    private static void generateDataFromExcel() {
        String filePath = "Data/sheet0.xlsx";
        List<List<String>> tableData;
        try {
            tableData = ExcelReader.readExcelTable(filePath);
            System.out.println("Table Data:");
            for (List<String> rowData : tableData) {
                for (String cellData : rowData) {
                    System.out.print(cellData + " | ");
                }
                System.out.println();
            }
        } catch (Exception ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        dataGenerator();
        //</editor-fold>

        /* Create and display the form */
        // java.awt.EventQueue.invokeLater(new Runnable() {
        //     public void run() {
        //         new MainFrame().setVisible(true);
        //     }
        // });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
