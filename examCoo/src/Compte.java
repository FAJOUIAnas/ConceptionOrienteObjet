import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Compte {
    long code;
    long solde;
    LocalDate dateCreation;
    List<Operation> operations = new ArrayList<>();

    public Compte(long code, long solde, LocalDate dateCreation) {
        this.code = code;
        this.solde = solde;
        this.dateCreation = dateCreation;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public long getSolde() {
        return solde;
    }

    public void setSolde(long solde) {
        this.solde = solde;
    }

    public LocalDate getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDate dateCreation) {
        this.dateCreation = dateCreation;
    }

    public List<Operation> getOperations() {
        return operations;
    }

    public void setOperations(List<Operation> operations) {
        this.operations = operations;
    }
    void addOperation(Operation op){
        this.operations.add(op);
    }
    void verser(int num, LocalDate date, long montant){
        addOperation(new Versement(num,date,montant));
        this.setSolde(this.getSolde()+montant);
    }
    void retirer(int num, LocalDate date, long montant){
        addOperation(new Retrait(num,date,montant));
        this.setSolde(this.getSolde()-montant);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Compte{" +"code=" + code +
                ", solde=" + solde +
                ", dateCreation=" + dateCreation + "}");
        for(Operation o : this.getOperations()){
            sb.append("\n\t");
            sb.append(o.toString());
        }
        return sb.toString();
    }
}
