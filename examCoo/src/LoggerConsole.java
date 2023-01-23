public class LoggerConsole extends Logger{
    @Override
    void journaliser(Compte cpt) {
        System.out.println(cpt.toString());
    }
}
