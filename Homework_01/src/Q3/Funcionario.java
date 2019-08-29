package Q3;

public class Funcionario {
    private String nome;
    private String departamento;
    private double salario;
    private String data;
    private String RG;
    private boolean status;

    public Funcionario(String nome, String departamento, double salario, String data, String RG, boolean status) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        this.data = data;
        this.RG = RG;
        this.status = status; // {true - Trabalha,false-Não trabalha}
    }

    public Funcionario() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String mostra() {
        return "Funcionario{" + "nome=" + nome + ", departamento=" + departamento + ", salario=" + salario + ", data=" + data + ", RG=" + RG + ", status=" + status + '}';
    }
    
    public void bonifica(double newValue){
        this.setSalario(newValue);
    }
    public void demite(){
        this.setStatus(false);
    }
}
