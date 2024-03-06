//Nama    : Fendi Ardianto
//NIM     : 24060122130077
//Lab     : PBO D1

public class BankApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500.0);
        try{
          // skenario saldo mencukupi
        account.withdraw(200.0);
        System.out.println("Saldo saat ini: $" + account.getBalance());

          // skenario saldo tidak mencukupi
        account.withdraw(400.0);
        }
        catch(InsufficientFundsException ex){
          System.out.println(ex.getMessage());
        }
    }
}
