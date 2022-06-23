package MinhaEmpresa;

public class CodigoPostal {

    private int indicativo;
    private int extensao;
    private String zona;

    public CodigoPostal(int indicativo, int extensao) {
        this.indicativo = indicativo;
        this.extensao = extensao;
    }//ok

    public CodigoPostal() {
    }

    public int getIndicativo() {
        return indicativo;
    }

    public void setIndicativo(int indicativo) {
        this.indicativo = indicativo;
    }

    public int getExtensao() {
        return extensao;
    }

    public void setExtensao(int extensao) {
        this.extensao = extensao;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public void MostrarCp() {

        switch (getIndicativo() / 10000) {
            case 0 ->
                this.setZona("|Grande SP|");
            case 1 ->
                this.setZona("|Interior e Litoral de SP|");
            case 2 ->
                this.setZona("|RJ|ES|");
            case 3 ->
                this.setZona("|MG|");
            case 4 ->
                this.setZona("|BH|SE|");
            case 5 ->
                this.setZona("|PE|AL|PB|RN|");
            case 6 ->
                this.setZona("|CE|PI|MA|PA|AP|AM|RR|AC|");
            case 7 ->
                this.setZona("|DF|GO|RO|TO|MT|MS|");
            case 8 ->
                this.setZona("|PR|SC|");
            default ->
                this.setZona("RS");

        }//ok
        System.out.println(getIndicativo() + "-" + getExtensao() + " " + getZona());
    }
}
