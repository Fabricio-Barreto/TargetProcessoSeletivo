package com.target.processoSeletivo;

import com.target.processoSeletivo.model.Rendimento;

public class Faturamento {
    public static void main(String[] args) {
        Rendimento[] rendimentos = new Rendimento[30];
        int diasFaturamentoMenorQueMedia = 0;

        rendimentos[0] = new Rendimento(1, 22174.1664);
        rendimentos[1] = new Rendimento(2, 24537.6698);
        rendimentos[2] = new Rendimento(3, 26139.6134);
        rendimentos[3] = new Rendimento(4, 0.0);
        rendimentos[4] = new Rendimento(5, 0.0);
        rendimentos[5] = new Rendimento(6, 26742.6612);
        rendimentos[6] = new Rendimento(7, 0.0);
        rendimentos[7] = new Rendimento(8, 42889.2258);
        rendimentos[8] = new Rendimento(9, 46251.174);
        rendimentos[9] = new Rendimento(10, 11191.4722);
        rendimentos[10] = new Rendimento(11, 0.0);
        rendimentos[11] = new Rendimento(12, 0.0);
        rendimentos[12] = new Rendimento(13, 3847.4823);
        rendimentos[13] = new Rendimento(14, 373.7838);
        rendimentos[14] = new Rendimento(15, 2659.7563);
        rendimentos[15] = new Rendimento(16, 48924.2448);
        rendimentos[16] = new Rendimento(17, 18419.2614);
        rendimentos[17] = new Rendimento(18, 0.0);
        rendimentos[18] = new Rendimento(19, 0.0);
        rendimentos[19] = new Rendimento(20, 35240.1826);
        rendimentos[20] = new Rendimento(21, 43829.1667);
        rendimentos[21] = new Rendimento(22, 18235.6852);
        rendimentos[22] = new Rendimento(23, 4355.0662);
        rendimentos[23] = new Rendimento(24, 13327.1025);
        rendimentos[24] = new Rendimento(25, 0.0);
        rendimentos[25] = new Rendimento(26, 0.0);
        rendimentos[26] = new Rendimento(27, 25681.8318);
        rendimentos[27] = new Rendimento(28, 1718.1221);
        rendimentos[28] = new Rendimento(29, 13220.495);
        rendimentos[29] = new Rendimento(30, 8414.61);

        System.out.println("O valor da média é : " + Rendimento.mediaMensal);
        System.out.println("O menor valor é : " + Rendimento.menorValor);
        System.out.println("O maior valor é  : " + Rendimento.maiorValor);

        System.out.println("");
        
        for (Rendimento rendimento:rendimentos) {
            if (rendimento.getValor() > Rendimento.mediaMensal){
                diasFaturamentoMenorQueMedia++;
                System.out.println("O dia "+rendimento.getDia()+" teve um faturamneto maior do que a Média Mensal!");
            }
        }

        System.out.println("");
        System.out.println("Foram "+diasFaturamentoMenorQueMedia + " de dias com o faturamento maior do que a Média Mensal!");
    }

}

