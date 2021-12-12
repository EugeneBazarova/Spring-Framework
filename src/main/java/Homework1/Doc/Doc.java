package Homework1.Doc;

import org.springframework.stereotype.Component;

@Component("doctor")
public class Doc implements DocInterface{
    private String speciality;

    @Override
    public String getSpeciality() {
        return speciality;
    }

    @Override
    public String setSpeciality(String speciality) {
        this.speciality = speciality;
        return speciality;
    }

    @Override
    public void seePatient() {
        System.out.println("Doc started visit.");
    }

    @Override
    public void nextPatient() {
        System.out.println("Doc's finished visit and ready to see next patient.");
    }


}
