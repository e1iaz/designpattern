import Adapter.Inheritance.Print;
import Adapter.Inheritance.PrintBanner;
import Factory_Method.framework.Factory;
import Factory_Method.framework.Product;
import Factory_Method.idcard.IDCardFactory;
import Singleton.Singleton;
import Template.AbstractDisplay;
import Template.CharDisplay;
import Template.StringDisplay;

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

        /*  Adapter
        Print p=new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();

        Adapter.Delegation.Print p2=new Adapter.Delegation.PrintBanner("hello");
        p2.printWeak();
        p2.printString();
        */

        /* Template
        AbstractDisplay d1=new CharDisplay('H');
        AbstractDisplay d2=new StringDisplay("hello,world.");
        AbstractDisplay d3=new StringDisplay("你好");
        d1.display();
        d2.display();
        d3.display();
        */

        /*  Factory
        Factory factory=new IDCardFactory();
        Product card1=factory.create("小明");
        Product card2=factory.create("小红");
        Product card3=factory.create("小刚");
        card1.use();
        card2.use();
        card3.use();
        System.out.println(((IDCardFactory) factory).getOwners());
        */

        System.out.println("Start.");
        Singleton obj1=Singleton.getSingleton();
        Singleton obj2=Singleton.getSingleton();
        if(obj1==obj2){
            System.out.println("obj1和obj2是相同的实例");
        }else {
            System.out.println("obj1和obj2是不同的实例");
        }
        System.out.println("End.");


    }

}
