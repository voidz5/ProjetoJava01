import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int resp;
        int respC;
        int respF;
        int respP;
        int respPesq;
        boolean x = true;

        ArrayList<Pessoa> listc = new ArrayList<Pessoa>();
        ArrayList<Pessoa> listf = new ArrayList<Pessoa>();
        ArrayList<Produto> listp = new ArrayList<Produto>();

        do {
            System.out.println("Escolha uma opção:\n" +
                    "1 - Clientes\n" +
                    "2 - Funcionários\n" +
                    "3 - Produtos\n" +
                    "0 - Sair");
            resp = teclado.nextInt();
            teclado.nextLine();

            switch (resp) {
                case 1:
                    do {
                        System.out.println("Opções para Clientes:\n" +
                                "1 - Adicionar\n" +
                                "2 - Excluir\n" +
                                "3 - Mostrar\n" +
                                "4 - Buscar por nome\n" +
                                "0 - Voltar");
                        respC = teclado.nextInt();
                        teclado.nextLine();
                        switch (respC) {
                            case 1:
                                String confCA = "S";
                                do {
                                    System.out.println("Digite o nome: ");
                                    String nome = teclado.nextLine();
                                    System.out.println("Digite a idade: ");
                                    int idade = teclado.nextInt();
                                    teclado.nextLine();
                                    System.out.println("Digite o CPF: ");
                                    String CPF = teclado.nextLine();
                                    System.out.println("Digite o sexo: ");
                                    String sexo = teclado.nextLine();
                                    System.out.println("Digite o email: ");
                                    String email = teclado.nextLine();
                                    Cliente cc = new Cliente(nome, idade, CPF, sexo, email);
                                    listc.add(cc);
                                    System.out.println("Deseja adicionar outro cliente? (S/N)");
                                    confCA = teclado.nextLine();
                                } while (confCA.equals("S"));
                                break;
                            case 2:
                                String confCE = "S";
                                do {
                                    System.out.println("Digite o número do cliente que deseja excluir");
                                    int pos = teclado.nextInt() - 1;
                                    if (pos >= 0 && pos < listc.size()) {
                                        listc.remove(pos);
                                        System.out.println("Cliente excluído com sucesso!");
                                    } else {
                                        System.out.println("Número inválido!");
                                    }
                                    System.out.println("Deseja excluir outro cliente? (S/N)");
                                    teclado.nextLine();
                                    confCE = teclado.nextLine();
                                } while (confCE.equals("S"));
                                break;
                            case 3:
                                System.out.println("Lista de Clientes:");
                                for (int i = 0; i < listc.size(); i++) {
                                    Pessoa p = listc.get(i);
                                    if (p instanceof Cliente) {
                                        Cliente c = (Cliente) p;
                                        System.out.println((i + 1) + ":");
                                        c.exibir();
                                    }
                                }
                                break;
                            case 4:
                                System.out.print("Digite o nome a buscar (ou parte inicial): ");
                                String termoBusca = teclado.nextLine();
                                System.out.println("\nClientes encontrados:");
                                boolean encontrouC = false;
                                for (Pessoa p : listc) {
                                    if (p instanceof Cliente && p.getNome().toLowerCase().startsWith(termoBusca.toLowerCase())) {
                                        Cliente c = (Cliente) p;
                                        c.exibir();
                                        encontrouC = true;
                                    }
                                }
                                if (!encontrouC) {
                                    System.out.println("Nenhum cliente encontrado com esse nome.");
                                }
                                break;
                        }
                    } while (respC != 0);
                    break;

                case 2:
                    do {
                        System.out.println("Opções para Funcionários:\n" +
                                "1 - Adicionar\n" +
                                "2 - Excluir\n" +
                                "3 - Mostrar\n" +
                                "4 - Buscar por nome\n" +
                                "0 - Voltar");
                        respF = teclado.nextInt();
                        teclado.nextLine();
                        switch (respF) {
                            case 1:
                                String confFA = "S";
                                do {
                                    System.out.println("Digite o nome: ");
                                    String nome = teclado.nextLine();
                                    System.out.println("Digite a idade: ");
                                    int idade = teclado.nextInt();
                                    teclado.nextLine();
                                    System.out.println("Digite o código: ");
                                    int cod = teclado.nextInt();
                                    System.out.println("Digite o salário: ");
                                    double salario = teclado.nextDouble();
                                    teclado.nextLine();
                                    System.out.println("Digite o CPF: ");
                                    String CPF = teclado.nextLine();
                                    System.out.println("Digite o guichê: ");
                                    int guiche = teclado.nextInt();
                                    Funcionario f = new Funcionario(nome, idade, cod, salario, CPF, guiche);
                                    listf.add(f);
                                    System.out.println("Deseja adicionar outro funcionário? (S/N)");
                                    teclado.nextLine();
                                    confFA = teclado.nextLine();
                                } while (confFA.equals("S"));
                                break;
                            case 2:
                                String confFE = "S";
                                do {
                                    System.out.println("Digite o número do funcionário que deseja excluir");
                                    int pos = teclado.nextInt() - 1;
                                    if (pos >= 0 && pos < listf.size()) {
                                        listf.remove(pos);
                                        System.out.println("Funcionário excluído com sucesso!");
                                    } else {
                                        System.out.println("Número inválido!");
                                    }
                                    System.out.println("Deseja excluir outro funcionário? (S/N)");
                                    teclado.nextLine();
                                    confFE = teclado.nextLine();
                                } while (confFE.equals("S"));
                                break;
                            case 3:
                                System.out.println("Lista de Funcionários:");
                                for (int i = 0; i < listf.size(); i++) {
                                    Pessoa p = listf.get(i);
                                    if (p instanceof Funcionario) {
                                        Funcionario f = (Funcionario) p;
                                        System.out.println((i + 1) + ":");
                                        f.exibir();
                                    }
                                }
                                break;
                            case 4:
                                System.out.print("Digite o nome a buscar (ou parte inicial): ");
                                String termoBuscaF = teclado.nextLine();
                                System.out.println("\nFuncionários encontrados:");
                                boolean encontrouF = false;
                                for (Pessoa p : listf) {
                                    if (p instanceof Funcionario && p.getNome().toLowerCase().startsWith(termoBuscaF.toLowerCase())) {
                                        Funcionario f = (Funcionario) p;
                                        f.exibir();
                                        encontrouF = true;
                                    }
                                }
                                if (!encontrouF) {
                                    System.out.println("Nenhum funcionário encontrado com esse nome.");
                                }
                                break;
                        }
                    } while (respF != 0);
                    break;

                case 3:
                    do {
                        System.out.println("Opções para Produtos:\n" +
                                "1 - Adicionar\n" +
                                "2 - Excluir\n" +
                                "3 - Mostrar\n" +
                                "4 - Pesquisar\n" +
                                "0 - Voltar");
                        respP = teclado.nextInt();
                        teclado.nextLine();
                        switch (respP) {
                            case 1:
                                String confPA = "S";
                                do {
                                    System.out.println("Digite o nome do produto: ");
                                    String nome = teclado.nextLine();
                                    System.out.println("Digite a descrição do produto: ");
                                    String descricao = teclado.nextLine();
                                    System.out.println("Digite o preço do produto: ");
                                    double preco = teclado.nextDouble();
                                    teclado.nextLine();
                                    System.out.println("Digite o gênero do produto: ");
                                    String genero = teclado.nextLine();
                                    System.out.println("Produto está disponível? (true/false)");
                                    boolean disponibilidade = teclado.nextBoolean();
                                    System.out.println("Produto está em cartaz? (true/false)");
                                    boolean emCartaz = teclado.nextBoolean();
                                    System.out.println("Digite o código do produto: ");
                                    int cod = teclado.nextInt();
                                    Produto p = new Produto(nome, descricao, preco, genero, disponibilidade, emCartaz, cod);
                                    listp.add(p);
                                    System.out.println("Deseja adicionar outro produto? (S/N)");
                                    teclado.nextLine();
                                    confPA = teclado.nextLine();
                                } while (confPA.equals("S"));
                                break;
                            case 2:
                                String confPE = "S";
                                do {
                                    System.out.println("Digite o número do produto que deseja excluir");
                                    int pos = teclado.nextInt() - 1;
                                    if (pos >= 0 && pos < listp.size()) {
                                        listp.remove(pos);
                                        System.out.println("Produto excluído com sucesso!");
                                    } else {
                                        System.out.println("Número inválido!");
                                    }
                                    System.out.println("Deseja excluir outro produto? (S/N)");
                                    teclado.nextLine();
                                    confPE = teclado.nextLine();
                                } while (confPE.equals("S"));
                                break;
                            case 3:
                                System.out.println("Lista de Produtos:");
                                for (int i = 0; i < listp.size(); i++) {
                                    Produto p = listp.get(i);
                                    System.out.println((i + 1) + ":");
                                    p.exibir();
                                }
                                break;





                                //feito pelo Jõãõ






                            case 4:
                                do{
                                    System.out.println("Qual método de pesquisa você deseja utilizar?\n" +
                                            "1 - Busca por descrição\n" +
                                            "2 - Busca por código\n" +
                                            "3 - Busca por disponibilidade\n" +
                                            "0 - Voltar");
                                    respPesq = teclado.nextInt();
                                    teclado.nextLine(); // Limpar buffer

                                    switch (respPesq) {
                                        case 1:
                                            System.out.println("Digite parte da descrição:");
                                            String descBusca = teclado.nextLine().toLowerCase();
                                            boolean encontrouDesc = false;
                                            for (Produto ps : listp) {
                                                if (ps.getDescricao().toLowerCase().contains(descBusca)) {
                                                    ps.exibir();
                                                    encontrouDesc = true;
                                                }
                                            }
                                            if (!encontrouDesc) {
                                                System.out.println("Nenhum produto/serviço encontrado com essa descrição.");
                                            }
                                            break;

                                        case 2:
                                            System.out.println("Digite o código:");
                                            int codigoBusca = teclado.nextInt();
                                            boolean encontrouCod = false;
                                            for (Produto ps : listp) {
                                                if (ps.getCod() == codigoBusca) {
                                                    ps.exibir();
                                                    encontrouCod = true;
                                                    break;
                                                }
                                            }
                                            if (!encontrouCod) {
                                                System.out.println("Nenhum produto/serviço encontrado com esse código.");
                                            }
                                            break;

                                        case 3:
                                            System.out.println("Buscar por:\n1 - Disponível\n2 - Indisponível");
                                            int dispBusca = teclado.nextInt();
                                            boolean disponibilidade = (dispBusca == 1);
                                            boolean encontrouDisp = false;
                                            for (Produto ps : listp) {
                                                if (ps.isDisponibilidade() == disponibilidade) {
                                                    ps.exibir();
                                                    encontrouDisp = true;
                                                }
                                            }
                                            if (!encontrouDisp) {
                                                System.out.println("Nenhum produto/serviço encontrado com essa disponibilidade.");
                                            }
                                            break;


                                    }
                                }while (respPesq!=0);
                                break;

                        }
                    } while (respP != 0);
                    break;























                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (resp != 0);

        teclado.close();
    }
}
