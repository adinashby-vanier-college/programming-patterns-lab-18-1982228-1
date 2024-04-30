/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab16;

/**
 *
 * @author bridj
 */
public class DoctorNotificationHandler implements Observer {

    private Doctor doctor;

    public DoctorNotificationHandler(Doctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public void update(String message) {
        System.out.println("Notification for Dr. " + doctor.getName() + ": " + message);
    }
}
