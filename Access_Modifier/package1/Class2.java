package package1;
import java.util.Scanner;
class Authorize{
    private String  getAccess(){
        return "You are granted free Educte oportunity ";

        

    }
    public String getAutho(){
        return getAccess();
    }
}

public class Class2 {
      
    public static void main(String args[]){
        Class1 obj=new Class1();
        Authorize autho=new Authorize();
        Scanner input=new Scanner(System.in);
        String username;
        int password;
        System.out.print("Enter Username: ");
        username=input.nextLine().toLowerCase();
        System.out.print("\nEnter password: ");
        password=input.nextInt();
        if(obj.Authenticate(username, password)){
          System.out.println("Authentication Succesful");
          System.out.println("so you are Authorized or "+autho.getAutho());
        }
        else{
            System.out.println("Authentication failed");
        }
        obj.display();
    }
    
}
