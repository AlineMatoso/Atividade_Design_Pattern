    public abstract class AbsApolice{

        public abstract double calculoDePremio();

        public abstract boolean validacaoDeCobertura();

        public abstract String listagemDocumentos();

        public abstract String resumo();

        private String numeroApolice;
        private String segurado;
        private String dataEmissao;

        public String getNumeroApolice() {
            return numeroApolice;
        }

        public String getDataEmissao() {
            return dataEmissao;
        }

        public String getSegurado() {
            return segurado;
        }


        public AbsApolice(String numeroApolice, String segurado, String dataEmissao) {
            this.numeroApolice = numeroApolice;
            this.segurado = segurado;
            this.dataEmissao = dataEmissao;
        }


    }