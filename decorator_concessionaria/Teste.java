public class Teste {

    public static void main(String[] args) {
        
        Veiculo veiculo = new Veiculo(3500);
        Acessorios comAr = new Ar();
        Acessorios comDirecao = new Direcao();
        Acessorios arEDirecao = new Ar(new Direcao());
        Acessorios completo = new Ar(new Direcao(new Cambio()));

        Double valor1 = comAr.calculaValor(veiculo);
        Double valor2 = comDirecao.calculaValor(veiculo);
        Double valor3 = arEDirecao.calculaValor(veiculo);
        Double valor4 = completo.calculaValor(veiculo);

        System.out.println(valor1);
        System.out.println(valor2);
        System.out.println(valor3);
        System.out.println(valor4);
    }
    
}
