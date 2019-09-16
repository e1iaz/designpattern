import builder.KFCWaiter;
import builder.Meal;
import builder.MealA;
import factorymethod.factory.Animal;
import factorymethod.factory.AnimalFactory;
import factorymethod.factory.DogFactory;
import prototype.MessageBox;
import prototype.UnderlinePen;
import prototype.framework.Manager;
import prototype.framework.Product;
import proxy.Printable;
import proxy.PrinterProxy;

public class Main {

    public static void main(String[] args) {

//        Iterator
//        BookShelf bookShelf = new BookShelf(4);
//        bookShelf.appendBook(new Book("Around"));
//        bookShelf.appendBook(new Book("Bible"));
//        bookShelf.appendBook(new Book("Cinderella"));
//        bookShelf.appendBook(new Book("Daddy"));
//        Iterator iterator = bookShelf.iterator();
//        while (iterator.hasNext()) {
//            Book book = (Book) iterator.next();
//            System.out.println(book.getName());
//        }
//
//        Adapter
//        Print p = new PrintBanner("Hello");
//        p.printWeak();
//        p.printStrong();
//
//        Adapter.Delegation.Print p2 = new Adapter.Delegation.PrintBanner("hello");
//        p2.printWeak();
//        p2.printString();
//
//        Template
//        AbstractDisplay d1 = new CharDisplay('H');
//        AbstractDisplay d2 = new StringDisplay("hello,world.");
//        AbstractDisplay d3 = new StringDisplay("你好");
//        d1.display();
//        d2.display();
//        d3.display();
//
//        Factory
//        Factory factory = new IDCardFactory();
//        Product card1 = factory.create("小明");
//        Product card2 = factory.create("小红");
//        Product card3 = factory.create("小刚");
//        card1.use();
//        card2.use();
//        card3.use();
//        System.out.println(((IDCardFactory) factory).getOwners());
//
//        Strategy
//        System.out.println("Start.");
//        Singleton obj1 = Singleton.getSingleton();
//        Singleton obj2 = Singleton.getSingleton();
//        if (obj1 == obj2) {
//            System.out.println("obj1和obj2是相同的实例");
//        } else {
//            System.out.println("obj1和obj2是不同的实例");
//        }
//        System.out.println("End.");
//
//        Strategy
//        if (args.length != 2) {
//            System.out.println("Usage: java main randomsedd1 rangdomseed2");
//            System.out.println("Example: java Main 314 15");
//            System.exit(0);
//        }
//
//        int seed1 = Integer.parseInt(args[0]);
//        int seed2 = Integer.parseInt(args[1]);
//        Player player1 = new Player("Taro", new WinningStrategy(seed1));
//        Player player2 = new Player("Hana", new ProbStrategy(seed2));
//        for (int i = 0; i < 10000; ++i) {
//            Hand nextHand1 = player1.nextHand();
//            Hand nextHand2 = player2.nextHand();
//            if (nextHand1.isStrongerThan(nextHand2)) {
//                System.out.println("Winner:" + player1);
//                player1.win();
//                player2.lose();
//            } else if (nextHand2.isStrongerThan(nextHand1)) {
//                System.out.println("Winner:" + player2);
//                player1.lose();
//                player2.win();
//            } else {
//                System.out.println("Even...");
//                player1.even();
//                player2.even();
//            }
//        }
//
//        System.out.println("Total result:");
//        System.out.println(player1.toString());
//        System.out.println(player2.toString());
//
//        Decorator
//        Display b1 = new StringDisplay("Hello,world.");
//        Display b2 = new SideBorder(b1, '#');
//        Display b3 = new FullBorder(b2);
//        b1.show();
//        b2.show();
//        b3.show();
//        Display b4 =
//                new SideBorder(
//                        new FullBorder(
//                                new FullBorder(
//                                        new SideBorder(
//                                                new FullBorder(
//                                                        new StringDisplay("hello,world")
//                                                ),
//                                                '*'
//                                        )
//                                )
//                        ), '/'
//                );
//        b4.show();
//
//        Observer
//        NumberGenerator generator = new RandomNumberGenerator();
//        Observer observer1 = new DigitObserver();
//        Observer observer2 = new GraphObserver();
//        generator.addObserver(observer1);
//        generator.addObserver(observer2);
//        generator.execute();
//
//        Printable p = new PrinterProxy("Alice");
//        System.out.println("现在的名字是" + p.getPrinterName() + "。");
//        p.setPrinterName("Bob");
//        System.out.println("现在的名字是" + p.getPrinterName() + "。");
//        p.print("Hello, world.");

//        factory
//        AnimalFactory f = new DogFactory();
//        Animal a = f.createAnimal();
//        a.eat();

//        prototype
//        Manager manager = new Manager();
//        UnderlinePen upen = new UnderlinePen('~');
//        MessageBox mBox = new MessageBox('*');
//        MessageBox sBox = new MessageBox('/');
//        manager.register("strong message", upen);
//        manager.register("warning box", mBox);
//        manager.register("slash box", sBox);
//
//        Product p1 = manager.create("strong message");
//        p1.use("Hello, world.");
//        Product p2 = manager.create("warning box");
//        p2.use("Hello, world.");
//        Product p3 = manager.create("slash box");
//        p3.use("Hello, world.");

//        builder
        MealA a = new MealA();
        KFCWaiter waiter = new KFCWaiter(a);
        Meal mealA = waiter.construct();
        System.out.println("套餐A = " + mealA.getFood() + " + " + mealA.getDrink());
    }

}
