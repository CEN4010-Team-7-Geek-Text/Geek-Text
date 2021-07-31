package com.example.site.entity;

import javax.persistence.*;

@Entity
@Table(name = "shopping_cart")

public class ShoppingCart
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cart_id;

    @ManyToOne
    @Column(name = "user_id")
    private User user_Id;

    //Change Product(Book_Browsing?) data type
    @ManyToOne
    @Column(name = "product_id")
    private Integer product_Id;

    //Doesn't need to be in the database. Remove?
    @Column
    private int quantity;
    private double totalAmount = product_Id * quantity;


    public ShoppingCart()
    {

    }

    public ShoppingCart(Integer cart_id, User user_Id, Integer productId, int quantity)
    {
        super();
        this.cart_id = cart_id;
        this.user_Id = user_Id;
        this.product_Id = product_Id;
        this.quantity = quantity;
    }

    public double getCart_Id()
    {
        return cart_id;
    }

    public void setCart_Id(Integer cart_id)
    {
        this.cart_id = cart_id;
    }

    public User getUser_Id()
    {
        return user_Id;
    }

    public void setUser_Id(User user_Id)
    {
        this.user_Id = user_Id;
    }

    public double getProduct_Id()
    {
        return product_Id;
    }

    public void setProduct_Id(Integer product_Id)
    {
        this.product_Id = product_Id;
    }

    public double getTotalAmount()
    {
        return totalAmount;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
}
