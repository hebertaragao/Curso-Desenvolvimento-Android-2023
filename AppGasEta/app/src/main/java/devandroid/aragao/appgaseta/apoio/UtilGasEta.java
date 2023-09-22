package devandroid.aragao.appgaseta.apoio;

public class UtilGasEta {

    public void metodoEstatico(){}

    public static void metodoNaoEstatico(){}

    public static String mensagem(){
        return "Qualquer mensagem...";
    }





    public static String calcularMelhorOpcao(double gasolina, double etanol){
        // preço da gasolina: R$ 5,12
        // preço do etanol: R$ 3,99

        // preco ideal = gasolina * 0.70 = R$3,548

        double precoIdeal = gasolina * 0.70;
        String mensagemDeRetorno;

        if(etanol<=precoIdeal){
            mensagemDeRetorno = "Abastecer com Etanol";
        }else {
            mensagemDeRetorno = "Abastecer com Gasolina";
        }
        // se o preço do etanol for igual ou menor que o preço ideal,
        // melhor abastecer com etanol, caso contrário, a gasolina é
        // mais vantagem.
        return mensagemDeRetorno; // Abastecer com gasolina - Abastecer com Etanol
    }
}

