package com.sprng;

import org.springframework.stereotype.Component;

@Component
public class Nurse implements Staff{

    public void Assisting()
    {
        System.out.println("Nurse Assisting ");
    }

}
