package com.mytest.utest.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class Step2 {
    public static final Target TXT_CITY = Target.the("City field").located(By.id("city"));
    public static final Target TXT_ZIP = Target.the("Zip or Postal Code field").located(By.id("zip"));
    public static final Target BTN_CITY = Target.the("Next: Devices button").located(By.xpath("//a[@class='btn btn-blue pull-right']"));
}

