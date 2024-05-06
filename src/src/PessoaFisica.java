public class PessoaFisica extends Cliente {
    String cpf;
    int idade;
    char sexo;

    public void imprimir() {
        System.out.println("Dono: " + super.nome);
        System.out.println("Endereco: "+ super.endereco);
        System.out.println("CPF: " + cpf);
        System.out.println("Idade do cliente: " + idade);
        System.out.println("Sexo: " + sexo);
        System.out.println("Data de criacao da conta: "+ super.data);
        System.out.println("====================");
    }
}
