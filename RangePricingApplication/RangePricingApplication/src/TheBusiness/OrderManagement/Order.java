/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness.OrderManagement;

import java.util.ArrayList;
import TheBusiness.CustomerManagement.CustomerProfile;
import TheBusiness.MarketModel.MarketChannelAssignment;
import TheBusiness.ProductManagement.Product;
import TheBusiness.SalesManagement.SalesPersonProfile;

/**
 *
 * @author kal bugrara
 */
public class Order {

    ArrayList<OrderItem> orderitems;
    private static int nextOrderId = 1; // Static variable to keep track of the next order ID
    private int orderId;
    CustomerProfile customer;
    SalesPersonProfile salesperson;
    MarketChannelAssignment mca;
    String status;

    public Order(){
        this.orderId = nextOrderId++;
    }
    
    public Order(CustomerProfile cp) {
        orderitems = new ArrayList();
        this.orderId = nextOrderId++;
        customer = cp;
        customer.addCustomerOrder(this); //we link the order to the customer
        salesperson = null;
        status = "in process";
    }

    public CustomerProfile getCustomer() {
        return customer;
    }
    
    public int getOrderId() {
        return orderId;
    }
    public Order(CustomerProfile cp, SalesPersonProfile ep) {
        orderitems = new ArrayList();
        this.orderId = nextOrderId++;
        customer = cp;
        salesperson = ep;
        customer.addCustomerOrder(this); //we link the order to the customer
        salesperson.addSalesOrder(this);  
    }

    public String getStatus() {
        return status;
    }
    
    public OrderItem newOrderItem(Product p, int actualprice, int q) {
        OrderItem oi = new OrderItem(p, actualprice, q);
        orderitems.add(oi);
        return oi;
    }
    //order total is the sumer of the order item totals
    public int getOrderTotal() {
        int sum = 0;
        for (OrderItem oi : orderitems) {
            sum = sum + oi.getOrderItemTotal();
        }
        return sum;
    }

    public int getOrderPricePerformance() {
        int sum = 0;
        for (OrderItem oi : orderitems) {
            sum = sum + oi.calculatePricePerformance();     //positive and negative values       
        }
        return sum;
    }

    public int getNumberOfOrderItemsAboveTarget() {
        int sum = 0;
        for (OrderItem oi : orderitems) {
            if (oi.isActualAboveTarget() == true) {
                sum = sum + 1;
            }
        }
        return sum;
    }

    public void setCustomer(CustomerProfile customer) {
        this.customer = customer;
    }

    public CustomerProfile getCustomer() {
        return customer;
    }
    
    //sum all the item targets and compare to the total of the order 
    public boolean isOrderAboveTotalTarget(){
        int sum = 0;
        for (OrderItem oi: orderitems){
            sum = sum + oi.getOrderItemTargetTotal(); //product targets are added
        }
        if(getOrderTotal()>sum) {return true;}
        else {return false;}
        
    }
public void CancelOrder(){
    status = "Cancelled";
}
public void Submit(){
    status = "Submitted";
}
}
