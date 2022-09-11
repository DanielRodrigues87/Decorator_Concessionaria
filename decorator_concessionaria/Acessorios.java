public abstract class Acessorios {

    protected Acessorios outroAcessorio;
    public Acessorios(Acessorios OutroAcessorio) {
        outroAcessorio = OutroAcessorio;
    }

    public Acessorios() {}

    public abstract Double calculaValor(Veiculo veiculo);

    protected Double calcula(Veiculo veiculo) {
        if (outroAcessorio == null) {
            return (double) 0;
        } else {
            return outroAcessorio.calculaValor(veiculo);
        }
    }



    

    
    
}
