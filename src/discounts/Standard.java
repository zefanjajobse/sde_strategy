package discounts;

import com.hz.Customer;
import com.hz.ShoppingCart;

import products.Product;

public class Standard implements Discount {
    
    @Override
    public double getTotalPrice(ShoppingCart cart, Customer customer) {
        double discount = 0.0;
        double normalPrice = 0.0;
        for(Product product : cart) {
            normalPrice += product.getPrice();
        }

        if(customer.isRegular()) {
            discount = .15;
        }
        discount = 1 - discount;

        return normalPrice * discount;
    }
    
}
