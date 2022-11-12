package com.mytest.utest.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Text;

import static com.mytest.utest.userinterfaces.LastPage.LBL_MENS;

@Subject("Know if the correct answer was obtained")
public class ValidateMensaje implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return "Welcome to the world's largest community of freelance software testers!".equals(Text.of(LBL_MENS).viewedBy(actor).asString());
    }

    public static ValidateMensaje valMens() {
        return new ValidateMensaje();
    }
}
