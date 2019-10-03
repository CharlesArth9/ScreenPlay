package co.com.choucair.certification.proyectobasescreenplay.stepdefinitions;

import co.choucair.certification.proyectobasescreenplay.tasks.Abrir;
import co.choucair.certification.proyectobasescreenplay.tasks.Traducir;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class GoogleTraductorStepDefinitions {

    @Before
    public void configuracionInicial(){
        setTheStage(new OnlineCast());
    }
    @Dado("^que (.*) quiere usar el traductor de Google$")
    public void queRafaQuiereUsarElTraductorDeGoogle(String actor) {
      theActorCalled(actor).wasAbleTo(Abrir.abrirGoogle());

    }

    @Cuando("^el traduce la palabra (.*) de Inglés a Español$")
    public void elTraduceLaPalabraTableDeInglesAEspanol(String palabra)  {
       theActorInTheSpotlight().attemptsTo(Traducir.inglesEspañol(palabra));
    }

    @Entonces("^el deberia ver la palabra mesa en pantalla$")
    public void elDeberiaVerLaPalabraMesaEnPantalla()  {

    }
}
