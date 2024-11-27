public class Empregado{

    protected String nome;
    protected String endereco;
    protected double salario;
    
    public Empregado(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
    
    public double calcularIRPF(){
        double aux;
        if (salario < 1800){
            aux = 0.1 * salario;
        }
        else{
            aux = 0.27 * salario;
        }
        return (aux);

    }
    public double calcularINSS(){
        return (0.11 * salario);
    }

    public void imprimir(){
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Salario: " + salario);
    }
}