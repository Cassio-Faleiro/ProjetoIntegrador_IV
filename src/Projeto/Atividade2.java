package Projeto;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args) {
       menu();
    }
    
    public static void menu(){
        Metodos metodo = new Metodos();
        Scanner sc = new Scanner(System.in);
        Pessoa pessoa;
        List<Pessoa> listaPessoa = new ArrayList<Pessoa>();
        //boolean salvo;
        
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
        
        do{       
            System.out.println("----------MENU DE OPÇÕES----------");
            System.out.println("[1]-Cadastrar");
            System.out.println("[2]-Listar Cadastros");
            System.out.println("[3]-Remover");
            System.out.println("[4]-Editar");
            System.out.println("[0]-Sair");
            System.out.println("----------------------------------");
            System.out.print("Opção: ");
            op = new Integer(sc.nextLine());
        if(op == 1){  
                pessoa = new Pessoa();
                
                System.out.print("Codigo: ");
                codigo = dados1.nextInt();
                pessoa.setCodigo(codigo);
                
                System.out.print("Nome: ");
                nome = dados2.nextLine();
                pessoa.setNome(nome);
                
                System.out.print("Sobrenome: ");
                sobrenome = dados3.nextLine();
                pessoa.setSobrenome(sobrenome);
                
                System.out.print("Telefone: ");
                telefone = dados4.nextLine();
                pessoa.setTelefone(telefone);
                
                System.out.print("CPF: ");
                cpf = dados5.nextLine();
                pessoa.setCpf(cpf);
                
                System.out.print("Data de Nascimento: ");
                dataNascimento = dados6.nextLine();
                pessoa.setDataNascimento(dataNascimento);
                listaPessoa.add(pessoa);
                //salvo = metodo.addPessoa(pessoa);
                
                //if(salvo){
                //    System.out.println( pessoa.getNome() + " Salvo com sucesso");
                //}           
            }else if (op == 2){
                    if(listaPessoa.isEmpty()){
                        System.out.println("Não existe cadastro.");
                    }else{
                        System.out.println(listaPessoa.toString());
                    }
                }    
            }
        while(op != 0);   
        sc.close();   
    }
}    


    
