
public class Loader
{
    public static void main(String[] args)
    {
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


    }
}