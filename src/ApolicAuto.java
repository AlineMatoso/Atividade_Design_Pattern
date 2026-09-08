public class ApolicAuto extends AbsApolice{

    private double valorFipe;
    private int idadeCondutor;
    private int tempoHabilitacao;
    private double coberturaTerceiros;

    // private significa que somente essa classe consegue acessar diretamente esses atributos.

    public ApolicAuto(String numeroApolice, String segurado, String dataEmissao,
        double valorFipe, int idadeCondutor,
        int tempoHabilitacao, double coberturaTerceiros) {

        super(numeroApolice, segurado, dataEmissao); // vem da mae AbsApolice
        this.valorFipe = valorFipe;
        this.idadeCondutor = idadeCondutor;
        this.tempoHabilitacao = tempoHabilitacao;
        this.coberturaTerceiros = coberturaTerceiros;
        }

    @Override
    public double calculoDePremio() {
    
        double premioAnual = valorFipe * 0.08;
    
        if (idadeCondutor < 25) {
            premioAnual = premioAnual * 1.30;
        }
    
        if (tempoHabilitacao < 2) {
            premioAnual = premioAnual * 1.20;
        }
    
        return premioAnual / 12;
    }

    @Override
    public boolean validacaoDeCobertura() {
        return coberturaTerceiros >= 50000;
    }

    @Override
    public String listagemDocumentos() {
        return "CNH, CRLV e comprovante de residência";
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
