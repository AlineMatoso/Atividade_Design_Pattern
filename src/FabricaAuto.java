public class FabricaAuto extends AbsCriador{

    private double valorFipe;
    private int idadeCondutor;
    private int tempoHabilitacao;
    private double coberturaTerceiros;
    private String segurado;
    private String dataEmissao;

    public FabricaAuto(String segurado, String dataEmissao,
        double valorFipe, int idadeCondutor, int tempoHabilitacao, double coberturaTerceiros) {

        this.valorFipe = valorFipe;
        this.idadeCondutor = idadeCondutor;
        this.tempoHabilitacao = tempoHabilitacao;
        this.coberturaTerceiros = coberturaTerceiros;
        this.segurado = segurado;
        this.dataEmissao = dataEmissao;
    }

    @Override
    public AbsApolice criarApolice() {
        return new ApolicAuto(
                gerarNumeroApolice(),
                segurado,
                dataEmissao,
                valorFipe,
                idadeCondutor,
                tempoHabilitacao,
                coberturaTerceiros
        );
    }

    @Override
    public String gerarNumeroApolice() {
        return "AUTO-" + System.currentTimeMillis();
    }
    

}