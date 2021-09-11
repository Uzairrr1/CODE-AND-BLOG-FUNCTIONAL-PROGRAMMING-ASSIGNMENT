package OpenClose;

public class Book_issued {


    String date= "08/08/2021";
    void issuedBook(String name,String userName,String c){

        System.out.println("The book "+name+" issued to "+userName+" on "+date);
        System.out.println("The category of "+name+" is "+c);
    }

    public static void main(String[] args) {
        booksOpenClosed B1 =new booksOpenClosed();
        User u1 = new User();
        Book_issued i1 =new Book_issued();
        i1.issuedBook(B1.getName(),u1.getName(),B1.category);
    }
}


