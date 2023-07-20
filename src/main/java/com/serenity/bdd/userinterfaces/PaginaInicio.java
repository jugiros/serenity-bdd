package com.serenity.bdd.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaInicio {

    public static final Target LINK_PRODUCTO_1 = Target.the("Link para abrir el producto 1").locatedBy("//a[contains(text(), 'Samsung galaxy s6')]");
    public static final Target LINK_PRODUCTO_2 = Target.the("Link para abrir el producto 2").locatedBy("//a[contains(text(), 'Nokia lumia 1520')]");
    public static final Target LINK_HOME = Target.the("Link para ir al home").locatedBy("//a[contains(text(), 'Home ')]");
    public static final Target LINK_CARRO = Target.the("Link para ir al carro de compras").locatedBy("//a[contains(text(), 'Cart')]");

    private PaginaInicio() {
    }

}
