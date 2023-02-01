package class17Homework;

public class Book {
    // Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
    //Instance variables are being initialized  Both Constructors are being executed
        int Id,Year;
        String title;
        String author;
        double Price;

        Book(int bId,String bTitle,String bAuthor) {
            Id = bId;
            title=bTitle;
            author=bAuthor;
        }
        Book(int bYear,String bTitle,double bPrice) {
            Year = bYear;
            title = bTitle;
            Price=bPrice;

        }
    void BookInfo(){
        System.out.println("Title: "+title+" Id: "+Id+" Author: "+author+" Year: "+Year+" Price: "+Price);
    }
    public static void main(String[] args) {
        Book book=new Book(817371146,"I AM MALALA","Christina Lamb");
        book.BookInfo();
       //Book book1=new Book(2013,"Wings of fire","Abdul Kalam");
        Book book1=new Book(2013,"Educated",19.99);
     book1.BookInfo();
    }

}
