/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package registration.and.loginfeature;
import java.util.Scanner;
/**
 *
 * @author Muhammed
 */
public class RegistrationAndLoginfeature {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String username = username(sc);
        String password = Password(sc);
        String firstname = firstname(sc);
        String lastname = lastname(sc);
        boolean checkUser = checkUserName(username);
        boolean checkpass = checkPasswordComplexity(password);
        boolean register = registerUser(checkUser, checkpass);
        System.out.println("" + register);
        String loginUsername = loginUsername(sc);
        String loginPassword = LoginPassword(sc);
        boolean log = loginUser(firstname, lastname, username,  loginUsername, password, loginPassword );
        boolean stat = returnLoginStatus(log);
        System.out.println("" + stat);
        
    }
    public static String username(Scanner sc){
        System.out.println("Please Enter Username: ");
        return sc.nextLine();
    }
    public static boolean checkUserName(String username){
        boolean found = false;
        int len = username.length();
        for(int i = 0;i < len;i++){
            if(username.charAt(i) == 95 && username.length() == 5){
                found = true;
                break;
            }else{
                found = false;
            }
        }
        if(found == true){
            System.out.println("“Username successfully captured”");
            
        }
        else{
            System.out.println("“Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length .”");
        }
        return found;
    }
    public static String Password(Scanner sc){
        System.out.println("Please enter Password: ");
        return sc.nextLine();
        
    }
    public static boolean checkPasswordComplexity(String password){
        
        boolean foundlength = false;
        boolean foundcapital = false;
        boolean foundnumber = false;
        boolean foundspecial1 = false;
        boolean foundspecial2= false;
        boolean foundspecial3 = false;
        boolean foundspecial4 = false;
        int len = password.length();
        for(int i = 0;i < len; i++){
            if(password.length()>=8 ){
                foundlength = true;
                break;
            }else{
                foundlength = false;
            }
        }
        for(int i = 0;i < len; i++){
            if(password.charAt(i)>=65 && password.charAt(i)<= 90){
                foundcapital = true;
                break;
            }else{
                foundcapital = false;
            }
        }
        for(int i = 0;i < len; i++){
            if(password.charAt(i)>=48 && password.charAt(i)<=57){
                foundnumber = true;
                break;
            }else{
                foundnumber = false;
            }
        }
        for(int i = 0;i < len; i++){
            if(password.charAt(i)>=33 && password.charAt(i)<= 47){
                foundspecial1 = true;
                break;
            }else{
                foundspecial1 = false;
            }
        }
        for(int i = 0;i < len; i++){
            if(password.charAt(i)>=58 && password.charAt(i)<= 64){
                foundspecial2 = true;
                break;
            }else{
                foundspecial2 = false;
            }
        }
        for(int i = 0;i < len; i++){
            if(password.charAt(i)>=91 && password.charAt(i)<= 96){
                foundspecial3 = true;
                break;
            }else{
                foundspecial3 = false;
            }
        }
        for(int i = 0;i < len; i++){
            if(password.charAt(i)>=123 && password.charAt(i)<= 126){
                foundspecial4 = true;
                break;
            }else{
                foundspecial4 = false;
            }
        }
        boolean result= false;
        if( foundlength == true  && foundcapital == true && foundnumber == true && foundspecial1 == true || foundspecial2 == true || foundspecial3 == true || foundspecial4 == true ) {
            System.out.println("“Password successfully captured”");
            result = true;
        }else{
            System.out.println("“Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.”");
            //result = false;
        }
        return result;
    }
    public static String firstname(Scanner sc){
        System.out.println("Please Enter your First Name: ");
        return sc.nextLine();
    }
    public static String lastname(Scanner sc){
        System.out.println("Please Enter your Last Name: ");
        return sc.nextLine();
    }
    public static boolean registerUser(boolean checkUser,boolean checkpass){
        
        boolean resi = false;
        if(checkpass == true && checkUser == true){
            System.out.println("The two above conditions have been met and the user has been registered successfully.");
            resi = true;
        }
        else if(checkUser == false){
            System.out.println("The username is incorrectly formatted");
            resi = false;
        }
        else if(checkpass ==false){
            System.out.println("The password does not meet the complexity requirements.");
            resi = false;
        }
        return resi;
    }
    public static String loginUsername(Scanner sc){
        System.out.println("Please Enter your login Username: ");
        
        return sc.nextLine();
    }
    public static String LoginPassword(Scanner sc){
        System.out.println("Please Enter your login password: ");
        
        return sc.nextLine();
    }
    public static boolean loginUser(String firstname, String lastname, String username, String loginUsername,String password,String loginPassword ){
        //boolean login = false;
        
        boolean login =(loginPassword.equals(password) && loginUsername.equals(username));
        if(login == true){
            System.out.println("Wellcome " + firstname+ ", " + lastname +" it's great to see you again.");
            login = true;
        }else{
            System.out.println("Username or password incorrect, please try again.");
            login = false;
        }
        return login;
    }
    public static boolean returnLoginStatus( boolean log){
        boolean returnlogin = log;
        if(returnlogin == true){
            System.out.println("A successful login.");
            returnlogin = true;
        }else{
            System.out.println("A failed login.");
            returnlogin = false;
        }
        return returnlogin;
    }
    
}
