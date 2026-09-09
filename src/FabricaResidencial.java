public class FabricaResidencial extends AbsCriador {

    private double valorImovel;
    private boolean altoPadrao;
    private boolean possuiEscrituraOuContrato;
    private String segurado;
    private String dataEmissao;

    public FabricaResidencial(String segurado, String dataEmissao,double valorImovel,
        boolean altoPadrao, boolean possuiEscrituraOuContrato) {
            this.segurado = segurado;
            this.dataEmissao = dataEmissao;

            this.valorImovel = valorImovel;
            this.altoPadrao = altoPadrao;
            this.possuiEscrituraOuContrato = possuiEscrituraOuContrato;
    }

        @Override
    public AbsApolice criarApolice() {
        return new ApolicResidencial(
                gerarNumeroApolice(),
                segurado,
                dataEmissao,
                valorImovel,
                altoPadrao,
                possuiEscrituraOuContrato
        );
    }

        @Override
    public String gerarNumeroApolice() {
        return "RES-" + System.currentTimeMillis();
    }

}