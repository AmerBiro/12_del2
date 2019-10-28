public class Player {


    int balance;
    private Account account = new Account();

    public int player_number;
    public String player_name;


    public Player (int number){
        this.player_number=number;
        account = new Account();
    }

    public void setPlayer_name(String player_name) {

        this.player_name = player_name;
    }

    public String getPlayer_name() {
        return player_name;
    }


    public String toString(){
        return "Player " + player_number + ": " + getPlayer_name() + " has " + getPlayer_start_balance() + " coins as a start balance";
    }

    void setFelt(int felt){
        account.caseNumber = felt;
        account.oldBalance = balance;
        account.landedOn();
        balance = account.currentBalance;
    }



}




