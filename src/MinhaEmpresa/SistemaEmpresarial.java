package MinhaEmpresa;

import java.util.Scanner;
public class SistemaEmpresarial {

    public static void main(String[] args) {

        System.out.println("SISTEMA EMPRESARIAL 1.0");
        int MENU = 0;
        Empresa e = new Empresa();
        do {
            System.out.println("=-=-=-=-= MENU =-=-=-=-=");
            System.out.println("DIGITE 0 PARA FECHAR O PROGRAMA.");
            System.out.println("DIGITE 1 PARA INSERIR OS DADOS DA SUA EMPRESA.");
            System.out.println("DIGITE 2 PARA CADASTRAR UMA NOVA PESSOA (CLIENTE, FUNCIONÁRIO, FORNECEDOR).");
            System.out.println("DIGITE 3 PARA CADASTRAR UM NOVO PRODUTO.");
            System.out.println("DIGITE 4 PARA MOSTRAR PESSOAS CADASTRADAS (CLIENTES FUNCIONÁRIOS E FORNECEDORES.");
            System.out.println("DIGITE 5 PARA MOSTRAR PRODUTOS CADASTRADOS.");


            Scanner menuChoice = new Scanner(System.in);
            MENU = menuChoice.nextInt();
            
            
            //SWITCH CASE PARA ESCOLHA DE OPÇÕES DO USUÁRIO
            switch (MENU) {
                case 0 -> {
                    System.out.println("FIM DO PROGRAMA.");
                }
                case 1 -> {
                    System.out.println("----- CADASTRO DE EMPRESA ----- ");
                    System.out.println("Insira o nome da sua Empresa: ");
                    Scanner se = new Scanner(System.in);
                    String nome = se.nextLine();
                    e.setNome(nome);
                    System.out.println("Data de fundação: (DDMMYYY)");
                    Scanner sday = new Scanner(System.in);
                    int sf = sday.nextInt();
                    e.setDataFundacao(sf);

                    System.out.println("");

                    System.out.println("Insira o Código postal da Empresa: ");
                    System.out.println("Indicativo (Primeiros 5 dígitos do CEP): ");
                    CodigoPostal cpe = new CodigoPostal();
                    Scanner sInd = new Scanner(System.in);
                    int Indicat = sInd.nextInt();
                    cpe.setIndicativo(Indicat);
                    System.out.println("Extensão (últimos 3 dígitos do CEP):");
                    Scanner sExt = new Scanner(System.in);
                    int Exten = sExt.nextInt();
                    cpe.setExtensao(Exten);

                    System.out.println("");
                    System.out.println("-----------------------");
                    System.out.println("NOME DA EMPRESA: " + e.getNome());
                    System.out.println("DATA DE FUNDAÇÃO: " + e.getDataFundacao());
                    cpe.MostrarCp();
                    System.out.println("-----------------------");
                    break;
                }

                case 2 -> {
                    e.addPessoa();
                    break;
                }
                
                case 3 -> {
                    e.addProduto();
                    break;
                }
                case 4 ->{
                    e.mostraPessoas();
                    break;
                }
                case 5 ->{
                    e.mostrarProdutos();
                    break;
                }
                
                default -> {
                    System.out.println("ERRO. ESCOLHA INVÁLIDA");
                }
            }
        } while (MENU != 0);
    }

}
