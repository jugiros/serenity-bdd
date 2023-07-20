package com.serenity.bdd.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaProducto {

    public static final Target BUTTON_ADD_PRODUCT = Target.the("Botón para aregar el producto").locatedBy("//a[contains(text(), 'Add to cart')]");

    private PaginaProducto() {

    }

}
