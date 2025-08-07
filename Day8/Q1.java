/*. Illustrates with an example of using Singleton class.*/
class Singleton{
    private static Singleton ins;
    private Singleton(){
        System.out.println("Singleton object created");
    }
    public static Singleton getinstance(){
        if(ins==null){
            ins= new Singleton();
        }
        return ins;
    }
    public void message(){
        System.out.println("Call");
    }

}
public class Q1{
    public static void main(String[] args){
        Singleton obj1=Singleton.getinstance();
        obj1.message();
    } 
}