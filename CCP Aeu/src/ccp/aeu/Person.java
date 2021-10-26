/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccp.aeu;

/**
 *
 * @author Ghufran Tripa
 */
public class Person {
    String name;
    int age;
    String phone;
    String address;
    int salary;

    /**
     *
     * @param name
     * @param age
     * @param phone
     * @param address
     * @param salary
     */
    protected void Person(String name, int age, String phone, String address, int salary) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
        this.salary = salary;
    }
}


protected void printAttributes() {

        System.out.println("name : " + name);
        System.out.println("age : " + age);
        System.out.println("phone : " + phone);
        System.out.println("address : " + address);
        System.out.println("salary : " + salary);

    }
public static void main(String[] args) {
       
        Employee emp = new Employee("Marcus Rashford", 23, "081387442121", "Manchester,Britania Raya", 10000000 );
        emp.printAttributes();  
    }
