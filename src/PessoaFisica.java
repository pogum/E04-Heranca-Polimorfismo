public class PessoaFisica extends Cliente {
    private String cpf;
    private int idade;
    private char genero;

    public PessoaFisica(){
        this.cpf="000.000.000-00";
        this.idade=0;
        this.genero='n';//inicia com o genero null
    }

    public void setcpf(String cpf) {
        this.cpf = cpf;
    }

    public String getcpf(){
        return this.cpf;
    }

    public void setidade(int idade){
       this.idade=idade;
    }

    public int getidade() {
        return idade;
    }

    public void setGenero(char genero){
        if((genero!='m')&& (genero!='f')&&(genero!='n')){
            System.out.println("Genero inválido: informe novamente - m:masculinho ou f:feminino");
        }
        this.genero=genero;
    }

    public char getgenero(){
        return this.genero;
    }
    public void imprimirClientePF(PessoaFisica cliente){
        imprimirCliente(cliente);
        System.out.println("CPF:"+getcpf());
        System.out.println("Idade:"+getidade());
        System.out.println("Gênero:"+getgenero());
    }
}
