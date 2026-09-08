public class FabricaResidencial extends AbsCriador {

    private double valorImovel;
    private boolean altoPadrao;
    private boolean possuiEscrituraOuContrato;

    private String numeroApolice;
    private String segurado;
    private String dataEmissao;

    public FabricaResidencial(String numeroApolice, String segurado, String dataEmissao,double valorImovel,
        boolean altoPadrao, boolean possuiEscrituraOuContrato) {
            this.numeroApolice = numeroApolice;
            this.segurado = segurado;
            this.dataEmissao = dataEmissao;

            this.valorImovel = valorImovel;
            this.altoPadrao = altoPadrao;
            this.possuiEscrituraOuContrato = possuiEscrituraOuContrato;
    }

    @Override
    public AbsApolice criarApolice() {
        return new ApolicResidencial(numeroApolice, segurado, dataEmissao,
                valorImovel, altoPadrao, possuiEscrituraOuContrato);
    }

}