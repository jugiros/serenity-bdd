package com.serenity.bdd.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.serenity.bdd.userinterfaces.PaginaInicio.LINK_PRODUCTO_2;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbreNuevoProducto implements Task {

    public static Performable abreNuevoProducto() {
        return instrumented(AbreNuevoProducto.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LINK_PRODUCTO_2).afterWaitingUntilEnabled());
    }

}
