package com.serenity.bdd.interactions;

import com.serenity.bdd.models.FormularioPago;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static com.serenity.bdd.userinterfaces.PaginaCarro.NAME_FIELD;
import static com.serenity.bdd.userinterfaces.PaginaCarro.COUNTRY_FIELD;
import static com.serenity.bdd.userinterfaces.PaginaCarro.CITY_FIELD;
import static com.serenity.bdd.userinterfaces.PaginaCarro.CREDIT_CARD_FIELD;
import static com.serenity.bdd.userinterfaces.PaginaCarro.MONTH_FIELD;
import static com.serenity.bdd.userinterfaces.PaginaCarro.YEAR_FIELD;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LlenarFormularioCompra implements Interaction {

    private final String name;
    private final String country;
    private final String city;
    private final String card;
    private final String month;
    private final String year;

    public LlenarFormularioCompra(String name, String country, String city, String card, String month, String year) {
        this.name = name;
        this.country = country;
        this.city = city;
        this.card = card;
        this.month = month;
        this.year = year;
    }

    @Override
    @Step("#actor ingresa las credenciales")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(name).into(NAME_FIELD),
                Enter.theValue(country).into(COUNTRY_FIELD),
                Enter.theValue(city).into(CITY_FIELD),
                Enter.theValue(card).into(CREDIT_CARD_FIELD),
                Enter.theValue(month).into(MONTH_FIELD),
                Enter.theValue(year).into(YEAR_FIELD)
        );
    }

    public static Performable conModelo(FormularioPago formularioPago) {
        return instrumented(LlenarFormularioCompra.class,
                formularioPago.getName(),
                formularioPago.getCountry(),
                formularioPago.getCity(),
                formularioPago.getCreditCard(),
                formularioPago.getMonth(),
                formularioPago.getYear());
    }
}
