package aps2;

import javax.swing.JOptionPane;

public class Dificuldade {

    public static void main(String[] args) {

        String d = "";
        int ad = 0;

        while (true) {
            d = JOptionPane.showInputDialog("Selecione a dificuldade"
                    + "\nFacil"
                    + "\nNormal"
                    + "\nDificil"
                    + "\nInsane"
                    + "\nAleatorio");

            switch (d.toLowerCase()) {
                case "facil":

                    Facil F01 = new Facil();
                    F01.getFacil();
                    break;
                case "normal":

                    Normal N01 = new Normal();
                    N01.getNormal();
                    break;

                case "dificil":

                    Dificil D01 = new Dificil();
                    D01.getDificil();
                    break;

                case "insane":

                    Insane I01 = new Insane();
                    I01.getInsane();
                    break;

                case "aleatorio":
                    ad = JOptionPane.showConfirmDialog(null, "Você deseja tirar alguma dificuldade ?", "Escolha um", JOptionPane.YES_NO_OPTION);
                    Aleatorio A01 = new Aleatorio();
                    if (ad == 0) {
                        String ar = JOptionPane.showInputDialog("Qual dificuldade você quer tirar ?");
                        A01.getAleatorio(ar);
                    } else {
                        A01.getAleatorio();
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Selecione algo valido", "Erro", JOptionPane.YES_OPTION, null);
                    continue;
            }
        }
    }
}
