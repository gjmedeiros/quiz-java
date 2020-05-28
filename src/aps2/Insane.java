package aps2;

import javax.swing.JOptionPane;

public class Insane {

    private String insane;

    public String getInsane() {

        int pontos = 0;

        //Questão 01
        String r = JOptionPane.showInputDialog("\n***********QUESTÃO 01***************\n"
                + "Tendo em vista a elevação da temperatura do meio ambiente urbano,bem como a elevação\n"
                + "do nível dos oceanos, a União deverá implementar e estruturar um mercado de carbono,\n"
                + "em que serão negociados títulos mobiliários representativos de emissões de gases de efeito estufa evitadas.\n"
                + "Sobre o caso, assinale a afirmativa correta\n"
                + "\nA = É possível a criação de mercado de carbono, tendo como atores, exclusivamente, a União, os Estados, os Municípios e o Distrito Federal"
                + "\nB = Não é constitucional a criação de mercado de carbono no Brasil, tendo em vista a natureza indisponível e inalienável de bens ambientais"
                + "\nC = A criação de mercado de carbono é válida, inclusive sendo operacionalizado em bolsa de valores aberta a atores privados"
                + "\nD = A implementação de mercado de carbono pela União é cogente, tendo o Brasil a obrigação de reduzir a emissão de gases de efeito estufa,\n"
                + "estabelecida em compromissos internacionais.");

        if ("c".equals(r.toLowerCase())) {
            JOptionPane.showMessageDialog(null, "Resposta Correta +100 pontos", "Pontos", JOptionPane.ERROR_MESSAGE, null);
            pontos += 100;

        } else {
            JOptionPane.showMessageDialog(null, "Resposta Incoreta -50 pontos", "Pontos", JOptionPane.ERROR_MESSAGE, null);
            pontos -= 50;
        }

        // Questâo 2
        String r2 = JOptionPane.showInputDialog("\n***********QUESTÃO 02***************\n"
                + "O Brasil está na lista dos países que mais contribuem com a emissão de gases poluentes\n"
                + "que agravam o efeito estufa.Entre as alternativas a seguir, a que\n"
                + "mais ocorre no Brasil, fazendo com que o país seja um grande poluidor é:\n"
                + "\nA = Consumo excessivo de cigarros nas zonas urbanas."
                + "\nB = Utilização do etanol na gasolina."
                + "\nC = Produção de eucalipto para produção de papel."
                + "\nD = Descarte das garrafas de plástico."
                + "\nE = Queimadas em áreas com vegetação.");

        if ("e".equals(r.toLowerCase())) {
            JOptionPane.showMessageDialog(null, "Resposta Correta +100 pontos", "Pontos", JOptionPane.ERROR_MESSAGE, null);
            pontos += 100;

        } else {
            JOptionPane.showMessageDialog(null, "Resposta Incoreta -50 pontos", "Pontos", JOptionPane.ERROR_MESSAGE, null);
            pontos -= 50;
        }

        // Questâo 3
        String r3 = JOptionPane.showInputDialog("\n***********QUESTÃO 03***************\n"
                + "A ideia de desenvolvimento sustentável tem sido cada vez mais discutida junto\n"
                + "às questões que se referem ao crescimento econômico.De acordo com este conceito considera-se que:\n"
                + "\nA = O meio ambiente é fundamental para a vida humana e, portanto, deve ser intocável."
                + "\nB = Os países subdesenvolvidos são os únicos que praticam esta ideia, pois, por sua baixa industrialização,\n"
                + " preservam melhor o seu meio ambiente do que os países ricos."
                + "\nC = Ocorre uma oposição entre desenvolvimento e proteção ao meio ambiente e, portanto, é\n"
                + "inevitável que os riscos ambientais sustentem o crescimento econômico dos povos."
                + "\nD = Deve-se buscar uma forma de progresso socioeconômico que não comprometa o meio ambiente\n"
                + "sem que, com isso, deixemos de utilizar os recursos nele disponíveis."
                + "\nE = são as riquezas acumuladas nos países ricos, em prejuízo das antigas colônias durante a expansão\n"
                + "colonial, que devem, hoje, sustentar o crescimento econômico dos povos.");

        if ("d".equals(r.toLowerCase())) {
            JOptionPane.showMessageDialog(null, "Resposta Correta +100 pontos", "Pontos", JOptionPane.ERROR_MESSAGE, null);
            pontos += 100;

        } else {
            JOptionPane.showMessageDialog(null, "Resposta Incoreta -50 pontos", "Pontos", JOptionPane.ERROR_MESSAGE, null);
            pontos -= 50;
        }

        // Questâo 4
        String r4 = JOptionPane.showInputDialog("\n***********QUESTÃO 04***************\n"
                + "As diretrizes da Política Nacional sobre Mudanças do Clima (Lei n.º 12.187/2009) incluem:\n"
                + "\nA = os mecanismos financeiros e econômicos referentes à mitigação da mudança do clima e\n"
                + "à adaptação aos efeitos da mudança do clima no âmbito da Convenção-Quadro das Nações Unidas sobre mudança do Clima e do Protocolo de Quioto."
                + "\nB = Os mecanismos financeiros e econômicos, no âmbito nacional, referentes à mitigação e à adaptação à mudança do clima."
                + "\nC = A utilização de instrumentos financeiros e econômicos para a promoção de ações de mitigação e de adaptação à mudança do clima."
                + "\nD = A compatibilização das linhas de crédito e de financiamento específicas de agentes financeiros públicos e privados."
                + "\nE = A adoção de medidas fiscais e tributárias para a redução das emissões e remoção de gases de efeito estufa, incluindo\n"
                + "alíquotas diferenciadas, isenções, compensações e incentivos.");

        if ("c".equals(r.toLowerCase())) {
            JOptionPane.showMessageDialog(null, "Resposta Correta +100 pontos", "Pontos", JOptionPane.ERROR_MESSAGE, null);
            pontos += 100;

        } else {
            JOptionPane.showMessageDialog(null, "Resposta Incoreta -50 pontos", "Pontos", JOptionPane.ERROR_MESSAGE, null);
            pontos -= 50;
        }

        // Questâo 5
        String r5 = JOptionPane.showInputDialog("\n***********QUESTÃO 05***************\n"
                + "De acordo com ONGs internacionais de proteção ambiental,estão na base\n"
                + "dos principais problemas ambientais brasileiros, entre outros,\n"
                + "\nA = A morosidade na demarcação de terras indígenas e quilombolas no centro-norte do país."
                + "\nB = O corte de subsídios à proteção ambiental doados por países europeus como a Suécia e a Dinamarca."
                + "\nC = A priorização do rodoviarismo em detrimento dos sistemas ferroviário e hidroviário."
                + "\nD = A pequena utilização de fontes de energia limpa como a hidráulica, a biomassa e a nuclear."
                + "\nE = A grilagem de terras e mineração que avançam sobre áreas protegidas, principalmente na Amazônia.");

        if ("e".equals(r.toLowerCase())) {
            JOptionPane.showMessageDialog(null, "Resposta Correta +100 pontos", "Pontos", JOptionPane.ERROR_MESSAGE, null);
            pontos += 100;

        } else {
            JOptionPane.showMessageDialog(null, "Resposta Incoreta -50 pontos", "Pontos", JOptionPane.ERROR_MESSAGE, null);
            pontos -= 50;
        }
        // Questâo 6
        String r6 = JOptionPane.showInputDialog("\n***********QUESTÃO 06***************\n"
                + "O rompimento da barragem de fundão foi um dos maiores desastres ambientais do Brasil,\n"
                + " causou destruição de um distrito, poluição da água de vários rios. Assinale a alternativa\n"
                + "que se refere ao distrito destruído pelo rompimento da barragem no estado de Minas Gerais:\n"
                + "\nA = Campinas"
                + "\nB = Belo Horizonte"
                + "\nC = Mariana"
                + "\nD = Bento Rodrigues");

        if ("c".equals(r.toLowerCase())) {
            JOptionPane.showMessageDialog(null, "Resposta Correta +100 pontos", "Pontos", JOptionPane.ERROR_MESSAGE, null);
            pontos += 100;

        } else {
            JOptionPane.showMessageDialog(null, "Resposta Incoreta -50 pontos", "Pontos", JOptionPane.ERROR_MESSAGE, null);
            pontos -= 50;
        }

        // Questâo 7
        String r7 = JOptionPane.showInputDialog("\n***********QUESTÃO 07***************\n"
                + "No âmbito das relações internacionais, o Acordo de Paris é:\n"
                + "\nA = uma Convenção Internacional de proteção aos direitos das minorias\n"
                + "étnicas e sexuais, visando à igualdade de direitos de todos os povos\n"
                + "independentemente de cor, origem, religião ou condição econômica."
                + "\nB = um Tratado Internacional que mantém a integridade da Organização do Tratado do Atlântico Norte (OTAN),\n"
                + " pelo qual os países europeus e os Estados Unidos comprometem-se a proteger os países membros de agressões externas."
                + "\nC = um Tratado Internacional no âmbito da Convenção-Quadro das Nações Unidas sobre a Mudança do Clima\n"
                + "(UNFCCC, sigla em inglês), que rege medidas de redução de emissão de dióxido de carbono a partir de 2020."
                + "\nD = um Pacto de Proteção Mútua dos povos ocidentais em ratificação aos direitos humanos e em defesa da democracia pluralista.");

        if ("c".equals(r.toLowerCase())) {
            JOptionPane.showMessageDialog(null, "Resposta Correta +100 pontos", "Pontos", JOptionPane.ERROR_MESSAGE, null);
            pontos += 100;

        } else {
            JOptionPane.showMessageDialog(null, "Resposta Incoreta -50 pontos", "Pontos", JOptionPane.ERROR_MESSAGE, null);
            pontos -= 50;
        }

        // Questâo 8
        String r8 = JOptionPane.showInputDialog("\n***********QUESTÃO 08***************\n"
                + "Os cidadãos irlandeses estão sendo convocados pelo\n"
                + "governo de seu país a dar votos cruciais em um referendo histórico que se\n"
                + "realizará entre maio e junho de 2018, sobre\n"
                + "\nA = O casamento homossexual"
                + "\nB = A legalização do aborto"
                + "\nC = A privatização da água"
                + "\nD = A abolição do movimento feminista");

        if ("c".equals(r.toLowerCase())) {
            JOptionPane.showMessageDialog(null, "Resposta Correta +100 pontos", "Pontos", JOptionPane.ERROR_MESSAGE, null);
            pontos += 100;

        } else {
            JOptionPane.showMessageDialog(null, "Resposta Incoreta -50 pontos", "Pontos", JOptionPane.ERROR_MESSAGE, null);
            pontos -= 50;
        }

        // Questâo 9
        String r9 = JOptionPane.showInputDialog("\n***********QUESTÃO 09***************\n"
                + "Ocorreu em março de 2018, em Brasília, a 8ª edição do Fórum Mundial da Água (FMA).\n"
                + "O evento reúne governantes, empresários, pesquisadores e representantes da sociedade civil. Sobre o evento, é correto afirmar que:\n"
                + "\nA = O FMA é um instrumento dos organismos internacionais, principalmente da\n"
                + "Organização Mundial do Comércio e dos BRICS, que é formado por Brasil, Rússia, Índia e China.\n"
                + "\nB = seu principal objetivo, definido desde 1992 com a Declaração de Dublin sobre Água e\n"
                + "Desenvolvimento Sustentável, é de publicizar o uso da água, transformando-a numa mercadoria\n"
                + "capaz de atender às necessidades básicas da população mundial, sendo de fundamental importância a redução de suas tarifas."
                + "\nC = constitui uma reunião técnica com a finalidade de avaliar criticamente o problema da crise\n"
                + "hídrica nos países da África e América do Sul, cuja causa principal são os recorrentes fenômenos\n"
                + "climáticos que geram seca e escassez do recurso nesses territórios, especialmente nos localizados ao norte do Equador."
                + "\nD = é uma iniciativa do Conselho Mundial da Água, organização com sede no Brasil, que envolve mais de 300 entidades\n"
                + "de mais de 50 países, sendo, atualmente, coordenada por um dirigente brasileiro do Movimento dos Atingidos por Barragens (MAB).");

        if ("d".equals(r.toLowerCase())) {
            JOptionPane.showMessageDialog(null, "Resposta Correta +100 pontos", "Pontos", JOptionPane.ERROR_MESSAGE, null);
            pontos += 100;

        } else {
            JOptionPane.showMessageDialog(null, "Resposta Incoreta -50 pontos", "Pontos", JOptionPane.ERROR_MESSAGE, null);
            pontos -= 50;
        }

        // Questâo 10
        String r10 = JOptionPane.showInputDialog("\n***********QUESTÃO 10***************\n"
                + "A inevitável devastação ambiental decorrente do processo\n"
                + "de desenvolvimento industrial é um \"quadro\" que começa a se\n"
                + "modificar a partir da defesa pública de um novo conceito: O DESENVOLVIMENTO SUSTENTÁVEL\n"
                + "O uso dessa expressão tem a finalidade de:\n"
                + "\nA = Sustentar a inevitável necessidade do desenvolvimento"
                + "\nB = Garantir que o desenvolvimento contemporâneo não se sustenta"
                + "\nC = Sustentar o meio ambiente em detrimento do desenvolvimento"
                + "\nD = Propor a conciliação do desenvolvimento com o meio ambiente"
                + "\nE = Divulgar a insustentável situação do meio ambiente");

        if ("d".equals(r.toLowerCase())) {
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

        return insane;
    }

    public void setInsane(String insane) {
        this.insane = insane;
    }
}
