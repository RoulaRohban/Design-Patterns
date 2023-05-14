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
public class AlertFactory {

    Alert MyAlert;

    public Alert GetAlert(String Type) {
        if (Type.equals("Notifaction")) {
            MyAlert = new NotificationAlert();
        } else if (Type.equals("Voice")) {
            MyAlert = new VoiceAlert();
        }
        return MyAlert;
    }
}
