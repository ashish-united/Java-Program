public class Math
{
    public int sum(int a,int b)
    {
        return a+b;
    }
    public double sum(double a,double b)
    {
        return a+b;
    }
    public int  sum( int a, int b, int c)
    {
        return a+b+c;
   
    } 

    public static void main(String[] args) 
    {
        Math s1 = new Math();
        System.out.println(s1.sum(8,9));
        System.out.println(s1.sum(8.4,9.65));
       System.out.println(s1.sum(9, 7, 4));
    }
    
}
