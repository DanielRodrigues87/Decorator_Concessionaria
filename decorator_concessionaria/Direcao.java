public class Direcao extends Acessorios {

    public Direcao(Acessorios outroAcessorio) {
        super(outroAcessorio);
    }

    

    public Direcao() {
    }



    public Double calculaValor(Veiculo veiculo) {
        return 700 + calcula(veiculo);
    }

    
    
}
