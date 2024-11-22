public class Carro {

    private String modelo;
    private int ano;
    private String cor;

    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public  int getAno(){
        return ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public String getCor(){
        return cor;
    }

    public void setCor (String cor){
        this.cor = cor;
    }

    public void ligar() {
        System.out.println("O carro" + modelo + "está ligado");
    }
    public void desligar() {
        System.out.println("O carro" + modelo + "está desligado");
    }
}
