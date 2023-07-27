package com.nphase.service;

import com.nphase.entity.ShoppingCart;

import javax.naming.OperationNotSupportedException;
import java.math.BigDecimal;

public class ShoppingCartService {

    public BigDecimal calculateTotalPrice(ShoppingCart shoppingCart) {
        return shoppingCart.getProducts()
                .stream()
                .map(product -> product.getPricePerUnit().multiply(BigDecimal.valueOf(product.getQuantity())))
                .reduce(BigDecimal::add)
                .orElse(BigDecimal.ZERO);
    }
    public BigDecimal calculateTotalPriceWithDiscount( ShoppingCart shoppingCart){
        return shoppingCart.getProducts()
            .stream()
            .map(product ->
                product.getQuantity > 3 ? product.getPricePerUnit.multiply(BigDecimal.valueOf(product.getQuantity()).multiply.valueOf(0.9)
                :product.getPricePerUnit.multiply(BigDecimal.valueOf(product.getQuantity()))))
            .reduce(BigDecimal::add)
            .orElse(BigDecimal.ZERO);

    }
}
