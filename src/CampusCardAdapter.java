public class CampusCardAdapter implements PaymentPort{
    //Database
    private final CampusCardTerminal terminal;

    public CampusCardAdapter(CampusCardTerminal terminal) {
        this.terminal = terminal;
    }

    @Override
   public boolean pay(String studentId, int amountKZTenge){
        int usd = amountKZTenge/500;
        int result = terminal.charge(studentId.hashCode() + "", usd);
        return result == 0;
    }

    private
}
