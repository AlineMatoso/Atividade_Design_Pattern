public class ApolicVida extends AbsApolice {

    private int idade;
    private double capitalSegurado;
    private boolean fumante;
    private boolean possuiCertificadoMedico;

    public ApolicVida(String numeroApolice, String segurado, String dataEmissao, int idade, 
        double capitalSegurado, boolean fumante, boolean possuiCertificadoMedico) {

        super(numeroApolice, segurado, dataEmissao);

        this.idade = idade;
        this.capitalSegurado = capitalSegurado;
        this.fumante = fumante;
        this.possuiCertificadoMedico = possuiCertificadoMedico;
    }

        @Override
    public double calculoDePremio(){
        double premio = (idade * 12) + (capitalSegurado * 0.002);
        if (fumante) {
            premio = premio * 1.50; 
            } return premio;
    }

        @Override
    public boolean validacaoDeCobertura() {
        if (capitalSegurado > 500000) {
            return possuiCertificadoMedico;
        }
        return true;
    }


        @Override
    public String listagemDocumentos() {
        if (capitalSegurado > 500000) {
            return "Documento de identificação, CPF e certificado médico";
        }

        return "Documento de identificação e CPF";
    }

        @Override
    public String resumo() {
        return "Número da apólice: " + getNumeroApolice()
                + "\nSegurado: " + getSegurado()
                + "\nData de emissão: " + getDataEmissao()
                + "\nPrêmio mensal: R$ " + calculoDePremio()
                + "\nDocumentos exigidos: " + listagemDocumentos();
    }

}