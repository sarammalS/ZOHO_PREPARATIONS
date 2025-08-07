/**8. Design a login system that throws AuthenticationException if the username or password is incorrect.
 *  Handle it and display a login failure message.
‌ */

import java.util.*;
class customException extends Exception{
    public customException(String Message){
        super(Message);
    }
}

class Q8{
    public static void loginiscrt(String username,String pwd) throws customException{
        String admin="Sara";
        String pwd1="1456";
        if(admin.equals(username)&&(pwd.equals(pwd1))){
            System.out.println("Login Successfully");
        }
        else{
            throw  new customException("Invalid");
        }

    }
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        
            System.out.println("Enter usename");
            String username=s.nextLine();
            System.out.println("Enter Password");
            String pwd=s.nextLine();
            try{
                loginiscrt(username,pwd);
            }
            catch(customException e){
                System.out.println("Exception.caugth"+e.getLocalizedMessage());
            }
    
    }
}