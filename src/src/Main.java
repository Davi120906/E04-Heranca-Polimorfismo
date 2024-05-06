import java.util.Date;
public class Main {
    public static void main(String[] args) {
        Cliente lucas = new Cliente();
        PessoaFisica joao = new PessoaFisica();
        joao.nome = "João";
        joao.endereco = "Av. Antonio Carlos, 6627";
        joao.idade = 36;
        joao.sexo = 'm';
        joao.cpf = "011.965.966-14";
        joao.data = new Date();
        
        PessoasJuridica empresajoao = new PessoasJuridica();
        empresajoao.nome = "João";
        empresajoao.endereco = "Av. Antonio Carlos, 6627";
        empresajoao.data = new Date();
        empresajoao.cnpj = "12345678";
        empresajoao.numfuncionarios = 13;
        empresajoao.setor = "Informatica";
        
        Conta conta1 = new Conta(1234, joao, 0, 1500);
        Conta conta2 = new Conta(12121, joao, 10000, 1500);

        conta1.depositar(3000);
        conta1.depositar(2000);
        conta1.sacar(500);

        conta2.transferir(conta1, 666);
        conta2.depositar(234);

        conta1.imprimirExtrato();
        conta2.imprimirExtrato();

        lucas.imprimir();

        joao.imprimir();

        empresajoao.imprimir();

        int media = Operacao.getTotalOperacoes() / Conta.getTotalContas();
        System.out.println("Média de operações por conta aberta: " + media);
    }
}