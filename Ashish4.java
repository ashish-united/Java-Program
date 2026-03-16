class  product{
    public double  prod(double  a, double  b , double  c)
    {
        return a+b+c;
    }
}

class add extends product{
    public int  prod(int a, int b , int c)
    {
        return a*b*c;
    }
}
public class Ashish4{
      public static void main(String[] args) {
        add p =new add();
        System.out.println(p.prod(1.1,4.1,5.1));
    }
}
