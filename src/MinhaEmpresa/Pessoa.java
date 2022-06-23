package MinhaEmpresa;

public class Pessoa {

    protected String nome;
    protected long contribuinte;
    protected byte idade;
    protected CodigoPostal cp;

    public Pessoa() {//ok

    }

    public Pessoa(String nome, long contribuinte, byte idade, CodigoPostal cp) {

        this.nome = nome;
        this.contribuinte = contribuinte;
        this.idade = idade;
        this.cp = cp;
    }

    public String getNome() {//ok
        return nome;
    }

    public void setNome(String nome) {//ok
        this.nome = nome;
    }

    public long getContribuinte() { //ok
        return contribuinte;
    }

    public void setContribuinte(long contribuinte) { //ok
        this.contribuinte = contribuinte;
    }

    public byte getIdade() { //ok
        return idade;
    }

    public void setIdade(byte idade) { //ok
        this.idade = idade;
    }

    public void setCodigoPostal(CodigoPostal c) { // ok
        this.cp = c;
    }

    public CodigoPostal getCodigoPostal() { //ok
        return this.cp;
    }
    public void mostra(){
        System.out.println(this.getNome());
    }
            
    
}
