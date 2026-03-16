class Vehicle{
 void start()
 {
    System.out.println("Vehicle is starting");
 }
 void stop()
 {
    System.out.println("vehicle is stoping");
 }
}

 class Car extends Vehicle
 {
    void wheel()
    {
        System.out.println("It has four wheel");
    }
 }
 class Bmw extends Car 
 {
  void Engine()
  {
    System.out.println("It has V8 Engine");
  }
  
 }
 public class Ashish{
   public static void main(String[] args)
   {
      Bmw myCarBmw= new Bmw();
      myCarBmw.start();
      myCarBmw.stop();
      myCarBmw.wheel();
      myCarBmw.Engine();
  }
 }