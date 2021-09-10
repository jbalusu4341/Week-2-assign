/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booktest;

import java.util.Scanner;
public class BookTest {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        Scanner ac= new Scanner(System.in);

        System.out.println("Enter the Book Title:");
        String bookTitle = sc.nextLine();


        System.out.println("Enter the Book Author:");
        String bookAuthor = sc.nextLine();

        System.out.println("Enter the Book Publisher:");
        String bookPublisher = sc.nextLine();

        System.out.println("Enter the Book Year:");
        int year = ac.nextInt();

        System.out.println("Enter the Book Price:");
        double bookPrice = ac.nextDouble();

        Book book = new Book(bookTitle, bookAuthor, year, bookPublisher, bookPrice);

        System.out.println("Enter the Customer Name:");
        String CustomerName = sc.nextLine();

        System.out.println("Enter the Customer Email:");
        String CustomerEmail = sc.nextLine();

        System.out.println("Enter the Customer contactNumber:");
        int CustomerNumber = sc.nextInt();

        System.out.println("Book Details");
        System.out.println(book.toString());

        System.out.println();
        Customer customer1 = new Customer(CustomerName,CustomerEmail,CustomerNumber);
        System.out.println("Customer Details");
        System.out.println(customer1.toString());
    }
}