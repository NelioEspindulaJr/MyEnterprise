package MinhaEmpresa;

public class Cliente extends Pessoa {

    private float plafond;
    //Plafond significa �limite de cr�dito� 
    //ou �limite m�ximo de despesas�, ou seja, um �teto�
    private float valorEmDivida;
    private float saldo;

    public Cliente(String nome, long contribuinte, byte idade, CodigoPostal cp, float plafond, float valorEmDivida, float saldo) {
        super(nome, contribuinte, idade, cp);
        this.plafond = plafond;
        this.valorEmDivida = valorEmDivida;
        this.saldo = saldo;
    }//ok

    public Cliente() {
    } //Construtor

    public float getPlafond() {
        return plafond;
    }//ok

    public void setPlafond(float plafond) {
        this.plafond = plafond;
    }//ok

    public float getValorEmDivida() {
        return valorEmDivida;
    }//ok

    public void setValorEmDivida(float valorEmDivida) {
        this.valorEmDivida = valorEmDivida;
    }//ok

    public float getSaldo() {
        obterSaldo();
        return saldo;
    }//ok

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }//ok

    public float obterSaldo() {

        return this.saldo = this.plafond - this.valorEmDivida;

    }//ok
    @Override
    public void mostra(){
        super.mostra();
        System.out.println("Cliente: " + this.getNome());
    }

}
