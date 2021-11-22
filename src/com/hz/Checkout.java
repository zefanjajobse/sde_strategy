package com.hz;

import discounts.Discount;

public class Checkout {

    private Discount discount;

    public Checkout(Discount discount) {
        this.discount = discount;
    }

    public void nextInLine(Customer customer) {

        // Welcome customer
        String welcome = String.format("Hello %s, would you pass me your shopping cart?",
                customer.getName());
        Console.write(welcome);

        // perform checkout
        ShoppingCart cart = customer.getCart();

        double amountToPay = discount.getTotalPrice(cart, customer);
        String payinfo = String.format("Let's see, that will be.. %.02f. Cash or card?", amountToPay);
        Console.write(payinfo);
    }
}
