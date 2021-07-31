
package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class RatingDisplay 
{
    @RequestMapping(value = "/products/{url}")
public String displayProductByUrl(@PathVariable("url") String url, Model model) 
{
 
Book product = productService.fingProductByUrl(url);
model.addAttribute("Book",product);
Review newReview = new Review();
newReview.setProduct(product);
newReview.setRating(5);
model.addAttribute("review",newReview);
return "Book Reviewed";
}
    
    @RequestMapping("/url")
    public String page(Model model) {
        model.addAttribute("attribute", "value");
        return "view.name";
    }
    
}
