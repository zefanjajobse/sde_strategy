package discounts;

import com.hz.Customer;
import com.hz.ShoppingCart;

public interface Discount {
    double getTotalPrice(ShoppingCart cart, Customer customer);
}
