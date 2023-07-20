package com.serenity.bdd.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static com.serenity.bdd.userinterfaces.PaginaInicio.LINK_PRODUCTO_1;

public class AbreProducto implements Task {

    public static Performable abreVentanaProducto() {
        return instrumented(AbreProducto.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LINK_PRODUCTO_1).afterWaitingUntilEnabled());
    }

}
