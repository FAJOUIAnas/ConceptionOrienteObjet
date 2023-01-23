import java.io.IOException;

public abstract class Logger {
    public Logger() {
    }

    abstract void journaliser(Compte cpt) throws IOException;
}
