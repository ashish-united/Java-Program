 @FunctionalInterface
 interface sayable{
void say(String msg);
 }
 public class py implements sayable{
public void say(String msg){
System.out.println(msg);
}
public static void main(String[] args) {
py fie = new py();
fie.say("Hello there");
 }
 }