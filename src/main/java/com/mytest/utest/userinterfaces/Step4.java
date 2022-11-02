package com.mytest.utest.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class Step4 {
    public static final Target TXT_PASS = Target.the("Password field").located(By.id("password"));
    public static final Target TXT_CONF_PASS = Target.the("Password confirmation field").located(By.id("confirmPassword"));
    public static final Target CHK_STAY_INFORM = Target.the("Stay informed! checkbox").located(By.xpath("//span[@class='checkmark signup-consent__checkbox signup-consent__checkbox--highlight']"));
    public static final Target CHK_TERMS = Target.the("Terms of Use checkbox").located(By.xpath("//span[@class='checkmark signup-consent__checkbox error'][1]"));
    public static final Target CHK_PRIVACY = Target.the("Privact & Security Policy checkbox").located(By.xpath("//span[@class='checkmark signup-consent__checkbox error']"));
    public static final Target BTN_FINISH = Target.the("Last step button").located(By.xpath("//a[@class='btn btn-blue']"));

}
