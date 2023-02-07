package class18;
//Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
//Instance variables are being initialized . Both Constructors are being executed
public class Book {
    int Id,Year;
    String title;
    String author;
    double Price;

    Book(int Id,String Title,String Author) {
       this.Id = Id;
        this.title=Title;
       this.author=Author;
    }
    Book(int Year,String Title,double Price) {
        this.Year = Year;
        this.title = Title;
        this.Price=Price;
    }

    public static void main(String[] args) {
        Book bk=new Book(458932,"Malala","bella");

    }
}
