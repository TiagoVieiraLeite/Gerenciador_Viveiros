package Objetos;

public class Modulo {

    private int Id;

    private String Descricao;

    public Modulo(int Id, String Descricao) {
        this.Id = Id;
        this.Descricao = Descricao;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }
}
