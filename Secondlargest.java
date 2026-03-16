public class Secondlargest {
    public static void main(String[] args)
    {    
    int[] arr= new int[10];
    for(int i=0;i<(args.length);i++)
    {
      arr[i]=Integer.parseInt(args[i]);
    }
    for (int i = 0; i<args.length-1; i++) 
    {
     for(int j=0;j<args.length-1-i;j++)
        {
           if(arr[j]>arr[j+1])
           {
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
           }
        }
    }
    System.out.println("second largest"+arr[args.length-2]);
 }
}

