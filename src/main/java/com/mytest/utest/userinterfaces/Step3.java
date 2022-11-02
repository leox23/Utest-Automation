package com.mytest.utest.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class Step3 {
    public static final Target BTN_DEVICES = Target.the("Next: Last Step button").located(By.xpath("//a[@class='btn btn-blue pull-right']"));
}
