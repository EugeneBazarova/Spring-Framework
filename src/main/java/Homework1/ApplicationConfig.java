package Homework1;

import Homework1.Doc.Doc;
import Homework1.Patient.Patient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "Homework1")
class ApplicationConfig {

    @Bean
    public Registrate registrate() {
        return new Registrate();
    }

    @Bean
    public Doc doc() {
        return new Doc();
    }

    @Bean
    public Patient patient(Registrate registrate, Doc doc) {
        registrate.visitDoc();
        Patient patient = new Patient();
        patient.setName("Test");
        registrate.takeCardFromArchives();
        registrate.docSpeciality(doc.setSpeciality("therapist."));
        registrate.goToDoc();
        registrate.showPath();
        patient.goToCab();
        doc.seePatient();
        doc.nextPatient();
        patient.returnToRecep();
        return patient;
    }

}
