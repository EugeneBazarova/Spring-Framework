package Homework1.Patient;

import org.springframework.stereotype.Component;

@Component("patient")
public class Patient implements PatientInterface {
    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
        System.out.println("Patient's name is " + name + ".");
    }

    @Override
    public void goToCab() {
        System.out.println("Patient go to cab");
    }

    @Override
    public void returnToRecep() {
        System.out.println("Patient returned to reception.");
    }


}
