package co.choucair.certification.proyectobasescreenplay.tasks;

import co.choucair.certification.proyectobasescreenplay.ui.GoogleHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task {

    private GoogleHomePage googleHomePage;
    public static Abrir abrirGoogle() {
        return Tasks.instrumented(Abrir.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(googleHomePage));

    }
}
