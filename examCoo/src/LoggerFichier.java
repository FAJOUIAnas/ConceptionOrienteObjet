import java.io.*;

public class LoggerFichier extends Logger{
    public LoggerFichier() throws IOException {
    }

    @Override
    void journaliser(Compte cpt) throws IOException {
        PrintWriter pw = new PrintWriter("test2.txt");

        pw.println(cpt.toString());
        pw.close();
    }

}
