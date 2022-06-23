package MinhaEmpresa;

public class Empregado extends Pessoa {

    private int numeroSecao;
    private float salarioBase;
    private float iRS;
    private String cargo;
    private Float salario;

    public Empregado(String nome, long contribuinte, byte idade, CodigoPostal cp, int numeroSecao, float salarioBase, String cargo) {
        super(nome, contribuinte, idade, cp);
        this.numeroSecao = numeroSecao;
        this.salarioBase = salarioBase;
        this.cargo = cargo;
    }//ok

    public Empregado() {
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    public int getNumeroSecao() {
        return numeroSecao;
    }

    public void setNumeroSecao(int numeroSeccao) {
        this.numeroSecao = numeroSeccao;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public float getiRS() {
        return iRS;
    }

    public void setiRS(float iRS) {
        this.iRS = iRS;
    }

    public float calcularSalario() {
        if (salarioBase <= 7112) {
            iRS = 0.145F;
        } else if (salarioBase <= 10732) {
            iRS = 0.23F;
        } else if (salarioBase <= 20322) {
            iRS = 0.28F;
        } else if (salarioBase <= 25075) {
            iRS = 0.35F;
        } else if (salarioBase <= 36967) {
            iRS = 0.37F;
        } else if (salarioBase <= 80882) {
            iRS = 0.45F;
        } else {
            iRS = 0.48F;
        }
        return this.salario = this.salarioBase * (1 - this.iRS);
    }//ok
    @Override
    public void mostra(){
        super.mostra();
        System.out.println("Empregado" + this.getCargo());
        
    }
}
