package SingleResponsibility;

import java.util.*;
public class Book {
     private int id;
   private String name;
   private String author;
    public int getId()
    {return this.id;}

    public String getName()
    {return this.name;}

    public String getAuthor()
    {return this.author;}

    public void setId(int id)
    {this.id=id;}

    public void setName(String name)
    {this.name=name;}

    public void setAuthor(String author)
    {this.author=author;}
   public Book(){
        setId(123);
        setName("Bhagavad Gita");
        setAuthor("Vyasa");
    }

    void showDetails(){

        System.out.println("The ID of the Book is "+getId());
        System.out.println("The Name of the Book is "+getName());
        System.out.println("The Author of the Book is "+getAuthor());
    }

//    void enterDetails(){
//        Scanner sc= new Scanner(System.in);
//        System.out.print("Enter the ID of the new book - ");
//        id = sc.nextInt();
//        System.out.print("Enter the name of the new book - ");
//        name = sc.next();
//        System.out.print("Enter the author of the new book - ");
//        author= sc.next();


    //   }
}

