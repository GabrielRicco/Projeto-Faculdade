package modelo;

public class Aluno {

    int id;
    String nome;
    String cpf;
    int idade;
    int mensalidade;
    int multaAtraso;
    String endereco;
    String telefone;
    String plano;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setMensalidade(int mensalidade) {
        this.mensalidade = mensalidade;
    }

    public int getMensalidade() {
        return mensalidade;
    }

    public void setMultaAtraso(int multaatraso) {
        this.multaAtraso = multaatraso;
    }

    public int getMultaAtraso() {
        return multaAtraso;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }
    
    public void setPlano(String plano) {
        this.plano = plano;
        
        if((plano.equals("basico")) || (plano.equals("básico")) || (plano.equals("Basico")) || (plano.equals("Básico"))) {
            setMensalidade(70);
        }
        
        if((plano.equals("medio")) || (plano.equals("médio")) || (plano.equals("Medio")) || (plano.equals("Médio"))) {
            setMensalidade(90);
        }
        
        if((plano.equals("completo")) || (plano.equals("Completo"))) {
            setMensalidade(120);
        }
    }

    public String getPlano() {
        return plano;
    }
    
    public boolean validarPlano() {
        if((plano.equals("basico")) || (plano.equals("básico")) || (plano.equals("Basico")) || (plano.equals("Básico"))) {
            return true;
        }
        
        if((plano.equals("medio")) || (plano.equals("médio")) || (plano.equals("Medio")) || (plano.equals("Médio"))) {
            return true;
        }
        
        if((plano.equals("completo")) || (plano.equals("Completo"))) {
            return true;
        }
        
        return false;
    }
}
