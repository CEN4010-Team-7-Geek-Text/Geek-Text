package com.example.site.shoppingcart;

import java.util.List;

import com.example.site.entity.ShoppingCart;
import com.example.site.entity.User;
import com.example.site.shoppingcart.CartRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ShoppingCartServices must be able to:
 * 1. Must be able to update the shopping cart with a book.
 * 2. Must be able to retrieve the list of book(s) in the shopping cart
 * 3. Must be able to delete a book from the shopping cart instance for that user
 * 4. Must be able to create a shopping cart instance for a user. Shopping care must belong to a user
 */

@Service
public class ShoppingCartServices
{
    @Autowired
    private CartRepo cartRepo;

    @Autowired
    //private Book_Browsing bookRepo;

    public List<ShoppingCart> listAll(User profile)
    {
        return cartRepo.findByUser(profile);
    }

    /**
     * If the users shopping cart is not empty, the shopping cart quantity will increase as books are
     * added. If the shopping cart is empty/does not exist, we will create a new shopping cart for the
     * customer when they decide to add a book into their cart.
     *
     * We will then save shopping cart changes by calling the springframework data cart repository we created.
     */
    public Integer addBook(Integer productId, Integer quantity, User user_Id)
    {
        Integer add = quantity;

        //BookBrowsing book;
        //book = bookRepo.findById(productId).get();

        ShoppingCart shoppingCart = cartRepo.findAllBy(user_Id);
        if(shoppingCart != null)
        {
            add = shoppingCart.getQuantity() + quantity;
            shoppingCart.setQuantity(add);
        }
        else
        {
            shoppingCart = new ShoppingCart();
            shoppingCart.setQuantity(quantity);
            shoppingCart.setUser_Id(user_Id);
            //shoppingCart.setProduct_Id(productId);
        }
        cartRepo.save(shoppingCart);
        return add;
    }

    public void deleteBook(User user_Id, Integer productId, Integer quantity)
    {
        cartRepo.deleteBy(user_Id.getId(), productId, quantity);
    }

    public double updateBook(User user_Id, Integer product_Id, Integer quantity)
    {
        cartRepo.update(user_Id.getId(), product_Id, quantity);
        //BookBrowsing book = productRepo.findById(product_Id).get();
        //double totalAmount = book.getTotalAmount() * quantity;
        //return totalAmount;
    }

}
