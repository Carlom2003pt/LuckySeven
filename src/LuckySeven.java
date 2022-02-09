import javax.swing.*;
import java.util.Random;

public class LuckySeven {
    public static void main(String[] args){
    Random rnd = new Random();

    int num1,num2,num3;
    int c = 1;
    do {
        num1 = rnd.nextInt((7 - 1) + 1) + 1;
        num2 = rnd.nextInt((7 - 1) + 1) + 1;
        num3= rnd.nextInt((7 - 1) + 1) + 1;
        JOptionPane.showMessageDialog(null, "Números sorteados: " + num1 + ", " + num2 + ", " + num3);
        if (num1 == 7 && num2 == 7 && num3 == 7) {
            JOptionPane.showMessageDialog(null, "Parabéns! Ganhou o 1ºPrémio: 5.000.000€");
        } else if ((num1 == 7 && num2 == 7) || (num2 == 7 && num3 == 7) || (num1 == 7 && num3 == 7)) {
            JOptionPane.showMessageDialog(null, "Parabens! Ganhou o 2ºPrémio: 500.000€");
        } else if (num1 == 7 || num2 == 7 || num3 == 7) {
            JOptionPane.showMessageDialog(null, "Parabens! Ganhou o 3ºPrémio: 20.000€");
        } else if ((num1 + num2 + num3) == 7) {
            JOptionPane.showMessageDialog(null, "Parabens! Ganhou o 4ºPrémio: 1.000€");
        } else {
            JOptionPane.showMessageDialog(null, "Infelizmente não ganhaste nada!");
        }
        c= JOptionPane.showConfirmDialog(null,"Deseja Continuar a Jogar?","Continuar a Jogar?",JOptionPane.YES_NO_CANCEL_OPTION);
        //0-YES, 1-NO, 2-Cancel
    }while(c==0);
    System.exit(0);
}
}
