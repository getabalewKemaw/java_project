package package1;
import java.util.Scanner;
 
public class Class1{
    
    void display(){
        System.out.println("this is defualt access modifier");

    }
    boolean Authenticate(String Username,int password){
     if(Username.equals("letakasahun") && password==1234){
        return true;
     }
     else {
        return false;
     }
    }

    public static void main(String args[]){

    }


}


public class day1{
    public static void main(String args[]){
        System.out.println("Hello java ")
    }      
}
