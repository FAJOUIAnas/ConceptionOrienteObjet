import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LoggerService {
    LoggerFactory lf;
    List<Compte> comptes = new ArrayList<>();

    public LoggerService(List<Compte> comptes,LoggerFactory lf) {
        this.comptes = comptes;
        this.lf=lf;
    }

    public LoggerFactory getLf() {
        return lf;
    }

    public void setLf(LoggerFactory lf) {
        this.lf = lf;
    }

    public List<Compte> getComptes() {
        return comptes;
    }

    public void setComptes(List<Compte> comptes) {
        this.comptes = comptes;
    }

    void log() throws IOException {
        for(Compte c : comptes){
            lf.create().journaliser(c);
        }
    }

    void log(Logger logger) throws IOException {
        for(Compte c : comptes){
            logger.journaliser(c);
        }
    }

}
