class MyException extends Exception
{
    MyException(String msg)
    {
        super(msg);
    }
}
public class UserException 
    {
        public static void main(String [] arg)
        {
            int age=17;
            try{
                if(age<=18)
                    throw new MyException("Your Age is Below 18");
            }
            catch(MyException ex)
            {
                System.out.println(ex.getMessage());
            }
            finally
            {
                System.out.println("End of program");
            
            }
        }
    }   

