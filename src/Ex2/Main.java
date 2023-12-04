package Ex2;

import Ex2.Exeptions2.numberZero;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Main {
    private static Logger log= LoggerFactory.getLogger(ex1.Main.class);
    public static void main(String[] args)  {

        Scanner a= new Scanner(System.in);
        Scanner b= new Scanner(System.in);
        double km=0;
        double lt=0;
        boolean ok=false;
        try{
            log.info("inserisci i kilometri percorsi");
            km=Integer.parseInt(a.nextLine());
            log.info("inserisci i litri di carburante consumati");
            lt=Integer.parseInt(b.nextLine());
            if(lt==0) {
                throw new numberZero();
            }
            ok=true;
        }
        catch(NumberFormatException e) {
            log.error(" non hai inserito dei numeri! operazione annullata");
        } catch (numberZero e) {
            throw new RuntimeException(e);
        }


        if(ok) {
            double Result = kmSlashLt(km, lt);
            log.info("hai un rapport km/lt si " + Result);
        }




    }


    ///methods

    public static Double kmSlashLt(double km, double litri){
        return km/litri;
    }
}
