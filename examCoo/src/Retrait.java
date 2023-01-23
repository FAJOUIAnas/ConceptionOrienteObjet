import java.time.LocalDate;

public class Retrait extends Operation{
    public Retrait(int num, LocalDate date, long montant) {
        super(num, date, montant);
    }
    public String toString() {
        return "Operation{" +
                "Nature= "+this.getClass().getName()+
                ", num=" + num +
                ", date=" + date +
                ", montant=" + montant +
                '}';
    }

}
