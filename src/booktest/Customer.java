/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booktest;

public class Customer {
    private String name;
    private String email;
    private int contactNumber;

    public Customer(String name, String email, int contactNumber) {
        this.name = name;
        this.email = email;
        this.contactNumber = contactNumber;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + getName() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", contactNumber=" + getContactNumber() +
                '}';
    }
}
