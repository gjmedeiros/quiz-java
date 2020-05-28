package aps2;

import javax.swing.JOptionPane;

public class Normal {

    private String normal;

    public String getNormal() {

        int pontos = 0;
        //Questâo 1
        String r = JOptionPane.showInputDialog("\n***********QUESTÃO 01***************\n"
                + "Qual é o conceito de sustentabilidade ?\n"
                + "\nA = É um termo para definir ações e atividades humanas que visam suprir\n"
                + "as necessidades atuais dos seres humanos,sem comprometer o futuro das proximas gerações"
                + "\nB = Um termo usado para definir a melhor maneira de sustentar uma familia na selva"
                + "\nC = É termo usado para definir as ações de um governo no campo da economia"
                + "\nD = É um termo usado para desenvolver e conscientizar os seres humanos do que estão\n"
                + "fazendo ao planeta");

        if ("a".equals(r.toLowerCase())) {
            JOptionPane.showMessageDialog(null, "Resposta Correta +100 pontos", "Pontos", JOptionPane.YES_OPTION, null);
            pontos += 100;

        } else {
            JOptionPane.showMessageDialog(null, "Resposta Incoreta -50 pontos", "Pontos", JOptionPane.ERROR_MESSAGE, null);
            pontos -= 50;
        }

        //Questão 2
        String r2 = JOptionPane.showInputDialog("\n***********QUESTÃO 02***************\n"
                + "A sustentabilidade está diretamente ligada: \n"
                + "\nA = Ao desenvolvimento de forma desenfreada,usando recursos quimicos"
                + "\nB = Ao desenvolvimento econômico e material sem agredir o meio ambiente,\n"
                + "usando os recursos naturais de forma inteligente"
                + "\nC = Ao sustento das familias das populações menos favorecidas"
                + "\nD = Ao desenvolvimento natural das áreas urbanas com a conscientização\n"
                + "da população e o apoio do governo");

        if ("b".equals(r2.toLowerCase())) {
            JOptionPane.showMessageDialog(null, "Resposta Correta +100 pontos", "Pontos", JOptionPane.ERROR_MESSAGE, null);
            pontos += 100;

        } else {
            JOptionPane.showMessageDialog(null, "Resposta Incoreta -50 pontos", "Pontos", JOptionPane.ERROR_MESSAGE, null);
            pontos -= 50;
        }

        //Questão 3
        String r3 = JOptionPane.showInputDialog("\n***********QUESTÃO 03***************\n"
                + "O que é o desenvolvimento sustentável ?\n"
                + "\nA = É o desenvolvimento que garante uma renda extra para a população que vive\n"
                + "em áreas de preservação"
                + "\nB = É o desenvolvimento que esgota os recursos para o futuro"
                + "\nC = É o desenvolvimento capaz de suprir as necessidades da geração atual\n"
                + " e garantir as necessidades das futuras gerações"
                + "\nD = É o desenvolvimento econômico e material sem agredir o meio ambiente,\n"
                + "que não necessita da mão-de-obra do ser humano");

        if ("c".equals(r3.toLowerCase())) {
            JOptionPane.showMessageDialog(null, "Resposta Correta +100 pontos", "Pontos", JOptionPane.ERROR_MESSAGE, null);
            pontos += 100;

        } else {
            JOptionPane.showMessageDialog(null, "Resposta Incoreta -50 pontos", "Pontos", JOptionPane.ERROR_MESSAGE, null);
            pontos -= 50;
        }

        //Questão 4         
        String r4 = JOptionPane.showInputDialog("\n***********QUESTÃO 04***************\n"
                + "Qual os beneficios da adoção de ações de sustentabilidade ?\n"
                + "\nA = Garante a médio e longo prazo um planeta em boas condições\n"
                + "para o desenvolvimento das diversas formas de vida"
                + "\nB = Garante a curto prazo um planeta em boas condições para o desenvolvimento\n"
                + "das diversas formas de vida"
                + "\nC = Garante a médio e longo prazo um planeta em boas condições econõmicas"
                + "\nD = Garante a médio e longo prazo um planeta em boas condições para o ser humano viver e se desenvolver");

        if ("a".equals(r4.toLowerCase())) {
            JOptionPane.showMessageDialog(null, "Resposta Correta +100 pontos", "Pontos", JOptionPane.ERROR_MESSAGE, null);
            pontos += 100;

        } else {
            JOptionPane.showMessageDialog(null, "Resposta Incoreta -50 pontos", "Pontos", JOptionPane.ERROR_MESSAGE, null);
            pontos -= 50;
        }

        //Questão 5
        String r5 = JOptionPane.showInputDialog("\n***********QUESTÃO 05***************\n"
                + "O que a exploração dos recursos vegetais de florestas e matas de forma controlada garante?\n"
                + "\nA = O replantio sempre que necessário"
                + "\nB = O replantio nas épocas do ano corretas,de acordo com a necessidade de cada produto"
                + "\nC = O replantio sem a utilização de agrotóxicos"
                + "\nD = O replantio de tudo que necessitamos ao longo do tempo e a garantia de sobrevivênvia dos animais silvestres");

        if ("a".equals(r5.toLowerCase())) {
            JOptionPane.showMessageDialog(null, "Resposta Correta +100 pontos", "Pontos", JOptionPane.ERROR_MESSAGE, null);
            pontos += 100;

        } else {
            JOptionPane.showMessageDialog(null, "Resposta Incoreta -50 pontos", "Pontos", JOptionPane.ERROR_MESSAGE, null);
            pontos -= 50;
        }

        //Questão 6
        String r6 = JOptionPane.showInputDialog("\n***********QUESTÃO 06***************\n"
                + "O uso de fontes de energia limpas e renováveis diminui o consumo de:\n"
                + "\nA = Energia solar"
                + "\nB = Bebidas alcoólicas"
                + "\nC = Combustíveis fósseis"
                + "\nD = Energia eólica");

        if ("c".equals(r6.toLowerCase())) {
            JOptionPane.showMessageDialog(null, "Resposta Correta +100 pontos", "Pontos", JOptionPane.ERROR_MESSAGE, null);
            pontos += 100;

        } else {
            JOptionPane.showMessageDialog(null, "Resposta Incoreta -50 pontos", "Pontos", JOptionPane.ERROR_MESSAGE, null);
            pontos -= 50;
        }

        //Questão 7
        String r7 = JOptionPane.showInputDialog("\n***********QUESTÃO 07***************\n"
                + "Quando e onde o conceito de sustentabilidade começou a ser empregado ?\n"
                + "\nA = Na Conferência das Nações Unidas sobre o Meio Ambiente Humano realizada,\n"
                + "em Estocolmo junho de 1972"
                + "\nB = Na reunião das Nações Unidas sobre o Meio Ambiente realizada em Bruxelas, em\n"
                + "setembro de 1970"
                + "\nC = Na Cúpula das Nações Unidas sobre o Meio Ambiente realizada em Tóquio , em maio de 1973"
                + "\nD = Na Conferência das Nações Unidas sobre o Meio Ambiente realizada no Rio de Janeiro, em abril de 1971");

        if ("a".equals(r7.toLowerCase())) {
            JOptionPane.showMessageDialog(null, "Resposta Correta +100 pontos", "Pontos", JOptionPane.ERROR_MESSAGE, null);
            pontos += 100;

        } else {
            JOptionPane.showMessageDialog(null, "Resposta Incoreta -50 pontos", "Pontos", JOptionPane.ERROR_MESSAGE, null);
            pontos -= 50;
        }

        //Questão 8
        String r8 = JOptionPane.showInputDialog("\n***********QUESTÃO 08***************\n"
                + "Qual evento consolidou o conceito de desenvolvimento sustentável ?\n"
                + "\nA = A ECO-90(Conferência sobre Meio Ambiente e Desenvolvimento),realizada em 1990,em Bogotá"
                + "\nB = A ECO-94(Conferência sobre Meio Ambiente e Desenvolvimento),realizada em 1994,em Manaus"
                + "\nC = A ECO-92(Conferência sobre Meio Ambiente e Desenvolvimento),realizada em 1992,no Rio de Janeiro"
                + "\nD = A ECO-96(Conferência sobre Meio Ambiente e Desenvolvimento),realizada em 1996,em São Paulo");

        if ("c".equals(r8.toLowerCase())) {
            JOptionPane.showMessageDialog(null, "Resposta Correta +100 pontos", "Pontos", JOptionPane.ERROR_MESSAGE, null);
            pontos += 100;

        } else {
            JOptionPane.showMessageDialog(null, "Resposta Incoreta -50 pontos", "Pontos", JOptionPane.ERROR_MESSAGE, null);
            pontos -= 50;
        }

        //Questão 9
        String r9 = JOptionPane.showInputDialog("\n***********QUESTÃO 09***************\n"
                + "No ambiente caseiro, um aspecto de grande importância para sustentabilidade ambiental é a\n"
                + "\nA = Reciclagem de lixo"
                + "\nB = Reutilização de papel"
                + "\nC = LImpeza diária"
                + "\nD = Utilização consciente de produtos químicos");

        if ("a".equals(r9.toLowerCase())) {
            JOptionPane.showMessageDialog(null, "Resposta Correta +100 pontos", "Pontos", JOptionPane.ERROR_MESSAGE, null);
            pontos += 100;

        } else {
            JOptionPane.showMessageDialog(null, "Resposta Incoreta -50 pontos", "Pontos", JOptionPane.ERROR_MESSAGE, null);
            pontos -= 50;
        }

        //Questão 10
        String r10 = JOptionPane.showInputDialog("\n***********QUESTÃO 10***************\n"
                + "Quais os materiais abaixo são considerados \"verdes\" e utilizados na construção de casas sustentáveis ?\n"
                + "\nA = Pedra sabão,tijolo à vista e telhado amarelo"
                + "\nB = Blocos de entulho, telhado verde e tijolos de terra"
                + "\nC = Pedra de sal, tijolos de terra e telhado alaranjado"
                + "\nD = Cascalho,tijolos de terra e telhado de madeira");

        if ("b".equals(r10.toLowerCase())) {
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
        return normal;
    }

    public void setNormal(String normal) {
        this.normal = normal;
    }
}
