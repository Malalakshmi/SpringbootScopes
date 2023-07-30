package com.learningTech;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringBean.class);
        Doctor doctor = context.getBean(Doctor.class);
        doctor.Assist();
        doctor.setQualification("MBBS");
        System.out.println(doctor);

       /* Doctor doctor1 = context.getBean(Doctor.class);
        doctor1.Assist();

        System.out.println(doctor1);*/

        

    }
}