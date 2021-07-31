package com.example.site.shoppingcart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShoppingCartRestController
{
    @Autowired
    private ShoppingCartServices cartServices;

    @Autowired
    private Integer profileServices;

    public void add(Integer productId)
    {
        //Check if user is signed into profile, if not, send error message
        //Profile profile = profileServices.getCurrentlyLoggedInCustomer(authentication);
        //Check if user is null, if it is, send error message
        //Integer addQuantity = cartServices.addProduct(productId, quantity, profile);
        //return addQuantity;
    }

    public void delete()
    {
        //Check if user is signed into profile, if not, send an error message
        //Profile profile = profileServices.getCurrentlyLoggedInCustomer(authentication);
        //cartServices.deleteBook(profile, productId);
    }

    public void update()
    {
        //double totalAmount;
        //totalAmount = cartServices.update(user_Id, product_Id, quantity);
        //return totalAmount;
    }

}
