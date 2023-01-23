import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        List<Compte> comptes = new ArrayList<>();


        Compte cpt1 = new Compte(2,7000, LocalDate.of(2020, 5, 5));
        Compte cpt2 = new Compte(3,8000, LocalDate.of(2020, 4, 7));

        comptes.add(cpt1);


        cpt2.retirer(50,LocalDate.of(2020,5,20),200);
        cpt2.retirer(50,LocalDate.of(2020,5,25),500);
        cpt2.verser(5,LocalDate.of(2020,5,20),2000);


        comptes.add(cpt2);


        //Loger Console **********************

        LoggerFactory lcf = LoggerConsoleFactory.getInstance();

        LoggerService lservice = new LoggerService(comptes, lcf);

        lservice.log(lcf.create());

        //Loger fichier ***********************

        LoggerFactory lff = LoggerFichierFactory.getInstance();
        lservice.setLf(lff);
        Logger loggerf = lff.create();
        lservice.log(loggerf);



    }
}
