/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sw3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class Calendar {

    private List<Event> events ;
    private static Calendar MyInstance = null;

    private Calendar() {
    }

    public static Calendar GetInstance() {
        if (MyInstance == null) {
            MyInstance = new Calendar();
        }
        return MyInstance;
    }

    List<Event> getAllEvents() {
        return events;
    }

    public void removeEvent(Event event) {
        events.remove(event);
    }

    public void addEvent(Event event) {
        events.add(event);
    }

}
