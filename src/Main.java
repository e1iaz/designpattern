import Adapter1.Print;
import Adapter1.PrintBanner;

public class Main {

    public static void main(String[] args){

        /*  Iterator
        BookShelf bookShelf=new BookShelf(4);
        bookShelf.appendBook(new Book("Around"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy"));
        Iterator iterator=bookShelf.iterator();
        while(iterator.hasNext()){
            Book book=(Book)iterator.next();
            System.out.println(book.getName());
        }
        */

        Print p=new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();

        Adapter2.Print p2=new Adapter2.PrintBanner("hello");
        p2.printWeak();
        p2.printString();

    }

}
