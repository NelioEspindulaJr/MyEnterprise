package MinhaEmpresa;

public class Fornecedor extends Pessoa {

    private float plafond;
    private float ValorEmDivida;

    public Fornecedor(String nome, long contribuinte, byte idade, CodigoPostal cp, float plafond, float valorEmDivida) {
        super(nome, contribuinte, idade, cp);
        this.plafond = plafond;
        ValorEmDivida = valorEmDivida;
    }//ok

    public Fornecedor() {
    }

    public float getPlafond() {
        return plafond;
    }

    public void setPlafond(float plafond) {
        this.plafond = plafond;
    }

    public float getValorEmDivida() {
        return ValorEmDivida;
    }

    public void setValorEmDivida(float valorEmDivida) {
        ValorEmDivida = valorEmDivida;
    }
    @Override
    public void mostra(){
        super.mostra();
        System.out.println("Fornecedor: " + this.getNome());
    }
}
