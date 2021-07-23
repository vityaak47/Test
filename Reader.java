package entity;


public class Reader {
    private  String lastName;
    private String name;

    //конструктор
    public Reader(String name, String lastName){

        this.name = name;
        this.lastName = lastName;

    }



    public String toString(){
        return "Reader [title=" + name
                +", lastName =" + lastName + "]";
    }

}

