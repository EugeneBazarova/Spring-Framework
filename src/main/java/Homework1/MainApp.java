package Homework1;

import Homework1.Doc.Doc;
import Homework1.Patient.Patient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        ApplicationContext appCntx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        Registrate registrate = appCntx.getBean("registrate", Registrate.class);
        Patient patient = appCntx.getBean("patient", Patient.class);
        Doc doc = appCntx.getBean("doctor", Doc.class);

    }
}
