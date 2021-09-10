/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booktest;

public class Book extends BookPrice{
    private String title;
    private String author;
    private int year;
    private String publisher;
    private double price;

    public Book(String title, String author, int year, String publisher, double price) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.publisher = publisher;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String getPublisher() {
        return publisher;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public double Price() {
        return getPrice();
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + getTitle() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", year=" + getYear() +
                ", publisher='" + getPublisher() + '\'' +
                ", price=" + Price() +
                '}';
    }
}
