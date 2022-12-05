package com.mytest.utest.questions;

import com.mytest.utest.interactions.WaitFor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Text;

import static com.mytest.utest.userinterfaces.LastPage.LBL_REGISTRATION_FINAL_MSG;
import static com.mytest.utest.utils.Constants.USER_SUCCESSFULLI_CREATED;

@Subject("Know if the correct answer was obtained")
public class ValidateMensaje implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        WaitFor.nodeIsAvailable(LBL_REGISTRATION_FINAL_MSG,15);
        return USER_SUCCESSFULLI_CREATED.equals(Text.of(LBL_REGISTRATION_FINAL_MSG).viewedBy(actor).asString());
    }

    public static ValidateMensaje valMens() {
        return new ValidateMensaje();
    }
}
