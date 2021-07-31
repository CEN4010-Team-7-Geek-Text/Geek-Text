package com.example.site.shoppingcart;

import com.example.site.User.DatabaseUserDetailsService;
import com.example.site.entity.ShoppingCart;
import com.example.site.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class ShoppingCartController
{
    /**
     * The @Autowire handles are dependency injections. Automatically insert an instance of the
     * ShoppingCartServices class into the controller
     */
    @Autowired
    private ShoppingCartServices cartServices;

    @Autowired
    private DatabaseUserDetailsService userServices;

    //Spring framework to show the shopping cart.
    @GetMapping(value = "/cart")
    public String showCart(Model model)
    {
        //User user = userServices.getUserByUsername();
        //cartServices.listAll(user);

        model.addAttribute("cart", new ShoppingCart());
        return"shopping_cart";
    }

    public Integer add(Integer productId, Integer quantity, User user_Id)
    {
        //User profile = userServices.getUserByUsername();
        Integer add = cartServices.addBook(productId, quantity, user_Id);

        return add;
    }

    public void delete(User user_Id, Integer product_Id, Integer quantity)
    {
        //User profile = userServices.getUserByUsername();
        cartServices.deleteBook(user_Id, product_Id, quantity);
    }

    public double update(User user_Id, Integer product_Id, Integer quantity)
    {
        //User profile = userServices.getUserByUsername();
        double totalAmount;
        totalAmount = cartServices.updateBook(user_Id, product_Id, quantity);
        return totalAmount;
    }
}
