public class CampusCardTerminalimpl implements CampusCardTerminal {
    private int dollar;

    @Override
    public int charge(String cardNumber, int amountUSDollar) {
        dollar = amountUSDollar;
        System.out.println("payment in " + cardNumber + " cost: " + amountUSDollar);
        return 0;
    }


    public int getDollar() {
        return dollar;
    }
}