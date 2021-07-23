package entity;
public class Book {
    private String title;
    private String author;

    //конструктор
    public Book(String title, String author){

        this.title = title;
        this.author = author;

    }



    public String toString(){
        return "Book [title=" + title
                +", author =" + author + "]";
    }


}

