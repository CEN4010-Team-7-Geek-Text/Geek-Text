package com.example.site.shoppingcart;

import com.example.site.entity.ShoppingCart;
import com.example.site.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <<interface>> ShoppingCartRepository
 * This is a Shopping Cart Repository Interface so based on this specific JPA this generates implementation code
 * so that we don't have to write SQL Queries.
 */

@Repository
public interface CartRepo extends JpaRepository<ShoppingCart, Integer>
{
    public List<ShoppingCart> findByUser(User user_Id);

    public ShoppingCart findAllBy(User user_Id);

    public ShoppingCart deleteBy(Integer user_Id, Integer productId, Integer quantity);

    public void update(Integer user_Id, Integer product_Id, Integer quantity);

}
