package com.neuedu.homewrok;

public class Mybook {
    public String name;
    public double price;
    public String press;
    public String author;
    public String bookISBM;

    public Mybook(){}
    public Mybook(String name, double price, String press, String author, String bookISBM) {
        this.name = name;
        this.price = price;
        this.press = press;
        this.author = author;
        this.bookISBM = bookISBM;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookISBM() {
        return bookISBM;
    }

    public void setBookISBM(String bookISBM) {
        this.bookISBM = bookISBM;
    }

    @Override
    public String toString() {
        return "Mybook{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", press='" + press + '\'' +
                ", author='" + author + '\'' +
                ", bookISBM='" + bookISBM + '\'' +
                '}';
    }
}
