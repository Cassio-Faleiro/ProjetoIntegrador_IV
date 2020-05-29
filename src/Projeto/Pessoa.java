
package Projeto;

public class Pessoa {
    private int codigo;
    private String nome;
    private String sobrenome;
    private String telefone;
    private String cpf;
    private String dataNascimento;
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    
    //retorna lista de cadastrados
    @Override
    public String toString(){
        return "ID: "+codigo+""+
                "\n"+"Nome Completo: "+nome+""+
                    " "+sobrenome+""+
                        "\n"+"Telefone: "+telefone+""+
                            "\n"+"CPG: "+cpf+""+
                                "\n"+"Data de Nacimento: "+dataNascimento+ 
                                    "\n"+"---------------------------"+"\n";
    }
}

