public class Test {
    public static void main(String[] args) {
        CampusCardTerminalimpl terminal = new CampusCardTerminalimpl();
        PaymentPort port = new CampusCardAdapter(terminal);

        boolean paid = port.pay("240107022", 1500);

        check(terminal.getDollar() == 3, "KZT to USD error");
        check(paid, "Result 0 must become true");

        System.out.println("PASS: adapter test");
    }

    private static void check(boolean condition, String message) {
        if (!condition) {
            throw new AssertionError(message);
        }
    }
}