public abstract class AbsCriador {

    public abstract AbsApolice criarApolice();

    public abstract String gerarNumeroApolice();

    public final AbsApolice processarContratacao() {

        AbsApolice apolice = criarApolice();

        if (!apolice.validacaoDeCobertura()) {
            return null;
        }

        return apolice;
    }
}