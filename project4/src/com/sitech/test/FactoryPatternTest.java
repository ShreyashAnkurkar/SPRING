package com.sitech.test;

import com.sitech.components.person;
import com.sitech.factory.personFactory;

public class FactoryPatternTest {
    public static void main(String[]args) {
    	person teacher=personFactory.getperson("teach");
    	System.out.println(teacher);
    	System.out.println("---------------------------");
        
    	person student=personFactory.getperson("stud");
    	System.out.println(student);
    }
}
