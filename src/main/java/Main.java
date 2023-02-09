public class Main {
    public static void main(String[] args)
    {
        /*
        Stwóz klasęWallet, która w konstruktorze przyjmie kwotę początkową portfela np 3000,
        wewnątrz zostanie przechowana jako float money.
        Portfel ma metodę addMoney() z parametrem amount która doda tę kwotę do money.
        Na podobnej zasadzie zadziałą removeMoney() odejmując przekazaną kwotę.
        Ostatnia metoda portfela jest printAmount() która ma pokazać aktualną wartość portfela.

        W głównej klasie Main stwórz portfel oraz pętlę dla 6 miesięcy przychodów i wydatków.
        W każdym miesiącu do portfela dodaj 5000, również odejmij 2000 i następnie 1000zł.
        Na koniec programu wyświetl podsumowanie portfela po pół roku pracy.
         */
    Wallet wallet = new Wallet(3000.00f);
    for (int i = 1; i <= 6; i++)
        {
            System.out.println("Miesiąc: " + i);
            wallet.addMoney(5000.00f);
            wallet.removeMoney(2000.00f);
            wallet.removeMoney(1000.00f);
        }
        System.out.println("Podsumowanie wydatków po pół roku");
    wallet.printAmount();
    }
}

