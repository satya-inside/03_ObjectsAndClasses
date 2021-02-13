
public class Cat
{
    public static final int EYE_COUNT = 2;
    public static final int MINIMAL_Weight = 800;
    public static final int MAXIMAL_Weight = 35000;

    static double count=0;
    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;
    private double maxFood = 0.0;

    private boolean isdeath;
    private Enum color;


    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        count = count + 1;
        isdeath = false;

    }

    public Cat(double weight)
    {
        this.weight = weight;
    }

    public static double getCount()
    {
        return count;
    }

    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void feed(Double amount)
    {
        if (isdeath) System.out.println("Кошка неживая");
                else {
            maxFood += amount;
            weight = weight + amount;

        }
    }

    public double food()
    {
        return maxFood;
    }

    public double pee()
    {
        if (isdeath) {
            System.out.println("Кошка неживая");
            return weight;
        }
        else {
            weight = weight - 10;
            System.out.println("Хозяин не смотри");
            return weight;
        }
    }


    public void drink(Double amount)
    {
        if (isdeath) {
            System.out.println("Кошка неживая");
        }
        else {
            weight = weight + amount;
        }
    }

    public Double getWeight()
    {
        return weight;
    }

    public String getStatus()
    {
        if(weight < minWeight) {
            isdeath = true;
            count = count - 1;
            return "Dead";
        }
        else if(weight > maxWeight) {
            count = count - 1;
            isdeath = true;
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }

    public void setColor(Enum getColor)
    {
        color=getColor;
    }

    public Enum getColor()
    {
        return color;
    }




}