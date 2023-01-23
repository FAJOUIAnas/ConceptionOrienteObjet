import java.io.IOException;

public class LoggerFichierFactory extends LoggerFactory {
    private static LoggerFichierFactory instance;

    public static LoggerFichierFactory getInstance(){
        if(instance == null){
            instance = new LoggerFichierFactory();
        }
        return instance;
    }

    private LoggerFichierFactory() {
    }

    Logger create() throws IOException {
        return new LoggerFichier();
    }

}
