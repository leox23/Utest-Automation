package com.mytest.utest.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class Step1 {
    public static final Target TXT_FIRST_NAME = Target.the("Enter name").located(By.id("firstName"));
    public static final Target TXT_LAST_NAME = Target.the("Enter last name").located(By.id("lastName"));
    public static final Target TXT_EMAIL = Target.the("Enter email").located(By.id("email"));
    public static final Target TXT_MONTH = Target.the("boton de ingreso").located(By.id("birthMonth"));
    public static final Target TXT_SELECT_MONTH = Target.the("boton de ingreso").located(By.xpath("//option[text()='April']"));
    public static final Target TEXT_DAY = Target.the("boton de ingreso").located(By.id("birthDay"));
    public static final Target TXT_TEAR = Target.the("boton de ingreso").located(By.id("birthYear"));
    public static final Target BTN_NEXT = Target.the("boton de ingreso").located(By.className("btn btn-blue"));

}
