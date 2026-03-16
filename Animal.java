class Dog
 {
    void name()
    {
        System.out.println("Puppy");
    }
    void makeSound()
   {
     System.out.println("cry...");
   }

}
class Animal extends Dog
{
    @Override
    void makeSound()
    {
        System.out.println("bark bark...");
    }
    public static void main(String[] args) {
        Animal A= new Animal();
        A.name();
        A.makeSound();
    }
}

