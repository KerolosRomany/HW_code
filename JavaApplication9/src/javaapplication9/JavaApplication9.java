/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;
import java.util.Scanner;   
import java.util.ArrayList; // import the ArrayList class
class User  //can register as a player or playground owner
{
    private ArrayList<String> name= new ArrayList<>();
    private int id;
    private int phone;
    private ArrayList<String> email = new ArrayList<>() ; //to check it in log in
    private ArrayList<String> password=new ArrayList<>(); //to check it in log in
    private ArrayList<String> location= new ArrayList<>();
    private int num_of_playground;
    public static int i =0; 
    
    public User(String name ,int id,int phone ,String email ,String password, String location){
        this.name.add(name);  //add in arraylist
        this.id=id;
        this.phone=phone;
        this.location.add(location); //add in arraylist
        this.email.add(email); //add in arraylist
        this.password.add(password);  //add in arraylist
        i++;
    }
    public User()
    {   /*
        this.name="";
        this.id=0;
        this.phone=0;
        this.location = "";
        this.email.add("unknown");
        this.password.add("unknown");
        */
    }
    public boolean checkAccount(String email,String password)
    {
        for (int k=0;k<i;k++)
        {
            
            if (this.email.get(k).equals(email) && this.password.get(k).equals(password))
            {
                return true;
            }
            
        }
        
        return false;
        
    }
    public void signUp(String name ,int id,int phone ,String email ,String password, String location){
        this.name.add(name);
        this.id=id;
        this.phone=phone;
        this.location.add(location);
        this.email.add(email); //add in arraylist
        this.password.add(password);  ////add in arraylist
        i++;
    }
    
}
public class JavaApplication9 {

    public static void main(String[] args) {
         
        System.out.println("Welcome in GoFo system ");
        System.out.println("Choose ");
            
        System.out.println("1.Sign up & login");
        System.out.println("2.Exit");
        Scanner in = new Scanner(System.in);
        int c1 = in.nextInt();
        if (c1==1)
        {
            System.out.println("Please enter your name ");
            String name = in.next();
            System.out.println("Enter your ID ");
            int ID = in.nextInt();
            System.out.println("Enter your phone number ");
            int phone = in.nextInt();
            System.out.println("Enter your default location ");
            String location = in.next();
            System.out.println("Enter your email ");
            String email = in.next();
            System.out.println("Enter your password");
            String password = in.next();
            System.out.println("Name: "+name+", ID: "+ID+", location: "+location+", email: "+email);
            System.out.println("Data is saved");
            User u=new User(name,ID,phone,email,password,location);
            
            System.out.println("To confirm Please enter your email and password");
            email = in.next();
            password = in.next();
            u.checkAccount(email, password);
            while (true){
            if (u.checkAccount(email, password)==true)
            {
                System.out.println("Log in successfully");
                break;
            }
            
            else if (u.checkAccount(email, password)== false)
            {
                System.out.println("Wrong email or password, please try again");
                System.out.println("Enter email and password");
                email = in.next();
                password = in.next();
            }
            
            }
        }
        else
        {
            System.exit(0);
        }
        }
    }
    
    
