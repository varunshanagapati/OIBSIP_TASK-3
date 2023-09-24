import java.util.*;

class Operation{
    static int balance=0;
    static int Transactions=0;
    static String Transac_History="";
    Scanner s=new Scanner(System.in);
    void Deposit(){
        System.out.println("==================== DEPOSIT OPERATION  ====================");
        System.out.println("Enter Amount : ");
        int deposit=s.nextInt();
        balance+=deposit;
        System.out.println("AMOUNT DEPOSITED SUCCESSFULLY");
        System.out.println("============================================================");
    }
    void Withdraw(){
        System.out.println("==================== WITHDRAW OPERATION ====================");
        System.out.println("Enter Amount : ");
        int Amount=s.nextInt();
        
        if(balance>=Amount){
            balance-=Amount;
            System.out.println("PLEASE COLLECT YOUR AMOUNT "+Amount);
            System.out.println("BALANCE AMOUNT IN YOUR ACCOUNT : "+balance);

        }
        else{
            System.out.println("INSUFFICIENT BALANCE");
            System.out.println("BALANCE : "+balance);
        }
        System.out.println("============================================================");
        
    }
    void Balance(){
        System.out.println("============================================================");
        System.out.println("BALANCE : "+balance);
        System.out.println("============================================================");

    }
    void Transfer(){
        System.out.println("==================== TRANSFER OPERATION ====================");
        System.out.println("Enter Account Number : ");
        long AC_Number=s.nextLong();
        System.out.println("Enter Amount : ");
        int Amount=s.nextInt();
        if(Amount>balance){
            System.out.println("INSUFFICIENT FUNDS");
        }else{
            balance-=Amount;
            String temp=Amount+" Rs TRANSFERED TO "+AC_Number+"\n";
            Transac_History=Transac_History.concat(temp);
            Transactions++;
            System.out.println("AMOUNT TRANSFERED SUCCESSFULLY");
        }
        System.out.println("============================================================");
    }
    void TransHistory(){
        System.out.println("============================================================");
        System.out.println("***** YOUR TRANSACTIONS HISTORY *****");

        if(Transactions>0){

            System.out.println(Transac_History);

        }
        else{
        
            System.out.println("NO TRANSACTIONS");
        
        }
        System.out.println("============================================================");
           
    }
}

class ATM{
    
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("====================    ATM MACHINE     ====================");
        System.out.println("Enter your ID : ");
        int Id=s.nextInt();
        System.out.println("Enter your pin : ");
        int PIN=s.nextInt();
        Operation op=new Operation();
        System.out.println("====================      BANKING       ====================");
        
        while(true){
            System.out.println("1.DEPOSIT\n2.WITHDRAW\n3.BALANCE\n4.TRANSFER\n5.TRANSACTION HISTORY\n6.EXIT");
            System.out.println("Enter your choice : ");
            int choice=s.nextInt();
            switch(choice){
                case 1:op.Deposit();
                break;
                case 2:op.Withdraw();
                break;
                case 3:op.Balance();
                break;
                case 4:op.Transfer();
                break;
                case 5:op.TransHistory();
                break;
                case 6:System.out.println("============================================================");
                System.out.println("***** THANK YOU :) *****");
                System.out.println("============================================================");
                System.exit(0);
                break;
                default:System.out.println("INVALID CHOICE");
            }


        }
    }
}