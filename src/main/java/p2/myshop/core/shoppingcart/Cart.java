package p2.myshop.core.shoppingcart;

import java.util.List;

public class Cart {
    private final List<CartItem> items;

    public Cart(List<CartItem> items) {
        this.items = items;
    }

    public List<CartItem> items() {
        return items;
    }
}
