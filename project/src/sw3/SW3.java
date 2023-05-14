/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sw3;

import java.util.Date;
import java.util.List;

/**
 *
 * @author HP
 */
public class SW3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //1
        Maid room1=new RoomMaid(1, "Dana", "Tabaa", "Syrian");
        Maid room2=new RoomMaid(2, "Rahaf", "neser", "Syrian");
        Maid kitchen1=new KitchenMaid(3, "rima", "dardar", "Syrian");
       HouseMaid House=new HouseMaid();
        House.addMaidHouse(room1);
        House.addMaidHouse(room2);
        House.addMaidHouse(kitchen1);
        House.ShowMaidDetails();
        
        
        //2
        Target T=new CalendarAdapter();
        List<Event> myEvents=T.MySortingEvents();
        for(Event event:myEvents) 
        { 
            System.out.println(event);
        }
        
        
        //3
        
        Calendar Unique = Calendar.GetInstance();
        
        
        //4
        
        AlertFactory alert=new AlertFactory();
       Alert MyAlert= alert.GetAlert("Voice");
       //MyAlert.GetType(); // print Voice
        
        //5
        Date date=new Date();
        
    }  
}
