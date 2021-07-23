package entity;

import java.util.HashMap;
import java.util.Map;

public  class mainCl {
    public static void main(String[] args) {

        Map<Reader, Book> readerBookMap = new HashMap<Reader, Book>();
        readerBookMap.put(new Reader("John", "Wik"), new Book("Oliver Twist", "John Mon"));
        readerBookMap.put(new Reader("Piter", "Parker"), new Book("Harry Potter", "Janifer Lopez"));
        readerBookMap.put(new Reader("Sam", "Smith"), new Book("Test.com", "Savin"));
        readerBookMap.put(new Reader("Sam", "Smith"), new Book("Fsf", "DF"));

        //readerBookMap.remove(" John Wik");
        //System.out.println(readerBookMap.values());


        for(Map.Entry<Reader,Book> item: readerBookMap.entrySet() ){
            System.out.printf(" %s Взял Книгу: %s \n", item.getKey(), item.getValue());
        }

    }
}




