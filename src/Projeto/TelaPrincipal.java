package Projeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TelaPrincipal {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        //cria o a lista de cadastro
        List<Pessoa> listarPessoa = new ArrayList<Pessoa>();
        Pessoa pessoa;

        Scanner dados1 = new Scanner(System.in);
        Scanner dados2 = new Scanner(System.in);
        Scanner dados3 = new Scanner(System.in);
        Scanner dados4 = new Scanner(System.in);
        Scanner dados5 = new Scanner(System.in);
        Scanner dados6 = new Scanner(System.in);

        int codigo = 0;
        String nome = "";
        String sobrenome = "";
        String telefone = "";
        String cpf = "";
        String dataNascimento = "";

        int op = 0;

        do {
            pessoa = new Pessoa();
            System.out.println("----------MENU DE OPÇÕES----------");
            System.out.println("[1]-Cadastrar");
            System.out.println("[2]-Listar Cadastros");
            System.out.println("[3]-Deletar");
            System.out.println("[4]-Editar");
            System.out.println("[5]-Total de Cadastros");
            System.out.println("[0]-Sair");
            System.out.println("----------------------------------");
            System.out.print("<===INFORME A OPÇÃO===> ");

            op = new Integer(sc.nextLine());
            switch (op) {
                case 1:
                    System.out.println("--------------------------");
                    System.out.print("Codigo: ");
                    codigo = dados1.nextInt();
                    if (codigo == 0) {
                        while (codigo == 0) {
                            System.out.println("--------------------------");
                            System.out.print("ERRO, Campo deve ser maior que zero!" + "\n" + "Nome: ");
                            codigo = dados1.nextInt();
                            pessoa.setCodigo(codigo);
                        }
                    } else {
                        pessoa.setCodigo(codigo);
                    }

                    System.out.println("--------------------------");
                    System.out.print("Nome: ");
                    nome = dados2.nextLine();
                    if (nome.isEmpty()) {
                        while (nome.isEmpty()) {
                            System.out.println("--------------------------");
                            System.out.print("ERRO, Campo obrigatorio!" + "\n" + "Nome: ");
                            nome = dados2.nextLine();
                            pessoa.setNome(nome);
                        }
                    } else {
                        pessoa.setNome(nome);
                    }

                    System.out.println("--------------------------");
                    System.out.print("Sobrenome: ");
                    sobrenome = dados3.nextLine();
                    if (sobrenome.isEmpty()) {
                        while (sobrenome.isEmpty()) {
                            System.out.println("--------------------------");
                            System.out.print("ERRO, Campo obrigatorio!" + "\n" + "Sobrenome: ");
                            sobrenome = dados3.nextLine();
                            pessoa.setSobrenome(sobrenome);
                        }
                    } else {
                        pessoa.setSobrenome(sobrenome);
                    }

                    System.out.println("--------------------------");
                    System.out.print("Telefone: ");
                    telefone = dados4.nextLine();
                    if (telefone.isEmpty()) {
                        while (telefone.isEmpty()) {
                            System.out.println("--------------------------");
                            System.out.print("ERRO, Campo obrigatorio!" + "\n" + "Telefone: ");
                            telefone = dados4.nextLine();
                            pessoa.setTelefone(telefone);
                        }
                    } else {
                        pessoa.setTelefone(telefone);
                    }

                    System.out.println("--------------------------");
                    System.out.print("CPF: ");
                    cpf = dados5.nextLine();
                    if (cpf.isEmpty()) {
                        while (cpf.isEmpty()) {
                            System.out.println("--------------------------");
                            System.out.print("ERRO, Campo obrigatorio!" + "\n" + "CPF: ");
                            cpf = dados5.nextLine();
                            pessoa.setCpf(cpf);
                        }
                    } else {
                        pessoa.setCpf(cpf);
                    }

                    System.out.println("--------------------------");
                    System.out.print("Data de Nascimento: ");
                    dataNascimento = dados6.nextLine();
                    if (dataNascimento.isEmpty()) {
                        while (dataNascimento.isEmpty()) {
                            System.out.println("--------------------------");
                            System.out.print("ERRO, Campo obrigatorio!" + "\n" + "Data Nascimento: ");
                            dataNascimento = dados6.nextLine();
                            pessoa.setDataNascimento(dataNascimento);
                        }
                    } else {
                        pessoa.setDataNascimento(dataNascimento);
                    }

                    listarPessoa.add(pessoa);
                    break;
                case 2:
                    if (listarPessoa.isEmpty()) {
                        System.out.println("--------------------------");
                        System.out.println("Não existe cadastro.");
                        System.out.println("--------------------------");
                    } else {
                        System.out.println(listarPessoa.toString());
                    }
                    break;
                case 3:
                    if (listarPessoa.size() >= 1) {
                        try {
                            System.out.println("======Informe o índice do cadastro a ser deletado======");
                            int i = Integer.parseInt(sc.nextLine());
                            listarPessoa.remove(i);
                            System.out.println("Cadastro referente ao codigo " + codigo + " deletado com sucesso!");
                        } catch (Exception e) {
                            System.out.println("Não existe cadastro relacionado ao índice informado." + e);
                        }
                    } else {
                        System.out.println("--------------------------");
                        System.out.println("Não existe cadastro.");
                        System.out.println("--------------------------");
                    }
                    break;
                case 4:
                    if (listarPessoa.size() >= 1) {
                        System.out.println("======Informe o índice do cadastro a ser deletado======");
                        int i = Integer.parseInt(sc.nextLine());
                        System.out.println("--------------------------");
                        System.out.print("Editar Codigo: ");
                        codigo = dados1.nextInt();
                        pessoa.setCodigo(codigo);

                        System.out.println("--------------------------");
                        System.out.print("Editar Nome: ");
                        nome = dados2.nextLine();
                        pessoa.setNome(nome);

                        System.out.println("--------------------------");
                        System.out.print("Editar Sobrenome: ");
                        sobrenome = dados3.nextLine();
                        pessoa.setSobrenome(sobrenome);

                        System.out.println("--------------------------");
                        System.out.print("Editar Telefone: ");
                        telefone = dados4.nextLine();
                        pessoa.setTelefone(telefone);

                        System.out.println("--------------------------");
                        System.out.print("Editar CPF: ");
                        cpf = dados5.nextLine();
                        pessoa.setCpf(cpf);

                        System.out.println("--------------------------");
                        System.out.print("Editar Data de Nascimento: ");
                        dataNascimento = dados6.nextLine();
                        pessoa.setDataNascimento(dataNascimento);

                        listarPessoa.set(i, pessoa);
                        System.out.println("--------------------------");
                        System.out.println("Casdatro Editado com Sucesso.");
                    } else {
                        System.out.println("--------------------------");
                        System.out.println("Não existe cadastro.");
                        System.out.println("--------------------------");
                    }
                    break;
                case 5:
                    int total = listarPessoa.size();
                    if (total > 0) {
                        System.out.println("--------------------------");
                        System.out.println("O total de pessoas cadastrada no sistema é: "+total);
                        System.out.println("--------------------------");
                    } else {
                        System.out.println("--------------------------");
                        System.out.println("Não existe cadastro.");
                        System.out.println("--------------------------");
                    }
                    break;
                default:
                    System.out.println("--------------------------");
                    System.out.println("Saiu ou opção inválida do menu.");
                    System.out.println("--------------------------");
            }
        } while (op != 0);
        sc.close();
    }

}
