import java.time.LocalDate;

abstract class Operation {
    int num;
    LocalDate date;
    long montant;
    Compte compte;

    public Operation(int num, LocalDate date, long montant) {
        this.num = num;
        this.date = date;
        this.montant = montant;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public long getMontant() {
        return montant;
    }

    public void setMontant(long montant) {
        this.montant = montant;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "num=" + num +
                ", date=" + date +
                ", montant=" + montant +
                '}';
    }
}
