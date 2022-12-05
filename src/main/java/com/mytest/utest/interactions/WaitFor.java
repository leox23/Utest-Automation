package com.mytest.utest.interactions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;

import java.time.Duration;


public class WaitFor implements Interaction {

    private Target node;
    private int noMoreThanSeconds;

    public WaitFor(Target node, int noMoreThanSeconds) {
        this.node = node;
        this.noMoreThanSeconds = noMoreThanSeconds;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Ensure.that(node.waitingForNoMoreThan(Duration.ofSeconds(noMoreThanSeconds))).isDisplayed());
    }

    public static WaitFor nodeIsAvailable(Target node, int noMoreThanSeconds){
        return Tasks.instrumented(WaitFor.class, node,noMoreThanSeconds);
    }
}
