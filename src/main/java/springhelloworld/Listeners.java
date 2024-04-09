package springhelloworld;

import org.springframework.context.event.ApplicationContextEvent;
import org.springframework.context.event.EventListener;

class Listeners {

    @EventListener
    void handleEvent(ApplicationContextEvent event) {
        System.out.println("Event triggered: " + event.getClass().getName());
    }
}

