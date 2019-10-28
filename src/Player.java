public class Player {


    int balance;
    private Account account = new Account();

    void setFelt(int felt){
        account.caseNumber = felt;
        account.oldBalance = balance;
        account.landedOn();
        balance = account.currentBalance;
    }



}
