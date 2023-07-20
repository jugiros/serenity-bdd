package com.serenity.bdd.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaCarro {

    public static final Target BUTTON_OPEN_FORM = Target.the("Botón para abrir el formulario de pago").locatedBy("//button[contains(text(), 'Place Order')]");
    public static final Target NAME_FIELD = Target.the("Campo para ingresar el nombr").locatedBy("//input[@id = 'name']");
    public static final Target COUNTRY_FIELD = Target.the("Campo para ingresar el país").locatedBy("//input[@id = 'country']");
    public static final Target CITY_FIELD = Target.the("Campo para ingresar la ciudad").locatedBy("//input[@id = 'city']");
    public static final Target CREDIT_CARD_FIELD = Target.the("Campo para ingresar la tarjeta de crédito").locatedBy("//input[@id = 'card']");
    public static final Target MONTH_FIELD = Target.the("Campo para ingresar el mes").locatedBy("//input[@id = 'month']");
    public static final Target YEAR_FIELD = Target.the("Campo para ingresar el año").locatedBy("//input[@id = 'year']");
    public static final Target BUTTON_PURCHASE = Target.the("Botón para realizar el pago").locatedBy("//button[contains(text(), 'Purchase')]");
    public static final Target BUTTON_OK = Target.the("Botón de OK luego de la compra").locatedBy("//button[contains(text(), 'OK')]");

    private PaginaCarro() {

    }
}
