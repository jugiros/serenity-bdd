package com.serenity.bdd.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static com.serenity.bdd.userinterfaces.PaginaProducto.BUTTON_ADD_PRODUCT;

public class AgregaProducto implements Task {

    public static Performable agregaProducto() {
        return instrumented(AgregaProducto.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BUTTON_ADD_PRODUCT).afterWaitingUntilEnabled());
    }

}
