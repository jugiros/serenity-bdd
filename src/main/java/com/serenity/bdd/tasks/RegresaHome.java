package com.serenity.bdd.tasks;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.serenity.bdd.userinterfaces.PaginaInicio.LINK_HOME;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegresaHome implements Task {

    public static Performable regresaHome() {
        return instrumented(RegresaHome.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(LINK_HOME).afterWaitingUntilEnabled());
    }

}
