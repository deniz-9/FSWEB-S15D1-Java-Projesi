package com.workintech.mobilePHONE;

public class Main {
    public static void main(String[] args) {
     mobilePhone phone = new mobilePhone("12345");
     phone.addNewContact(Contact.createContact("Bob","xxxxxx"));
        phone.addNewContact(Contact.createContact("Alice","xxxxxx"));
        phone.addNewContact(Contact.createContact("Tom","xxxxxx"));
        phone.addNewContact(Contact.createContact("Jane","xxxxxx"));

phone.printContact();
Contact emre = new Contact("Emre","123456");
phone.addNewContact(emre);
        System.out.println(phone.findContact("Alice"));
        System.out.println(phone.findContact(emre));


    }
}
