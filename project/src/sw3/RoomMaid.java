/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sw3;

/**
 *
 * @author HP
 */
public class RoomMaid implements Maid {
    private long Id;
    private String FName;
    private String LName;
    private String Nationality;
    private String Position;

    public RoomMaid(long Id, String FName, String LName, String Nationality) {
        this.Id = Id;
        this.FName = FName;
        this.LName = LName;
        this.Nationality = Nationality;
        this.Position = "Rooms";
    }

    public long getId() {
        return Id;
    }

    public void setId(long Id) {
        this.Id = Id;
    }

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }

    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String Position) {
        this.Position = Position;
    }

    @Override
    public void ShowMaidDetails() {
       System.out.println( Id + " "+ FName +" "+ LName + " " + Nationality + " " + Position );
    }

    @Override
    public boolean HasComplaint() {
      return false;
    }

    @Override
    public boolean HasAppointment() {
        return false;
    }
}
    
