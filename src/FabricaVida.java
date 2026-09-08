public class FabricaVida extends AbsCriador {

    private int idade;
    private double capitalSegurado;
    private boolean fumante;
    private boolean possuiCertificadoMedico;
    private String numeroApolice;
    private String segurado;
    private String dataEmissao;

    // Construtor

    public FabricaVida(String numeroApolice, String segurado, String dataEmissao,
        int idade, double capitalSegurado, boolean fumante, boolean possuiCertificadoMedico) {

            this.numeroApolice = numeroApolice;
            this.segurado = segurado;
            this.dataEmissao = dataEmissao;

            this.idade = idade;
            this.capitalSegurado = capitalSegurado;
            this.fumante = fumante;
            this.possuiCertificadoMedico = possuiCertificadoMedico;
}

    @Override
    public AbsApolice criarApolice() {
        return new ApolicVida(numeroApolice, segurado, dataEmissao, idade, capitalSegurado, 
            fumante, possuiCertificadoMedico);
    }

    

}