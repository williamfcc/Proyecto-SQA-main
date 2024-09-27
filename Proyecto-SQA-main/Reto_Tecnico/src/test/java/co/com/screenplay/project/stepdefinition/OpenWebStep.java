package co.com.screenplay.project.stepdefinition;

import co.com.screenplay.project.tasks.ChooseFirstProductTask;
import co.com.screenplay.project.tasks.ChooseSecondProductTask;
import co.com.screenplay.project.tasks.ProductsSlectedTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.screenplay.project.utils.Constants.ACTOR;

public class OpenWebStep {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @When("Producto 1")
    public void selectTheFirstProduct() {
        OnStage.theActorCalled(ACTOR).attemptsTo(ChooseFirstProductTask.choose());
    }

    @And("Producto 2")
    public void selectTheSecondProduct() {
        OnStage.theActorCalled(ACTOR).attemptsTo(ChooseSecondProductTask.choose());
    }

    @Then("carrito de compras")
    public void willDisplayTheShoppingCart() {
        OnStage.theActorCalled(ACTOR).attemptsTo(ProductsSlectedTask.choose());
    }
}
