/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab16;

/**
 *
 * @author bridj
 */
public class ReceptionistNotificationHandler implements Observer {
    private Receptionist receptionist;

    public ReceptionistNotificationHandler(Receptionist receptionist) {
        this.receptionist = receptionist;
    }

    @Override
    public void update(String message) {
        System.out.println("Notification for Receptionist " + receptionist.getName() + ": " + message);
    }
}
