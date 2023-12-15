package aop;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    public void checkOut(){
        System.out.println("Checkout Method of ShoppingCart");
    }
}
