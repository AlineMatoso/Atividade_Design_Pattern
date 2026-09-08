public class ApolicResidencial extends AbsApolice {

    private double valorImovel;
    private boolean altoPadrao;
    private boolean possuiEscrituraOuContrato;


    public ApolicResidencial(String numeroApolice, String segurado, String dataEmissao,
        double valorImovel, boolean altoPadrao, boolean possuiEscrituraOuContrato) {

        super(numeroApolice, segurado, dataEmissao); // envia os dados comuns para o construtor da AbsApolice

            // guarda os dados da apolice residencial
        this.valorImovel = valorImovel;
        this.altoPadrao = altoPadrao;
        this.possuiEscrituraOuContrato = possuiEscrituraOuContrato;
}

    @Override
    public double calculoDePremio() {

        double premioAnual = valorImovel * 0.015;

        if (altoPadrao) {
            premioAnual = premioAnual * 1.25;
        }

        return premioAnual / 12;
    }

    @Override
    public boolean validacaoDeCobertura() {
        return possuiEscrituraOuContrato;
    }

    @Override
    public String listagemDocumentos() {
        return "Escritura ou contrato de locação e comprovante de residência";
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