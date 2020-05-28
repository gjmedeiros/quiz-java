package aps2;

import javax.swing.JOptionPane;

public class Facil {

    private String facil;

    public String getFacil() {

        int pontos = 0;
        //Questâo 1
        String r = JOptionPane.showInputDialog("\n***********QUESTÃO 01***************\n"
                + "Qual a importância das arvores para os seres vivos ?\n"
                + "\nA = Faz sombra em dias de sol muito forte"
                + "\nB = Retém CO2"
                + "\nC = Ocupam pouco espaço"
                + "\nD = Geram riquezas quando derrubadas e vendidas as madeireiras");

        if ("b".equals(r.toLowerCase())) {
            JOptionPane.showMessageDialog(null, "Resposta Correta +100 pontos", "Pontos", JOptionPane.ERROR_MESSAGE, null);
            pontos += 100;

        } else {
            JOptionPane.showMessageDialog(null, "Resposta Incoreta -50 pontos", "Pontos", JOptionPane.ERROR_MESSAGE, null);
            pontos -= 50;
        }

        //Questão 2
        String r2 = JOptionPane.showInputDialog("\n***********QUESTÃO 02***************\n"
                + "Qual destes é um método de preservação ambiental ?\n"
                + "\nA = Reflorestamento"
                + "\nB = Desmatamento"
                + "\nC = O uso de sacolas plásticas"
                + "\nD = Jogar lixo nas ruas");

        if ("a".equals(r2.toLowerCase())) {
            JOptionPane.showMessageDialog(null, "Resposta Correta +100 pontos", "Pontos", JOptionPane.ERROR_MESSAGE, null);
            pontos += 100;

        } else {
            JOptionPane.showMessageDialog(null, "Resposta Incoreta -50 pontos", "Pontos", JOptionPane.ERROR_MESSAGE, null);
            pontos -= 50;
        }

        //Questão 3
        String r3 = JOptionPane.showInputDialog("\n***********QUESTÃO 03***************\n"
                + "Quais hábitos são benéficos ao meio ambiente ?\n"
                + "\nA = Incineração do lixo produzido"
                + "\nB = Sair com veículos automotores sempre que possivel"
                + "\nC = Jogar lixo em rios e córregos"
                + "\nD = Reciclagem");

        if ("d".equals(r3.toLowerCase())) {
            JOptionPane.showMessageDialog(null, "Resposta Correta +100 pontos", "Pontos", JOptionPane.ERROR_MESSAGE, null);
            pontos += 100;

        } else {
            JOptionPane.showMessageDialog(null, "Resposta Incoreta -50 pontos", "Pontos", JOptionPane.ERROR_MESSAGE, null);
            pontos -= 50;
        }

        //Questão 4         
        String r4 = JOptionPane.showInputDialog("\n***********QUESTÃO 04***************\n"
                + "Qual a cor da lixeira especifica para vidros ?\n"
                + "\nA = Verde"
                + "\nB = Amarela"
                + "\nC = Vermelha"
                + "\nD = Marrom");

        if ("a".equals(r4.toLowerCase())) {
            JOptionPane.showMessageDialog(null, "Resposta Correta +100 pontos", "Pontos", JOptionPane.ERROR_MESSAGE, null);
            pontos += 100;

        } else {
            JOptionPane.showMessageDialog(null, "Resposta Incoreta -50 pontos", "Pontos", JOptionPane.ERROR_MESSAGE, null);
            pontos -= 50;
        }

        //Questão 5
        String r5 = JOptionPane.showInputDialog("\n***********QUESTÃO 05***************\n"
                + "O que é coleta seletiva ?\n"
                + "\nA = Destinação de resíduos para lixões e aterros"
                + "\nB = Processo de envio de todo lixo produzido para cooperativas ou entrega para catadores de rua"
                + "\nC = Processo de separação e recolhimento dos resíduos para o reaproveitamento por meio da reciclagem"
                + "\nD = A escolha aletória do melhor lixo produzido");

        if ("c".equals(r5.toLowerCase())) {
            JOptionPane.showMessageDialog(null, "Resposta Correta +100 pontos", "Pontos", JOptionPane.ERROR_MESSAGE, null);
            pontos += 100;

        } else {
            JOptionPane.showMessageDialog(null, "Resposta Incoreta -50 pontos", "Pontos", JOptionPane.ERROR_MESSAGE, null);
            pontos -= 50;
        }

        //Questão 6
        String r6 = JOptionPane.showInputDialog("\n***********QUESTÃO 06***************\n"
                + "Qual desses gases abaixo não é conhecido como um dos gases do efeito estufa ?\n"
                + "\nA = Oxigênio"
                + "\nB = Dioxido de carbono"
                + "\nC = Metano"
                + "\nD = Óxido nitroso");

        if ("a".equals(r6.toLowerCase())) {
            JOptionPane.showMessageDialog(null, "Resposta Correta +100 pontos", "Pontos", JOptionPane.ERROR_MESSAGE, null);
            pontos += 100;

        } else {
            JOptionPane.showMessageDialog(null, "Resposta Incoreta -50 pontos", "Pontos", JOptionPane.ERROR_MESSAGE, null);
            pontos -= 50;
        }

        //Questão 7
        String r7 = JOptionPane.showInputDialog("\n***********QUESTÃO 07***************\n"
                + "Qual país consome mais energia elétrica no mundo ?\n"
                + "\nA = Brasil"
                + "\nB = Rússia"
                + "\nC = China"
                + "\nD = EUA");

        if ("c".equals(r7.toLowerCase())) {
            JOptionPane.showMessageDialog(null, "Resposta Correta +100 pontos", "Pontos", JOptionPane.ERROR_MESSAGE, null);
            pontos += 100;

        } else {
            JOptionPane.showMessageDialog(null, "Resposta Incoreta -50 pontos", "Pontos", JOptionPane.ERROR_MESSAGE, null);
            pontos -= 50;
        }

        //Questão 8
        String r8 = JOptionPane.showInputDialog("\n***********QUESTÃO 08***************\n"
                + "Quantas arvores podem ser poupadas com a reciclagem de uma tonelada de papel ?\n"
                + "\nA = Cerca de 42 arvores"
                + "\nB = Cerca de 22 arvores"
                + "\nC = Cerca de 11 arvores"
                + "\nD = Cerca de 5 arvores");

        if ("b".equals(r8.toLowerCase())) {
            JOptionPane.showMessageDialog(null, "Resposta Correta +100 pontos", "Pontos", JOptionPane.ERROR_MESSAGE, null);
            pontos += 100;

        } else {
            JOptionPane.showMessageDialog(null, "Resposta Incoreta -50 pontos", "Pontos", JOptionPane.ERROR_MESSAGE, null);
            pontos -= 50;
        }

        //Questão 9
        String r9 = JOptionPane.showInputDialog("\n***********QUESTÃO 09***************\n"
                + "Quanto tempo o vidro leva para se decompor na natureza ?\n"
                + "\nA = Cerca de 50 anos"
                + "\nB = Milhares de anos"
                + "\nC = Não se decompõe"
                + "\nD = Cerca de 150 anos");

        if ("b".equals(r9.toLowerCase())) {
            JOptionPane.showMessageDialog(null, "Resposta Correta +100 pontos", "Pontos", JOptionPane.ERROR_MESSAGE, null);
            pontos += 100;

        } else {
            JOptionPane.showMessageDialog(null, "Resposta Incoreta -50 pontos", "Pontos", JOptionPane.ERROR_MESSAGE, null);
            pontos -= 50;
        }

        //Questão 10
        String r10 = JOptionPane.showInputDialog("\n***********QUESTÃO 10***************\n"
                + "O que podemos fazer para diminuir a emissão de CO2 ?\n"
                + "\nA = Sair com veiculos automotores sempre que possivel"
                + "\nB = Cortar mais arvores"
                + "\nC = Plantar mais arvores"
                + "\nD = Incinerar o lixo produzido");

        if ("c".equals(r10.toLowerCase())) {
            JOptionPane.showMessageDialog(null, "Resposta Correta +100 pontos", "Pontos", JOptionPane.ERROR_MESSAGE, null);
            pontos += 100;

        } else {
            JOptionPane.showMessageDialog(null, "Resposta Incoreta -50 pontos", "Pontos", JOptionPane.ERROR_MESSAGE, null);
            pontos -= 50;
        }

        if (pontos < 0) {
            JOptionPane.showMessageDialog(null, "Total de Pontos: 0", "Soma dos Pontos", JOptionPane.ERROR_MESSAGE, null);
        } else {
            JOptionPane.showMessageDialog(null, "Total de Pontos: " + pontos, "Soma dos Pontos", JOptionPane.ERROR_MESSAGE, null);
        }
        return facil;
    }

    public void setFacil(String facil) {
        this.facil = facil;
    }
}
