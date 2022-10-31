package com.mytest.utest.tasks;

import com.mytest.utest.models.DataUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;

import static com.mytest.utest.userinterfaces.HomePage.BTN_JOIN;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CreateUser implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_JOIN)
        );
    }

    public static CreateUser create(List<DataUser> data){
        return instrumented(CreateUser.class, data);
    }
}
