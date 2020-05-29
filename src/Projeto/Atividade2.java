package Projeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args) {
       menu();
    }
    
    public static void menu(){
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
        
        do{       
            pessoa = new Pessoa();
            System.out.println("----------MENU DE OPÇÕES----------");
            System.out.println("[1]-Cadastrar");
            System.out.println("[2]-Listar Cadastros");
            System.out.println("[3]-Remover");
            System.out.println("[4]-Editar");
            System.out.println("[0]-Sair");
            System.out.println("----------------------------------");
            System.out.print("Opção: ");
            op = new Integer(sc.nextLine());
        switch (op){  
            case 1:                
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
                listarPessoa.add(pessoa);
                
                //boolean salvo;
                //salvo = listaPessoa(pessoa);
                
                //if(salvo){
                  // System.out.println( pessoa.getNome() + " Salvo com sucesso");
                //}
                break;
            case 2:
                    if(listarPessoa.isEmpty()){
                        System.out.println("Não existe cadastro.");
                    }else{
                        System.out.println(listarPessoa.toString());
                    }
                    break;
                }    
            }
        while(op != 0);   
        sc.close();   
    }
}    


    
