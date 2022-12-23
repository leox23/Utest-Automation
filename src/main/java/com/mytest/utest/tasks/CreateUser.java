package com.mytest.utest.tasks;

import com.mytest.utest.interactions.WaitFor;
import com.mytest.utest.models.DataUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;
import java.util.List;

import static com.mytest.utest.userinterfaces.HomePage.BTN_JOIN;
import static com.mytest.utest.userinterfaces.Step1.*;
import static com.mytest.utest.userinterfaces.Step2.*;
import static com.mytest.utest.userinterfaces.Step3.*;
import static com.mytest.utest.userinterfaces.Step4.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CreateUser implements Task {

    private List<DataUser> data;
    public CreateUser(List<DataUser> data){
        this.data = data;
    }

    @Step("Register user in the Advantage webpage")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                // Homepage
                WaitFor.nodeIsAvailable(BTN_JOIN,15),
                Click.on(BTN_JOIN),

                // Step1
                Enter.theValue(data.get(0).getFirstname()).into(TXT_FIRST_NAME),
                Enter.theValue(data.get(0).getLastname()).into(TXT_LAST_NAME),
                Enter.theValue(data.get(0).getEmail()).into(TXT_EMAIL),
                Click.on(TXT_MONTH),
                Click.on(TXT_SELECT_MONTH.of(data.get(0).getMonth())),
                Click.on(TXT_DAY),
                Click.on(TXT_SELECT_DAY.of(data.get(0).getDay())),
                Click.on(TXT_YEAR),
                Click.on(TXT_SELECT_YEAR.of(data.get(0).getYear())),
                Click.on(BTN_NEXT),

                // Step2
                WaitUntil.the(TXT_CITY, isVisible()).forNoMoreThan(15).seconds(),
                Enter.theValue(data.get(0).getCity()).into(TXT_CITY),
                SendKeys.of(Keys.ARROW_DOWN, Keys.ENTER).into(TXT_CITY),
                Enter.theValue(data.get(0).getZip()).into(TXT_ZIP),
                Click.on(BTN_CITY),

                // Step3
                WaitUntil.the(BTN_DEVICES, isVisible()).forNoMoreThan(15).seconds(),
                Click.on(BTN_DEVICES),
                WaitUntil.the(TXT_PASS, isVisible()).forNoMoreThan(15).seconds(),
                Enter.theValue(data.get(0).getPass()).into(TXT_PASS),
                Enter.theValue(data.get(0).getConfirmpass()).into(TXT_CONF_PASS),
                Click.on(CHK_STAY_INFORM),
                Click.on(CHK_TERMS),
                Click.on(CHK_PRIVACY),
                Click.on(BTN_FINISH)
                );
    }

    public static CreateUser create(List<DataUser> data){
        return instrumented(CreateUser.class, data);
    }
}
