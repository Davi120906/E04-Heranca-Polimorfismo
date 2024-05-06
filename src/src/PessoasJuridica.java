public class PessoasJuridica extends Cliente {
    String cnpj;
    int numfuncionarios;
    String setor;
    public void imprimir() {
        System.out.println("Dono: " + super.nome);
        System.out.println("Endereco: "+ super.endereco);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Numero de Funcionarios: " + numfuncionarios);
        System.out.println("Setor: " + setor);
        System.out.println("Data de criacao da conta: "+ super.data);
        System.out.println("====================");
    }
}
