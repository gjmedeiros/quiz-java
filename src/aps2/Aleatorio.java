package aps2;

import javax.swing.JOptionPane;

public class Aleatorio {

    private String aleatorio = "";

    public String getAleatorio() {

        int escolha = (int) ((Math.random() * 1000) % 4);

        switch (escolha) {
            case 0:
                Facil F01 = new Facil();
                F01.getFacil();
                break;
            case 1:
                Normal N01 = new Normal();
                N01.getNormal();
                break;
            case 2:
                Dificil D01 = new Dificil();
                D01.getDificil();
                break;
            case 3:
                Insane I01 = new Insane();
                I01.getInsane();
                break;
            default:
                System.out.println("Contate o administrador.");
        }

        return aleatorio;
    }

    public String getAleatorio(String x) {

        while (true) {
            int escolha = (int) ((Math.random() * 1000) % 4);

            switch (escolha) {
                case 0:
                    if (x.toLowerCase().equals("facil")) {
                        continue;
                    }
                    Facil F01 = new Facil();
                    F01.getFacil();
                    break;
                case 1:
                    if (x.toLowerCase().equals("normal")) {
                        continue;
                    }
                    Normal N01 = new Normal();
                    N01.getNormal();
                    break;
                case 2:
                    if (x.toLowerCase().equals("dificil")) {
                        continue;
                    }
                    Dificil D01 = new Dificil();
                    D01.getDificil();
                    break;
                case 3:
                    if (x.toLowerCase().equals("insane")) {
                        continue;
                    }
                    Insane I01 = new Insane();
                    I01.getInsane();
                    break;
                default:
                    JOptionPane.showInputDialog("Contate o administrador.");
            }

            return aleatorio;
        }
    }

    public void setAleatorio(String aleatorio) {
        this.aleatorio = aleatorio;
    }
}
