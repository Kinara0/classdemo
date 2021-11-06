package com.company;

import java.util.Date;

public class Test {
    public static void main(String[] args) {

        Person p = new Person();
        p.setId(900);
        p.setName("Mr. Patel");
        p.setAddress("Address1");
        p.setAge(0);
        p.setEmail("abc@xyz.com");
        p.setDob(new Date());

        System.out.println(p.getId());
        System.out.println(p.getName());
        System.out.println(p.getAddress());
        System.out.println(p.getAge());
        System.out.println(p.getEmail());
        System.out.println(p.getDob());
        System.out.println(p);

    }
}
