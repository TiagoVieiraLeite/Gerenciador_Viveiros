package Objetos;

public class ModuloFuncionario {

    private int IdFuncionario;

    private int IdModulo;

    private boolean PConsulta;

    private boolean PInsercao;

    private boolean PAlteracao;

    private boolean PExclusao;

    public ModuloFuncionario(int IdFuncionario, int IdModulo, boolean PConsulta, boolean PInsercao, boolean PAlteracao, boolean PExclusao) {
        this.IdFuncionario = IdFuncionario;
        this.IdModulo = IdModulo;
        this.PConsulta = PConsulta;
        this.PInsercao = PInsercao;
        this.PAlteracao = PAlteracao;
        this.PExclusao = PExclusao;
    }

    public int getIdFuncionario() {
        return IdFuncionario;
    }

    public void setIdFuncionario(int IdFuncionario) {
        this.IdFuncionario = IdFuncionario;
    }

    public int getIdModulo() {
        return IdModulo;
    }

    public void setIdModulo(int IdModulo) {
        this.IdModulo = IdModulo;
    }

    public boolean isPConsulta() {
        return PConsulta;
    }

    public void setPConsulta(boolean PConsulta) {
        this.PConsulta = PConsulta;
    }

    public boolean isPInsercao() {
        return PInsercao;
    }

    public void setPInsercao(boolean PInsercao) {
        this.PInsercao = PInsercao;
    }

    public boolean isPAlteracao() {
        return PAlteracao;
    }

    public void setPAlteracao(boolean PAlteracao) {
        this.PAlteracao = PAlteracao;
    }

    public boolean isPExclusao() {
        return PExclusao;
    }

    public void setPExclusao(boolean PExclusao) {
        this.PExclusao = PExclusao;
    }

    
}
