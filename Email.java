import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity =5000;
    private int defaultPasswordLength =10;
    private String alternateEmail;
    private String companySuffix = "aeycompany.com";
    //Constructor to receive the first name and last name
    public Email(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        System.out.println("EMAIL CREATED: "+this.firstName+" " +this.lastName);
        //Call a method asking for the department-return the department
        this.department=setDepartment();
        System.out.println("Department: "+this.department);
        //Call a method that returns a random password
        //After setting all the conditon required to set the password than after return
        this.password= randomPassword(defaultPasswordLength);
System.out.println("Your password is: "+ this.password);
    
    //Combine elements to generate password
    email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+ department+"." + companySuffix;
System.out.println("Your email is: "+email);
}
    //Ask For the department 
    private String setDepartment(){
        System.out.println(" DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if(depChoice==1){
            return "Sales";
        }
        else if(depChoice == 2){
            return "dev";
        }
        else if(depChoice == 3){
            return "acct";
        }
        else{return " ";}
    }
    //Generate a random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRESTUVWXYZ0123456789!@#%&*";//giving here a array try to find the number
        char[] password = new char[length];
        //grap a value inside of the array
        for(int i=0;i<length;i++){
            //for random numbers we find
            int rand = (int)(Math.random()*passwordSet.length());//This is done by multiply it to  the given length take only that charcteronly
            password[i]= passwordSet.charAt(rand);
        }
        //return the password 
        return new String(password);

    }
    //Set the mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;//Encapsulation in public so that we could accept some property and hidding the actual problem
    }
    //Set the alternate email
    public void setAlternateEmail(String altEmail){
this.alternateEmail = altEmail;
    }
    //Change the password
    public void  changePassword(String password){
        this.password = password;
    }
public int getMailCapacity(){return mailboxCapacity;}
//mailbox capacity is the class variable//The Starting of the getMethod
public String getAlternateEmail(){
    return alternateEmail;}//alternateEmail here is a variable not a method 
    //by using here this type of varible is very helpful in case of data binding data hiding and encapsultion
    public String showInfo(){
    return "DISPLAY NAME:"+firstName+" "+lastName+"COMPANY EMAIL:"+email+"MAILBOX CAPACITY: "+mailboxCapacity +"mb"; 
}
}