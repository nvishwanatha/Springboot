package com.sprng;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Scope(scopeName = "prototype")
public class Doctor implements Staff , BeanNameAware {

    private String qualification ;
    public void Assisting()
    {
        System.out.println("------> Doctor Assisting ");
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "qualification='" + qualification + '\'' +
                '}';
    }


    @Override
    public void setBeanName(String s) {
        System.out.println("Set Bean name Method is Called !!!");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("Post Construct Method is Called");
    }
}
