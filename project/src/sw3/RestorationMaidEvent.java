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
public class RestorationMaidEvent extends Event{
    
    public RestorationMaidEvent(long Id, Date StartAt, Date EndAt, Maid MyMaid) {
        super(Id, StartAt, EndAt,  MyMaid);
    }  

    @Override
    protected String DescriptionOfMeetting() {
        return "For Restoration" + MyMaid.toString();
    }
}
