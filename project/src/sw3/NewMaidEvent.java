/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sw3;

import java.util.Date;

/**
 *
 * @author HP
 */
public class NewMaidEvent extends Event{
    
    public NewMaidEvent(long Id, Date StartAt, Date EndAt, Maid MyMaid) {
        super(Id, StartAt, EndAt, MyMaid);
    } 

    @Override
    protected String DescriptionOfMeetting() {
        return "For Add " + MyMaid.toString();
    }
}
