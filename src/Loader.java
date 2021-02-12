
public class Loader
{

    public static void main(String[] args) {
/* 1 lesson
        Cat cat = new Cat();
        System.out.println(cat.getWeight());
        System.out.println(cat.getStatus());
        //=================
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        System.out.println(cat1.getWeight());
        cat1.feed(2.0);
        System.out.println(cat1.getWeight());
        System.out.println(cat2.getWeight());
        cat2.feed(3.0);
        System.out.println(cat2.getWeight());
        //=================
        Cat cat3 = new Cat();
        System.out.println("вес 3 кошки= "+cat3.getWeight());
        cat3.feed(10000.0);
        System.out.println("вес 3 кошки= "+cat3.getWeight());
        System.out.println("статус 3 кошки= "+cat3.getStatus());
        //=================
        int i=1;
        while (!(cat2.getStatus()=="Dead")) {
            cat2.meow();
        }
        System.out.println("статус 2 кошки= "+cat2.getStatus());
1 lesson */

/* 2 lesson
        Cat cat4 = new Cat();
        System.out.println("вес 4 кошки = " +cat4.getWeight());
        cat4.feed(150.0);
        for (int i = 1; i<5; i++){
            cat4.pee();
        }
        System.out.println("кошка 2 съела = " +cat4.food());
        System.out.println("вес 4 кошки = " +cat4.getWeight());
2 lesson */

/* 3 lesson
        Cat cat5 = new Cat();
        Cat cat6 = new Cat();
        Cat cat7 = new Cat();
        System.out.println(Cat.getCount());
        while (!(cat5.getStatus()=="Dead")) {
            cat5.meow();
        }
        System.out.println(Cat.getCount());

        while (!(cat6.getStatus()=="Exploded")) {
            cat6.feed(100.0);
        }
        System.out.println(Cat.getCount());
3 lesson */

/* 3 lesson extra
        Cat cat8 = new Cat();
        Cat cat9 = new Cat();
        Cat cat10 = new Cat();
        while (!(cat8.getStatus()=="Dead")) {
            cat8.meow();
        }
        System.out.println(cat8.getStatus());

        while (!(cat9.getStatus()=="Exploded")) {
            cat9.feed(100.0);
        }
        System.out.println(cat9.getStatus());

        cat8.feed(10.0);
        cat8.pee();
        cat8.drink(10.0);

        cat9.feed(10.0);
        cat9.pee();
        cat9.drink(10.0);

        System.out.println(cat10.getWeight());
        cat10.feed(10.0);
        cat10.pee();
        cat10.drink(15.0);
        System.out.println(cat10.getWeight());
3 lesson extra */

//4 lesson

// 5 lesson
        Cat cat11 = new Cat(1500.0);
        System.out.println(cat11.getWeight());

        Cat cat12 = getKitten();
        System.out.println("котенок 12 весит = "+cat12.getWeight());
        Cat cat13 = getKitten();
        System.out.println("котенок 13 весит = "+cat13.getWeight());
        Cat cat14 = getKitten();
        System.out.println("котенок 14 весит = "+cat14.getWeight());
    }


    private static Cat getKitten()
    {
        return new Cat (1100.0);
    }
}