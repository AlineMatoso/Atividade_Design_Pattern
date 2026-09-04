public class ApolicAuto extends AbsApolice{

    private double valorFipe;
    private int idadeCondutor;
    private int tempoHabilitacao;
    private double coberturaTerceiros;

    // para resumo

    private String numeroApolice;
    private String segurado;
    private String dataEmissao;



    public ApolicAuto(double valorFipe, int idadeCondutor, int tempoHabilitacao, double coberturaTerceiros) {

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
        return "Número da apólice: " + numeroApolice
                + "\nSegurado: " + segurado
                + "\nData de emissão: " + dataEmissao
                + "\nPrêmio mensal: R$ " + calculoDePremio()
                + "\nDocumentos exigidos: " + listagemDocumentos();
    }
    

    
}
