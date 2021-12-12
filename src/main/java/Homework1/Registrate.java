package Homework1;

import org.springframework.stereotype.Component;

@Component("registrate")
public class Registrate {


    void visitDoc() {
        System.out.println("The patient wants to visit a doctor.");
    }

    void takeCardFromArchives() {
        System.out.println("Patient's card was brought from the archive.");
    }

    void goToDoc() {
        System.out.println("The patient has an appointment.");
    }

    public void docSpeciality(String speciality) {
        System.out.println("Patient need to visit a " + speciality);
    }

    void showPath() {
        System.out.println("Patient can go to the doctor's office. ");
    }
}