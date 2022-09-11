public class Cambio extends Acessorios {
    
    

    public Cambio(Acessorios outroAcessorio) {
        super(outroAcessorio);
    }

    

    public Cambio() {
    }



    public Double calculaValor(Veiculo veiculo) {
        return 1500 + calcula(veiculo);
    }
}
