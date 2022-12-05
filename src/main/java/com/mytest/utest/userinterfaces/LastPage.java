package com.mytest.utest.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LastPage {
    public static final Target LBL_REGISTRATION_FINAL_MSG = Target.the("Final message").located(By.xpath("//div[@class='image-box-header']/h1"));
}
