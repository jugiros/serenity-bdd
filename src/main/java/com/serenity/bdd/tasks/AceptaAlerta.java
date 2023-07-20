package com.serenity.bdd.tasks;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AceptaAlerta implements Task {

    public static Performable aceptaAlerta() {
        return instrumented(AbreProducto.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Serenity.getDriver().switchTo().alert().accept();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
