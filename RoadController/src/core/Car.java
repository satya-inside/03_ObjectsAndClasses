package core;

public class Car {
    public String number;
    public int height;
    public double weight;
    public boolean hasVehicle;
    public boolean isSpecial;

    public String toString() {
        String special = isSpecial ? "СПЕЦТРАНСПОРТ " : "";
        return "\n=========================================\n" +
            special + "Автомобиль с номером " + number +
            ":\n\tВысота: " + height + " мм\n\tМасса: " + weight + " кг";
    }

    public void setnumber(String setnumber)
    {
        number = setnumber;
    }

    public String getnumber()
    {
        return number;
    }

    public void setheight(int setheight)
    {
        height = setheight;
    }

    public int getheight()
    {
        return height;
    }

    public void setweight(double setweight)
    {
        weight = setweight;
    }

    public double getweight()
    {
        return weight;
    }

    public void  sethasVehicle(boolean sethasVehicle)
    {
        hasVehicle = sethasVehicle;
    }

    public boolean gethasVehicle()
    {
        return hasVehicle;
    }

    public void  setisSpecial(boolean setisSpecial)
    {
        isSpecial = setisSpecial;
    }

    public boolean getisSpecial()
    {
        return isSpecial;
    }
}