public class factcmd {
    public static void main(String[] args) 
    {
        int a =Integer.parseInt(args[0]);
        int fact=1;
        for(int i=a;i>1;i--)
        {
            fact=fact*i;
        }
       System.out.println("factorial "+fact);
    }
}
