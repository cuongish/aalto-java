
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account Mattaccount = new Account ("Matt's account", 1000.0);
        Account myaccount = new Account ("My account", 0);

        Mattaccount.withdrawal(100.0);
       
        myaccount.deposit(100.0);
        
        System.out.println(Mattaccount); 
        System.out.println(myaccount); 
    }

}
