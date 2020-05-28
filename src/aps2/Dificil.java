package aps2;

import javax.swing.JOptionPane;

public class Dificil {

    private String dificil;

    public String getDificil() {

        int pontos = 0;

        //Questão 01
        String r = JOptionPane.showInputDialog("\n***********QUESTÃO 01***************\n"
                + "(UFRJ) A inevitável devastação ambiental decorrente do processo de desenvolvimento\n"
                + "industrial é um \"quadro\" que começa a se modificar a partir da defesa\n"
                + "pública de um novo conceito: O DESENVOLVIMENTO SUSTENTÁVEL.\n"
                + "O uso dessa expressão tem a finalidade de:\n"
                + "\nA = Sustentar a inevitável necessidade do desenvolvimento."
                + "\nB = Garantir que o desenvolvimento contemporâneo não se sustenta."
                + "\nC = Sustentar o meio ambiente em detrimento do desenvolvimento."
                + "\nD = propor a conciliação do desenvolvimento com o meio ambiente"
                + "\nE = Divulgar a insustentável situação do meio ambiente");

        if ("d".equals(r.toLowerCase())) {
            JOptionPane.showMessageDialog(null, "Resposta Correta +100 pontos", "Pontos", JOptionPane.YES_OPTION, null);
            pontos += 100;

        } else {
            JOptionPane.showMessageDialog(null, "Resposta Incoreta -50 pontos", "Pontos", JOptionPane.ERROR_MESSAGE, null);
            pontos -= 50;
        }

        //Questão 02
        String r2 = JOptionPane.showInputDialog("\n***********QUESTÃO 02***************\n"
                + "(UNIRIO-RJ) A ideia de desenvolvimento sustentável tem sido cada vez mais\n"
                + "discutida junto às questões que se referem ao crescimento econômico.\n"
                + "De acordo com este conceito considera-se que:\n"
                + "\nA = O meio ambiente é fundamental para a vida humana e, portanto, deve ser intocável."
                + "\nB = Os países subdesenvolvidos são os únicos que praticam esta ideia, pois, por sua baixa\n"
                + "industrialização, preservam melhor o seu meio ambiente do que os países ricos."
                + "\nC = Ocorre uma oposição entre desenvolvimento e proteção ao meio ambiente e, portanto, é inevitável\n"
                + "que os riscos ambientais sustentem o crescimento econômico dos povos."
                + "\nD = Deve-se buscar uma forma de progresso socioeconômico que não comprometa o meio\n"
                + "ambiente sem que, com isso, deixemos de utilizar os recursos nele disponíveis.");

        if ("d".equals(r2.toLowerCase())) {
            JOptionPane.showMessageDialog(null, "Resposta Correta +100 pontos", "Pontos", JOptionPane.YES_OPTION, null);
            pontos += 100;

        } else {
            JOptionPane.showMessageDialog(null, "Resposta Incoreta -50 pontos", "Pontos", JOptionPane.ERROR_MESSAGE, null);
            pontos -= 50;
        }

        //Questão 03
        String r3 = JOptionPane.showInputDialog("\n***********QUESTÃO 03***************\n"
                + "A expressão “desenvolvimento sustentável” é amplamente empregada para designar \n"
                + "a preservação da natureza, com vistas à promoção de uma maior conscientização\n"
                + "ambiental na sociedade. Esse termo designa, especificadamente:\n"
                + "\nA = A interrupção das práticas econômicas para garantir, primeiramente, a conservação dos elementos naturais."
                + "\nB = A manutenção do desenvolvimento econômico de modo a garantir a preservação da natureza e dos recursos\n"
                + "naturais para as gerações futuras."
                + "\nC = A adoção de medidas de expansão das áreas naturais sobre as zonas de ocupação humana, de forma a\n"
                + "reconstruir o império dos domínios da natureza."
                + "\nD = A ampliação das medidas socioeducativas para o uso consciente da natureza, de modo a garantir, sobretudo, o desenvolvimento econômico e urbano.\n");

        if ("b".equals(r2.toLowerCase())) {
            JOptionPane.showMessageDialog(null, "Resposta Correta +100 pontos", "Pontos", JOptionPane.YES_OPTION, null);
            pontos += 100;

        } else {
            JOptionPane.showMessageDialog(null, "Resposta Incoreta -50 pontos", "Pontos", JOptionPane.ERROR_MESSAGE, null);
            pontos -= 50;
        }

        //Questão 04
        String r4 = JOptionPane.showInputDialog("\n***********QUESTÃO 04***************\n"
                + "“Para ser alcançado, o desenvolvimento sustentável depende de planejamento\n"
                + "e do reconhecimento de que os recursos naturais são finitos. Esse conceito\n"
                + "representou uma nova forma de desenvolvimento econômico, que leva em conta o meio ambiente\n"
                + "Assinale a alternativa que NÃO aponta uma maneira correta de promover o desenvolvimento sustentável:"
                + "\nA = Optar por recursos naturais renováveis, tais como os ventos e a energia solar."
                + "\nB = Praticar a agricultura orgânica com maior frequência, sem o uso de agrotóxicos.\n"
                + "\nC = Praticar a agricultura orgânica com maior frequência, sem o uso de agrotóxicos.\n"
                + "\nD = Ampliação da área de cultivo agrícola em larga escala.\n"
                + "\nE = Conservação das florestas e reflorestamento");

        if ("d".equals(r2.toLowerCase())) {
            JOptionPane.showMessageDialog(null, "Resposta Correta +100 pontos", "Pontos", JOptionPane.YES_OPTION, null);
            pontos += 100;

        } else {
            JOptionPane.showMessageDialog(null, "Resposta Incoreta -50 pontos", "Pontos", JOptionPane.ERROR_MESSAGE, null);
            pontos -= 50;
        }

        //Questão 05
        String r5 = JOptionPane.showInputDialog("\n***********QUESTÃO 05***************\n"
                + "Vários estudos atestam que os atuais padrões de consumo crescem mais rapidamente\n"
                + "que a capacidade de regeneração dos sistemas naturais. Ou seja, para manter os níveis de uso\n"
                + "de recursos como a água, os minérios, os solos e as florestas da maior parte da população mundial,\n"
                + "seriam necessários vários planetas Terra.\n"
                + "\nO padrão não sustentável de consumo das sociedades atuais fez emergir uma grande preocupação quanto\n"
                + "ao esgotamento dos recursos naturais. A definição acima apresentada refere-se ao conceito de:"
                + "\nA = Consumo alienante"
                + "\nB = Obsolescência planejada\n"
                + "\nC = Pegada ecológica\n"
                + "\nD = Niveis gerais de consumo\n"
                + "\nE = Esgotamento florestal");

        if ("c".equals(r2.toLowerCase())) {
            JOptionPane.showMessageDialog(null, "Resposta Correta +100 pontos", "Pontos", JOptionPane.YES_OPTION, null);
            pontos += 100;

        } else {
            JOptionPane.showMessageDialog(null, "Resposta Incoreta -50 pontos", "Pontos", JOptionPane.ERROR_MESSAGE, null);
            pontos -= 50;
        }

        //Questão 06
        String r6 = JOptionPane.showInputDialog("\n***********QUESTÃO 06***************\n"
                + "Mostrengo enviado para punir o povo de Tebas por ter afrontado os deuses,\n"
                + "a Esfinge tinha cabeça e seios de mulher, corpo e patas de leoa, e asas de águia.\n"
                + "Instalada às portas da cidade, ela exigia que seus melhores jovens a enfrentassem.\n"
                + "Todos eram impiedosamente trucidados porque não conseguiam responder ao enigma que ela lhes propunha.\n"
                + "Desgraça que só terminou quando apareceu um esperto rapaz, vindo de Corinto e chamado Édipo.\n"
                + "Ele matou a charada, provocando o suicídio da fera. O resto da lenda é bem conhecido.\n"
                + "Pois bem, o “desenvolvimento sustentável” também é um enigma à espera do seu Édipo [....] .\n"
                + "O desenvolvimento sustentável se define de forma enigmática por constituir-se enquanto"
                + "o desafio do Século XXI. Nesta perspectiva, pode-se afirmar:"
                + "\nA = A privatização da água proposta pelo Banco Mundial é uma medida de uso e\n"
                + "apropriação racional da natureza com vistas à sustentabilidade socioeconômica e ambiental."
                + "\nB = Os conflitos socioambientais evidenciam as contradições da relação estabelecida\n"
                + "entre a sociedade e a natureza no modelo de desenvolvimento capitalista."
                + "\nC = O Plano de Aceleração do Crescimento (PAC), proposto pelo governo federal,tem como projeto estruturante a \n"
                + "criação de reservas e parques nacionais para a promoção do desenvolvimento sustentável na Amazônia"
                + "\nD = A regulação da biodiversidade pela Organização das Nações Unidas (ONU), enquanto patrimônio da\n"
                + "humanidade, vem garantindo o cumprimento legal da política ambiental brasileira.");

        if ("b".equals(r2.toLowerCase())) {
            JOptionPane.showMessageDialog(null, "Resposta Correta +100 pontos", "Pontos", JOptionPane.YES_OPTION, null);
            pontos += 100;

        } else {
            JOptionPane.showMessageDialog(null, "Resposta Incoreta -50 pontos", "Pontos", JOptionPane.ERROR_MESSAGE, null);
            pontos -= 50;
        }

        //Questâo 07
        String r07 = JOptionPane.showInputDialog("\n***********QUESTÃO 07***************\n"
                + "O que é a sustentabilidade??\n"
                + "\nA = Quando se pode usar regular um recurso natural para o crescimento de uma empresa ou indústria"
                + "\nB = Tudo aquilo que sustenta o cotidiano socioeconômico de um pais"
                + "\nC = Ações que levam ao crescimento e desenvolvimento da comunidade sem elevado custo financeiro para a sociedade"
                + "\nD = Ações e atividades humanas que visam suprir as necessidades atuais da sociedade, sem comprometer o futuro das proximas gerações. ");

        if ("d".equals(r.toLowerCase())) {
            JOptionPane.showMessageDialog(null, "Resposta Correta +100 pontos", "Pontos", JOptionPane.YES_OPTION, null);
            pontos += 100;

        } else {
            JOptionPane.showMessageDialog(null, "Resposta Incoreta -50 pontos", "Pontos", JOptionPane.ERROR_MESSAGE, null);
            pontos -= 50;
        }

        //Questão 08
        String r08 = JOptionPane.showInputDialog("\n***********QUESTÃO 08***************\n"
                + "Você sabe qual lâmpada gera menos impacto no meio ambiente?\n"
                + "\nA = Lâmpadas Fluorescentes compactas"
                + "\nB = Lâmpadas de LED(Diodos emissores de luz"
                + "\nC = Lâmpadas Incandescentes"
                + "\nD = ALâmpadas de Halogéneo");

        if ("b".equals(r.toLowerCase())) {
            JOptionPane.showMessageDialog(null, "Resposta Correta +100 pontos", "Pontos", JOptionPane.YES_OPTION, null);
            pontos += 100;

        } else {
            JOptionPane.showMessageDialog(null, "Resposta Incoreta -50 pontos", "Pontos", JOptionPane.ERROR_MESSAGE, null);
            pontos -= 50;
        }

        //Questão 09
        String r09 = JOptionPane.showInputDialog("\n***********QUESTÃO 09***************\n"
                + "Qual cor e a finalidade das lixeiras estão corretas ?\n"
                + "\nA = Branco - Resíduos Orgânicos"
                + "\nB = Laranja - Madeira"
                + "\nC = Vermelho - Papel e Papelão"
                + "\nD = Roxo - Resíduo Radioativo ");

        if ("d".equals(r.toLowerCase())) {
            JOptionPane.showMessageDialog(null, "Resposta Correta +100 pontos", "Pontos", JOptionPane.YES_OPTION, null);
            pontos += 100;

        } else {
            JOptionPane.showMessageDialog(null, "Resposta Incoreta -50 pontos", "Pontos", JOptionPane.ERROR_MESSAGE, null);
            pontos -= 50;
        }

        //Questão 10
        String r10 = JOptionPane.showInputDialog("\n***********QUESTÃO 10***************\n"
                + "Qual das alternativas abaixo é um exemplo de reciclagem?\n"
                + "\nA = Incineração"
                + "\nB = Coleta Seletiva "
                + "\nC = Acúmulo de matéria-prima"
                + "\nD = Descartar lixo na rua");

        if ("b".equals(r.toLowerCase())) {
            JOptionPane.showMessageDialog(null, "Resposta Correta +100 pontos", "Pontos", JOptionPane.YES_OPTION, null);
            pontos += 100;

        } else {
            JOptionPane.showMessageDialog(null, "Resposta Incoreta -50 pontos", "Pontos", JOptionPane.ERROR_MESSAGE, null);
            pontos -= 50;
        }

        return dificil;
    }

    public void setDificil(String dificil) {
        this.dificil = dificil;
    }
}
