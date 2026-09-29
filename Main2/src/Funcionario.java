public abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salarioBase;

    public Funcionario(String nome, String cpf,double salarioBase){
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;

        public String getCpf(){

        public double getSalarioBase() {
                return.salarioBase = salarioBase;
            }

        public void setSalarioBase(double salarioBase){
        if (salarioBase > 0){
            this.salarioBase = salarioBase;
        }
            }

        public abstract double CalcularSalario();

        public void exibirDados(){
                System.out.println("Nome: " + nome);
                System.out.println("CPF: " + cpf);
                System.out.println("Salário base: " + salarioBase);
            }
        }
    }
}
