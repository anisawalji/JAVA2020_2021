import java.util.*;
public class Bank {
    private int accountNum;
    private String owner;
    private String accType;
    private double balance;
    Random random = new Random();
    public Bank(){
        owner = "None";
        accType = "None";
        balance = 0.00;
    }
    public Bank(String Name, String Type, double startbalance){
        accountNum = AccountNumber();
        owner = Name;
        accType = Type;
        balance = startbalance;
    }
    //account num code
    public int AccountNumber(){
        accountNum = random.nextInt(43628927);
        return accountNum;
    }
    public int getAccountNum(){
        return accountNum;
    }
    //owner code
    public String setOwner(String input){
        owner = input;
        return owner;
    }
    public String ChangName(String name){
        owner = name;
        return owner;
    }
    public String getOwner(){
        return owner;
    }
    //type code
    public String setType(String in) {
        if (in == "Saving" || in == "Checking") {
            accType = in;
        }
        if (in != "Saving" && in != "Checking"){
            accType = "Not Allowed Type";
        }
        return accType;
    }
    public String changeType(String in){
        accType = in;
        return accType;
    }
    public String getAccType(){
        return accType;
    }
    //balance code
    public double addBal(double add){
        balance += add;
        return balance;
    }
    public double getBal(){
        return balance;
    }
    public String checkBal(){
        String allow = "";
        if (balance > 0){
            allow = "out of funds";
        }
        return allow;
    }
    //toString
    public String toString(){
        String combine = "account number: " + accountNum + "\nOwner: " + owner + "\nAccount Type: " + accType + "\nBalance: " + balance;
        return combine;
    }
    //withdraw function
    public String withdraw(double amount){
        balance -= amount;
        String ret = String.valueOf(balance);
        if (balance < 0){
            balance += amount;
            ret = "Not Enough Money In Account";
        }
        return ret;
    }
    //min fee
    public double fee(){
        if (balance < 200){
            balance -= 10;
        }
        return balance;
    }
    //transfer code
    public String transfer(Bank account, Bank Default, String firstSecond,int amount){
        if (firstSecond == "first"){
            account.balance -= amount;
            Default.balance += amount;
        }
        if (firstSecond == "second"){
            Default.balance -= amount;
            account.balance += amount;
        }
        return "Transaction completed";
    }
}


