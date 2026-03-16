abstract class bike{
     abstract void run();
}
class Ashish5 extends bike{
    @Override
    void run(){System.out.println("He is Running");}
    public static void main(String[] args) {
        bike obj =new Ashish5();
        obj.run();
    }
}