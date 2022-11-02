package com.mytest.utest.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
    public static final Target  BTN_JOIN = Target.the("Login button").located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
}
