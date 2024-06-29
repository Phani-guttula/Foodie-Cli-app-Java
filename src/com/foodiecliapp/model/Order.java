package com.foodiecliapp.model;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Order {
    /*
    add the following properties
    --------------------------------------
    Datatype                  variable
    --------------------------------------
    String                      id
    Customer                    customer
    Restaurant                  restaurant
    List<Dish>                  dishes
    double                      price
    Date                        order date
     */

    /*
    1. All the fields should be private
    2. Create only no-arg constructor
    3. Create Getters and Setter methods
    4. Override hashCode() and equals() methods
    5. Override toString() methods
     */
    private String id;
    private String customer;
    private String restaurent;
    private List<Dish> dishes;
    private double price;
    private Date orderdate;

    public Order() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getRestaurent() {
        return restaurent;
    }

    public void setRestaurent(String restaurent) {
        this.restaurent = restaurent;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Double.compare(price, order.price) == 0 && Objects.equals(id, order.id) && Objects.equals(customer, order.customer) && Objects.equals(restaurent, order.restaurent) && Objects.equals(dishes, order.dishes) && Objects.equals(orderdate, order.orderdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, customer, restaurent, dishes, price, orderdate);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", customer='" + customer + '\'' +
                ", restaurent='" + restaurent + '\'' +
                ", dishes=" + dishes +
                ", price=" + price +
                ", orderdate=" + orderdate +
                '}';
    }
}
