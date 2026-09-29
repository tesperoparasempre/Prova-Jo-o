public class Desenvolvedor extends Funcionario{

    public Desenvolvedor(String nome, String cpf, double salarioBase){
        super(nome,cpf,salarioBase);

    public double calcularSalario(){
        return salarioBase;
        }
    }

    @Override
        public double calcularSalario(){
    }
}
