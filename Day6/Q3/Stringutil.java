package stringutils;
public class Stringutil{
    public String concat(String a, String b){
        return (a+b);
    }
    public String reverse(String a){
       String reversed = new StringBuilder(a).reverse().toString();
       return reversed;
    }
    public int lengthh(String a){
        return a.length();
    }

}

