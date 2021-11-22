package discounts;

import com.hz.Customer;
import com.hz.ShoppingCart;

import products.Product;

public class BlackFriday implements Discount {

    @Override
    public double getTotalPrice(ShoppingCart cart, Customer customer) {
        double totalPrice = 0.0;
        double discount = 0.0;
        
        if (cart.size() < 80) {
            discount = 1 - (cart.size() / 100.0);
        } else {
            discount = 1 - 0.8;
        }

        for(Product product : cart) {
            totalPrice += product.getPrice() * discount;
        }

        return totalPrice;
    }
    
}
