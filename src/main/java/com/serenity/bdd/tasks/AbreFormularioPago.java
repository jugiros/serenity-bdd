package com.serenity.bdd.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.serenity.bdd.userinterfaces.PaginaCarro.BUTTON_OPEN_FORM;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbreFormularioPago implements Task {
    public static Performable abreFormularioPago() {
        return instrumented(AbreFormularioPago.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BUTTON_OPEN_FORM).afterWaitingUntilEnabled());
    }
}
