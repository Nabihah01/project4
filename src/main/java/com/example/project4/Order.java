package com.example.project4;

import java.util.ArrayList;

/**
 *  An instance of this class has a unique order number
 *  and keeps the list of menu items added by the user.
 *   @author Nabihah, Maryam
 */
public class Order implements Customizable {
    private ArrayList<MenuItem> orders;
    private int orderNumber;
    private double total;

    /**
     * constructor for order object
     * @param orders arrayList
     * @param orderNumber int
     */
    public Order(ArrayList<MenuItem> orders, int orderNumber){
        this.orders = orders;
        this.orderNumber = orderNumber;
        this.total = 0;
    }

    /**
     * overrides method, adds new order object to list
     * @param obj object to be added
     * @return boolean
     */
    @Override
    public boolean add(Object obj) {
        if(obj instanceof MenuItem){
            MenuItem item = (MenuItem) obj;
            orders.add(item);
            return true;
        }
        return false;
    }

    /**
     * overrides method, removes order object to list
     * @param obj object to be removed
     * @return boolean
     */
    @Override
    public boolean remove(Object obj) {
        if(obj instanceof MenuItem){
            MenuItem item = (MenuItem) obj;
            orders.remove(item);
            return true;
        }
        return false;
    }

    /**
     * getter method for orders
     * @return orders
     */
    public ArrayList<MenuItem> getOrders() {
        return orders;
    }

    /**
     * getter method for ordernumber
     * @return order number
     */
    public int getOrderNumber() {
        return orderNumber;
    }

    /**
     * setter method for total amount for order
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * calculates total for order
     * @return total
     */
    public double getTotal() {
        double total = 0;
        for(int i = 0; i < orders.size(); i++) {
            total += orders.get(i).itemPrice();
        }
        return total;
    }

    /**
     * overrides toString method
     * @return string form of order object
     */
    @Override
    public String toString(){
        StringBuilder userOrders = new StringBuilder();
        for(int i = 0; i < orders.size(); i++){
            userOrders.append(orders.get(i).toString()).append(System.lineSeparator());
        }
        return userOrders.toString();
    }
}
