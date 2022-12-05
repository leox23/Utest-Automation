package com.mytest.utest.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;


public class Step1 {
    public static final Target TXT_FIRST_NAME = Target.the("Name field").located(By.id("firstName"));
    public static final Target TXT_LAST_NAME = Target.the("Last name field").located(By.id("lastName"));
    public static final Target TXT_EMAIL = Target.the("Email field").located(By.id("email"));
    public static final Target TXT_MONTH = Target.the("Month field").located(By.id("birthMonth"));
    public static final Target TXT_SELECT_MONTH = Target.the("Required month").locatedBy("//option[text()='{0}']");
    public static final Target TXT_DAY = Target.the("Day field").located(By.id("birthDay"));
    public static final Target TXT_SELECT_DAY = Target.the("Required day").locatedBy("//option[text()='{0}']");
    public static final Target TXT_YEAR = Target.the("Year field").located(By.id("birthYear"));
    public static final Target TXT_SELECT_YEAR = Target.the("Required year").locatedBy("//option[text()='1991']");
    public static final Target BTN_NEXT = Target.the("Next: Location button").located(By.xpath("//a[@class='btn btn-blue']"));
}
