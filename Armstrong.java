import java.lang.Math;

class Armstrong
{
        public static void main(String[] args)
         {
            int c,b,d=0,h=0;
            b=Integer.parseInt(args[0]);
           int g=b,f=b;
           while(g>0)
           {
                 h++;
                g=g/10;
           }
            while(b>0)
            {
                c=b%10;
                d+=Math.pow(c,h);
                b=b/10;
            }
            if(d==f)
            {
                System.out.println("Number is Armstrong");
            }
            else
            {
                System.out.println("Number is not Armstrong");
            }
         }
}