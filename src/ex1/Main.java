package ex1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static Logger log= LoggerFactory.getLogger(Main.class);
    public static void main(String[] args)  {

        Random rnd= new Random();
        int firsRnd= rnd.nextInt(1,10)+1;
        int secondRnd= rnd.nextInt(1,10)+1;
        int thirdRnd= rnd.nextInt(1,10)+1;
        int fourthRnd= rnd.nextInt(1,10)+1;
        int fifthRnd= rnd.nextInt(1,10)+1;
        int condition=1;
            int[] arrayOfNUmebrs = {fifthRnd, secondRnd, thirdRnd, fourthRnd, firsRnd};
            log.info(Arrays.toString(arrayOfNUmebrs));
        while(condition>0) {
            log.info("seleziona la posizione dell'array da cambiare da 1 a 5 o inserire 0 per uscire ");
            int inputPosition=0;
            boolean ok= false;
            while(!ok){
            Scanner input1 = new Scanner(System.in);
                try{
                    inputPosition=Integer.parseInt(input1.nextLine());
                    if((inputPosition>0 &&  inputPosition<6)){
                        ok=true;

                    }else{
                        log.error("numero non corretto, Riprova");

                    }
                }


                catch (NumberFormatException e){
                    log.error("numero non corretto, Riprova");
            }
            }


            log.info("scegliere il valore da 1 a 10 da cambiare");
            boolean ok1=false;
                Scanner input2 = new Scanner(System.in);
                int inputChange=0 ;
            while(!ok1){
                try{
                    inputChange=Integer.parseInt(input2.nextLine());
                    if((inputChange>0 &&  inputChange<11)){
                        ok1=true;

                    }else{
                        log.error("numero non corretto, Riprova");

                    }
                }


                catch (NumberFormatException e){
                    log.error("numero non corretto, Riprova");
                }
            }


            switch (inputPosition) {
                case 0: {
                    log.info("Programma terminato ciao!");
                    condition = 0;
                    break;
                }
                case 1: {
                    arrayOfNUmebrs[0] = inputChange;
                    break;
                }

                case 2: {
                    arrayOfNUmebrs[1] = inputChange;
                    break;
                }
                case 3: {
                    arrayOfNUmebrs[2] = inputChange;
                    break;
                }
                case 4: {
                    arrayOfNUmebrs[3] = inputChange;
                    break;
                }
                case 5: {
                    arrayOfNUmebrs[4] = inputChange;
                    break;
                }
                default: {
                    log.info("non e' cambiato niente");
                }

            }
            log.info(Arrays.toString(arrayOfNUmebrs));
        }

    }
}