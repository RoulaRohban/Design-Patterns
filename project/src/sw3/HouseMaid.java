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
public class HouseMaid implements Maid {

    private List<Maid> MaidList = new ArrayList<Maid>();
     @Override
    public void ShowMaidDetails() {
       for(Maid maid:MaidList) 
        { 
            maid.ShowMaidDetails();
        }
    }
     public void addMaidHouse(Maid maid) 
    { 
        MaidList.add(maid); 
    } 
       
    public void removeMaidHouse(Maid maid) 
    { 
        MaidList.remove(maid); 
    } 

    @Override
    public boolean HasComplaint() {
      return false;
    }

    @Override
    public boolean HasAppointment() {
        return false;
    }

    public HouseMaid() {
    }
    
}
