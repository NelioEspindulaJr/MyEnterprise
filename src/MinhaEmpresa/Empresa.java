package MinhaEmpresa;

import java.util.ArrayList;
import java.util.Scanner;

public class Empresa {

    private ArrayList<Pessoa> Pessoas = new ArrayList<>();
//    private ArrayList<Empregado> funcionarios = new ArrayList<>();
    private ArrayList<Produto> produtos = new ArrayList<>();
    //private ArrayList<Fornecedor> fornecedores = new ArrayList<>();
    private String nome;
    private int dataFundacao;
    private CodigoPostal cp;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(int dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public CodigoPostal getCp() {
        return cp;
    }

    public void setCp(CodigoPostal cp) {
        this.cp = cp;
    }

    public ArrayList<Pessoa> getPessoas() {
        return Pessoas;
    }

    public void setPessoas(ArrayList<Pessoa> Pessoas) {
        this.Pessoas = Pessoas;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public void addPessoa() {
        int escolha;
        do {
            System.out.println("SE QUISER CADASTRAR UM FUNCIONÁRIO, DIGITE 1.");
            System.out.println("SE QUISER CADASTRAR UM FORNECEDOR, DIGITE 2.");
            System.out.println("SE QUISER CADASTRAR UM CLIENTE, DIGITE 3");
            System.out.println("CASO DESEJE ENCERRAR ESTE PROCESSO, DIGITE 0.");
            Scanner sesco = new Scanner(System.in);
            escolha = sesco.nextInt();

            switch (escolha) {
                case 1 -> {
                    System.out.println("----- NOVO FUNCIONÁRIO -----");
                    System.out.println("Nome: ");
                    Empregado Funcionario = new Empregado();
                    Scanner snameF = new Scanner(System.in);
                    String Fname = snameF.nextLine();
                    Funcionario.setNome(Fname);
                    System.out.println("Idade: ");
                    Scanner sageF = new Scanner(System.in);
                    byte ageF = sageF.nextByte();
                    Funcionario.setIdade(ageF);
                    System.out.println("Contribuinte (CPF/CNPJ):");
                    Scanner scontF = new Scanner(System.in);
                    long contribuinteF = scontF.nextLong();
                    Funcionario.setContribuinte(contribuinteF);
                    System.out.println("CEP: ");
                    CodigoPostal cpF = new CodigoPostal();
                    Scanner sIndF = new Scanner(System.in);
                    System.out.println("Indicativo(Primeiros 5 dígitos do CEP): ");
                    int IndicatF = sIndF.nextInt();
                    cpF.setIndicativo(IndicatF);
                    System.out.println("Extensão (últimos 3 dígitos do CEP):");
                    Scanner sExtF = new Scanner(System.in);
                    int ExtenF = sExtF.nextInt();
                    cpF.setExtensao(ExtenF);

                    System.out.println("");

                    System.out.println("----- INFORMAÇÕES DO TRABALHO -----");
                    System.out.println("Insira o cargo do Funcionário: ");
                    Scanner scarg = new Scanner(System.in);
                    String cargo = scarg.nextLine();
                    Funcionario.setCargo(cargo);
                    System.out.println("Insira o número da Seção (EX: 000) : ");
                    Scanner ssec = new Scanner(System.in);
                    int section = ssec.nextInt();
                    Funcionario.setNumeroSecao(section);
                    System.out.println("Insira o Salário Base do funcionário: ");
                    Scanner ssalar = new Scanner(System.in);
                    float salary = ssalar.nextFloat();
                    Funcionario.setSalarioBase(salary);
                    Funcionario.calcularSalario();

                    Pessoas.add(Funcionario);
                    //System.out.println(Pessoas.size());

                    System.out.println("----- FUNCIONÁRIO -----");
                    System.out.println("Nome: " + Funcionario.getNome());
                    System.out.println("Cargo: " + Funcionario.getCargo() + " - Seção: " + Funcionario.getNumeroSecao());
                    System.out.println("Salário Base: R$ " + Funcionario.getSalarioBase());
                    System.out.println("Salário: R$ " + Funcionario.getSalario() + "\n(Impostos já descontados)");
                }
                case 2 -> {
                    System.out.println("----- FORNECEDOR -----");
                    System.out.println("Nome: ");
                    Fornecedor novoFornecedor = new Fornecedor();
                    Scanner snamefor = new Scanner(System.in);
                    String name = snamefor.nextLine();
                    novoFornecedor.setNome(name);

                    System.out.println("Contribuinte (CPF/CNPJ):");
                    Scanner scontfor = new Scanner(System.in);
                    long contribuinte = scontfor.nextLong();
                    novoFornecedor.setContribuinte(contribuinte);
                    System.out.println("CEP: ");
                    CodigoPostal cpfor = new CodigoPostal();
                    Scanner sIndFor = new Scanner(System.in);
                    System.out.println("Indicativo(Primeiros 5 dígitos do CEP): ");
                    int IndicatFor = sIndFor.nextInt();
                    cpfor.setIndicativo(IndicatFor);
                    System.out.println("Extensão (últimos 3 dígitos do CEP):");
                    Scanner sExtFor = new Scanner(System.in);
                    int ExtenFor = sExtFor.nextInt();
                    cpfor.setExtensao(ExtenFor);

                    System.out.println("");
                    System.out.println("----- INFORMAÇÕES DE CRÉDITO -----");
                    System.out.println("Insira o plafond da empresa com o Fornecedor: ");
                    Scanner splafFor = new Scanner(System.in);
                    float plafondFor = splafFor.nextFloat();
                    novoFornecedor.setPlafond(plafondFor);
                    System.out.println("Insira o valor em dívida com o Fornecedor: ");
                    Scanner sdebtFor = new Scanner(System.in);
                    float debtFor = sdebtFor.nextFloat();
                    novoFornecedor.setValorEmDivida(debtFor);

                    Pessoas.add(novoFornecedor);
                    System.out.println(Pessoas.size());

                    System.out.println("");

                    System.out.println("----- FORNECEDOR -----");
                    System.out.println("Nome do Fornecedor: " + novoFornecedor.getNome());
                    System.out.println("CPF/CNPJ: " + novoFornecedor.getContribuinte());
                    cpfor.MostrarCp();
                }
                case 3 -> {
                    System.out.println("----- CADASTRAR NOVO CLIENTE -----");
                    System.out.println("Nome: ");
                    Cliente NovoCliente = new Cliente();
                    Scanner sname = new Scanner(System.in);
                    String name = sname.nextLine();
                    NovoCliente.setNome(name);
                    System.out.println("Idade: ");
                    Scanner sage = new Scanner(System.in);
                    byte age = sage.nextByte();
                    NovoCliente.setIdade(age);
                    System.out.println("Contribuinte (CPF/CNPJ):");
                    Scanner scont = new Scanner(System.in);
                    long contribuinte = scont.nextLong();
                    NovoCliente.setContribuinte(contribuinte);
                    System.out.println("CEP: ");
                    CodigoPostal cpc = new CodigoPostal();
                    Scanner sIndC = new Scanner(System.in);
                    System.out.println("Indicativo(Primeiros 5 dígitos do CEP): ");
                    int IndicatC = sIndC.nextInt();
                    cpc.setIndicativo(IndicatC);
                    System.out.println("Extensão (últimos 3 dígitos do CEP):");
                    Scanner sExtC = new Scanner(System.in);
                    int ExtenC = sExtC.nextInt();
                    cpc.setExtensao(ExtenC);

                    System.out.println("");
                    System.out.println("----- INFORMAÇÕES DE CRÉDITO -----");
                    System.out.println("Insira o plafond do Cliente (Teto de crédito): ");
                    Scanner splaf = new Scanner(System.in);
                    float plafond = splaf.nextFloat();
                    NovoCliente.setPlafond(plafond);
                    System.out.println("Insira o valor em dívida (Gastos) do cliente: ");
                    Scanner sdebt = new Scanner(System.in);
                    float debt = sdebt.nextFloat();
                    NovoCliente.setValorEmDivida(debt);

                    Pessoas.add(NovoCliente);
                    System.out.println(Pessoas.size());

                    System.out.println("----- DADOS CADASTRADOS -----");
                    System.out.println("Nome: " + NovoCliente.getNome() + " - " + NovoCliente.getIdade() + " anos");
                    cpc.MostrarCp();
                    System.out.println("Plafond: R$ " + NovoCliente.getPlafond());
                    System.out.println("Valor em Dívida: R$ " + NovoCliente.getValorEmDivida());
                    System.out.println("Saldo: R$ " + NovoCliente.getSaldo());

                }
                default -> {
                    System.out.println("FIM DO PROCESSO.");
                }
            }
        } while (escolha != 0);

    }

    public void addProduto() {
        System.out.println("----- PRODUTO -----");
        Produto p = new Produto();
        System.out.println("Designação (Nome do produto): ");
        Scanner sdes = new Scanner(System.in);
        String Designacao = sdes.nextLine();
        p.setDesignacao(Designacao);
        System.out.println("ID do produto");
        Scanner sid = new Scanner(System.in);
        int id = sid.nextInt();
        p.setProdutoID(id);
        System.out.println("Preço de venda: ");
        Scanner sprice = new Scanner(System.in);
        float sellPrice = sprice.nextFloat();
        p.setPrecoVendaPublico(sellPrice);
        System.out.println("Quantidade em estoque: ");
        Scanner sqnt = new Scanner(System.in);
        int quant = sqnt.nextInt();
        p.setStock(quant);

        produtos.add(p);

        p.mostrar();

    }

    public void mostraPessoas() {

        System.out.println("Pessoas Cadastrados: " + Pessoas.size());
        for (int j = 0; j < Pessoas.size(); j++) {
            
            System.out.println(Pessoas.get(j).getClass().toString());
            System.out.println("Nome: " + Pessoas.get(j).getNome() + " - Contribuinte (CPF/CNPJ): " + Pessoas.get(j).getContribuinte());
            System.out.println("");
        }

    }

    public void mostrarProdutos() {
        System.out.println("Produtos cadastrados: " + produtos.size());
        for (int i = 0; i < produtos.size(); i++) {
            System.out.println(produtos.get(i).getDesignacao() + " - ID: " + produtos.get(i).getProdutoID() + " - Preço: R$" + produtos.get(i).getPrecoVendaPublico());
            System.out.println("");
        }
    }

}
