/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab16;

import java.util.ArrayList;

/**
 *
 * @author bridj
 */
public class Doctor {
    private String name;
    private String specialization;
    private ArrayList<Appointment> schedule;

    public Doctor(String name, String specialization, ArrayList<Appointment> schedule) {
        this.name = name;
        this.specialization = specialization;
        this.schedule = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public ArrayList<Appointment> getSchedule() {
        return schedule;
    }

    public void setSchedule(ArrayList<Appointment> schedule) {
        this.schedule = schedule;
    }
    
    public void addAppointment(Appointment appointment) {
        schedule.add(appointment);
    }

}
