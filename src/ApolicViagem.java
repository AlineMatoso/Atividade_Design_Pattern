public class ApolicViagem extends AbsApolice {

    private int diasViagem;
    private boolean internacional;
    private double coberturaAssistencia;
    private boolean possuiPassaporte;


    //  construtor

    public ApolicViagem(String numeroApolice, String segurado, String dataEmissao,int diasViagem,
         boolean internacional, double coberturaAssistencia, boolean possuiPassaporte) {
            super(numeroApolice, segurado, dataEmissao); // dados comuns
            this.diasViagem = diasViagem;
            this.internacional = internacional;
            this.coberturaAssistencia = coberturaAssistencia;
            this.possuiPassaporte = possuiPassaporte;
            }
    
        @Override
    public double calculoDePremio() {

        double premio = diasViagem * 15;

        if (internacional) {
            premio = premio + 100;
        }

        return premio;
    }

        @Override
    public boolean validacaoDeCobertura() {

        if (internacional) {
            return coberturaAssistencia >= 30000 && possuiPassaporte;
        }

        return true;
    }

    @Override
    public String listagemDocumentos() {
    
        if (internacional) {
            return "Itinerário e passaporte";
        }
    
        return "Itinerário";
    }

    @Override
    public String resumo() {
        return "Número da apólice: " + getNumeroApolice()
                + "\nSegurado: " + getSegurado()
                + "\nData de emissão: " + getDataEmissao()
                + "\nPrêmio: R$ " + calculoDePremio()
                + "\nDocumentos exigidos: " + listagemDocumentos();
    }


}