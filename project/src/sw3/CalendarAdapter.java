/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sw3;

import java.util.ArrayList;
import static java.util.Collections.list;

/**
 *
 * @author HP
 */
public class CalendarAdapter implements Target{
    private Calendar CalendarService;
    public void connect(Calendar currentCalendar)
    {
        this.CalendarService=currentCalendar;
    }
    @Override
    public ArrayList<Event> MySortingEvents() {
        //get events without sorting from Calendar library
       ArrayList<Event> events=(ArrayList<Event>) CalendarService.getAllEvents();
       //then sorting my events
       sorting(events);
       //then return the sorting events
       return events;
    }
    
   public void sorting(ArrayList<Event> SortingEvents)
   {
       
   }
}
