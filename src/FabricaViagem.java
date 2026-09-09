public class FabricaViagem extends AbsCriador {

    private int diasViagem;
    private boolean internacional;
    private double coberturaAssistencia;
    private boolean possuiPassaporte;
    private String segurado;
    private String dataEmissao;

    public FabricaViagem(String segurado, String dataEmissao, int diasViagem, boolean internacional,
                         double coberturaAssistencia, boolean possuiPassaporte) {
        this.segurado = segurado;
        this.dataEmissao = dataEmissao;
        this.diasViagem = diasViagem;
        this.internacional = internacional;
        this.coberturaAssistencia = coberturaAssistencia;
        this.possuiPassaporte = possuiPassaporte;
    }

    @Override
    public AbsApolice criarApolice() {
        return new ApolicViagem(
                gerarNumeroApolice(),
                segurado,
                dataEmissao,
                diasViagem,
                internacional,
                coberturaAssistencia,
                possuiPassaporte
        );
    }

    @Override
    public String gerarNumeroApolice() {
        return "VIA-" + System.currentTimeMillis();
    }
}