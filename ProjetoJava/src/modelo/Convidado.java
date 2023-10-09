package modelo;

public class Convidado {

    int id;
    String nome;
    String cpf;
    int valorPago;

    public void getId(int id) {
        this.id = id;
    }

    public int setId() {
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

    public void setValorPago(int valorpago) {
        this.valorPago = valorpago;
    }

    public int getValorPago() {
        return valorPago;
    }
}
