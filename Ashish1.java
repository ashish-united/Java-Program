class Vehicle1{
    void start()
    {
        System.out.println("Car is starting");
    }
    void stop()
    {
        System.out.println("Car is stoping");
    }
}
class Bmw extends Vehicle1{
    void Engine()
    {
        System.out.println("It has V8 Engine");
    }
}
class Audi extends Vehicle1{
    void wheel()
    {
        System.out.println("It has 4 Wheel");
    }
}
class Suv extends Vehicle1{
    void Roading()
    {
        System.out.println("It is good for off raoding");
    }
}
public class Ashish1{
    public static void main(String[] args)
     {
        Bmw mycarBmw= new Bmw();
        System.out.println("Properties of Bmw");
        mycarBmw.Engine();
        mycarBmw.start();
        mycarBmw.stop();
        Audi mycarAudi= new Audi();
        System.out.println("Properties of Audi");
        mycarAudi.wheel();
        mycarAudi.start();
        mycarAudi.stop();
        Suv mycarSuv= new Suv();
        System.out.println("Properties of Suv");
        mycarSuv.Roading();
        mycarAudi.start();
        mycarAudi.stop();
     }
}