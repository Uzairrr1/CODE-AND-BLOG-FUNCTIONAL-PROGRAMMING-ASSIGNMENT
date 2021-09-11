package OpenClose;


public class booksOpenClosed extends Book {
    String category;
    public String getCategory()
    {
        return this.category;
    }
    public void setId(int id)
    {
        this.id=id;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public void setAuthor(String author)
    {
        this.author=author;
    }

    public void setCategory(String category){
        this.category=category;
    }

       booksOpenClosed(){
       setId(124);
       setName("Ramayana");
      setAuthor("Sage valmiki");
       setCategory("Religious");

    }
}
