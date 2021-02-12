
public class Cat
{
    static double count=0;
    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;
    private double maxFood = 0.0;


    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        count = count + 1;

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
        maxFood += amount;
        weight = weight + amount;
    }

    public double food()
    {
        return maxFood;
    }

    public double pee()
    {
        weight = weight - 10;
        System.out.println("Хозяин не смотри");
        return weight;
    }


    public void drink(Double amount)
    {
        weight = weight + amount;
    }

    public Double getWeight()
    {
        return weight;
    }

    public String getStatus()
    {
        if(weight < minWeight) {
            count = count - 1;
            return "Dead";
        }
        else if(weight > maxWeight) {
            count = count - 1;
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }
}