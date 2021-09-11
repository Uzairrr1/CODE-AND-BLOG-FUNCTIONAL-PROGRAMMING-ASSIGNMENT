package SingleResponsibility;


public class Book_issued {


    String date= "08/08/2021";
    void issuedBook(String name,String n){

        System.out.println("The book "+name+" issued to "+n+" on "+date);
    }

    public static void main(String[] args) {
        Book B1 =new Book();
        User u1 = new User();
        Book_issued i1 =new Book_issued();
        i1.issuedBook(B1.getName(),u1.getName());
    }
}


