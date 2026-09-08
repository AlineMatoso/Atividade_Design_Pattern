public class FabricaViagem extends AbsCriador {

    private int diasViagem;
    private boolean internacional;
    private double coberturaAssistencia;
    private boolean possuiPassaporte;

    private String numeroApolice;
    private String segurado;
    private String dataEmissao;

    public FabricaViagem(String numeroApolice, String segurado, String dataEmissao,
                         int diasViagem, boolean internacional,
                         double coberturaAssistencia, boolean possuiPassaporte) {

        this.numeroApolice = numeroApolice;
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
                numeroApolice,
                segurado,
                dataEmissao,
                diasViagem,
                internacional,
                coberturaAssistencia,
                possuiPassaporte
        );
    }
}