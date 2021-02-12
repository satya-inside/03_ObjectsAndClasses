
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

// 3 lesson
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


    }
}