package com.learningTech;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Scope(scopeName = "prototype")
public class Doctor implements Staff, BeanNameAware {
    public String getQualification() {
        return Qualification;
    }

    public void setQualification(String qualification) {
        Qualification = qualification;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "Qualification='" + Qualification + '\'' +
                '}';
    }

    public String Qualification;
    public void Assist(){
        System.out.println("Doctor is Assisting");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("set bean name method is called");
    }
    @PostConstruct
    public void postConstruct(){
        System.out.println("post construct method has been called");
    }
}
