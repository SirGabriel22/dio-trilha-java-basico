import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
            //TODO: Conhecer e importar a classe Scanner;

            //Exibir as mensagens para o usuário;

            //Obter, pela classe Scanner, os valores digitados no terminal;

            //Exibir a conta criada.

            /*-------------------------------------------------------------------*/
            
            int numeroDaConta;
            String agencia, nomeCliente, sobrenomeCliente, nomeCompleto;
            double saldo;
            Scanner leitor = new Scanner(System.in);

            //Preenchimento dos dados
            
            //Pessoais:
            
            System.out.println("Por favor, digite seu nome:");
            nomeCliente = leitor.nextLine();
            System.out.println("Sobrenome do cliente:");
            sobrenomeCliente = leitor.nextLine();
            nomeCompleto = nomeCliente + " " + sobrenomeCliente;
            
            //Bancários:

            System.out.println("Informe a sua agência:");
            agencia = leitor.nextLine();
            System.out.println("Informe o número da conta:");
            numeroDaConta = leitor.nextInt();
            System.out.println("Saldo disponível:");
            saldo = leitor.nextDouble();

            pontilharParaOrganizar();
            
            if (saldo > 0) {
                System.out.println("Olá, "+ nomeCompleto + ", obrigado por criar sua conta em nosso banco!\nSua agência é " + agencia + ", conta "+ numeroDaConta + " e seu saldo R$ " + saldo + " está disponível para saque.\n");
            }
            else{
                System.out.println("Olá, "+ nomeCompleto + ", obrigado por criar sua conta em nosso banco!\nSua agência é " + agencia + ", conta "+ numeroDaConta + " e seu saldo R$ " + saldo + " não está disponível para saque.");
                System.out.println("A instituição financeira entrará em contato contigo em breve.\n");
            }
    }

    public static void pontilharParaOrganizar(){
        System.out.println("\n----------------------------------------------------------------------------------------------------------\n");
    }
}
