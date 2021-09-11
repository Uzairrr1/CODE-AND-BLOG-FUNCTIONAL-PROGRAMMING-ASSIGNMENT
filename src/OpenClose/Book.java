package OpenClose;

public class Book {
    int id;
    String name;
    String author;

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
}

