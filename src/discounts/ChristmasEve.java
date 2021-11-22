package discounts;

import com.hz.Customer;
import com.hz.ShoppingCart;

import products.Product;

public class ChristmasEve implements Discount {

    @Override
    public double getTotalPrice(ShoppingCart cart, Customer customer) {
        double totalPrice = 0.0;
        for(Product product : cart) {
            int index = cart.indexOf(product);
            boolean isFirstProduct = index == 0;
            
            double discount = 0.0;

            if(isFirstProduct) {
                discount = .20;
            } else {
                discount = .125;
            }

            discount = 1 - discount;

            double price = product.getPrice() * discount;

            totalPrice += price;
        }

        return totalPrice;
    }

}