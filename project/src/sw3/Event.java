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
public abstract class Event {

    private long Id;
    private Date StartAt;
    private Date EndAt;
    Maid MyMaid;

    public Event(long Id, Date StartAt, Date EndAt, Maid MyMaid) {
        this.Id = Id;
        this.StartAt = StartAt;
        this.EndAt = EndAt;
        this.MyMaid = MyMaid;
    }

    ///Step which difference between Child
    protected abstract String DescriptionOfMeetting();

    /////constante in each child 
    private long DurationOfMeetting() {
        return EndAt.getTime() - StartAt.getTime();

    }

    public long getId() {
        return Id;
    }

    public void setId(long Id) {
        this.Id = Id;
    }

    @Override
    public String toString() {
        return Id + " " + StartAt + " " + EndAt + " " + " " + MyMaid;
    }

}
