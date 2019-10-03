package co.choucair.certification.proyectobasescreenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class Traducir implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

    }
    public static  Traducir inglesEspañol(String palabra) {
        return Tasks.instrumented(Traducir.class);
    }


}
