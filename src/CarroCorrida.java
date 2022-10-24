public class CarroCorrida {

    private Integer numeroCarro;
    private float velocidadeMaxima;
    private float velocidadeAtual;
    private boolean ligado;
    private Piloto piloto;

    public CarroCorrida(Integer numeroCarro, Piloto piloto, float velocidadeMaxima, float velocidadeAtual, boolean ligado){
        this.numeroCarro = numeroCarro;
        this.piloto = piloto;
        this.velocidadeAtual = velocidadeAtual;
        this.velocidadeMaxima = velocidadeMaxima;
        this.ligado = ligado;
    }
    public Integer getNumeroCarro(){return numeroCarro;}
    public void setNumeroCarro(Integer numeroCarro){this.numeroCarro = numeroCarro;}

    public float getVelocidadeMaxima(){return velocidadeMaxima;}
    public void setVelocidadeMaxima(float velocidadeMaxima){this.velocidadeMaxima = velocidadeMaxima;}

    public float getVelocidadeAtual(){return velocidadeAtual;}
    public void setVelocidadeAtual(float velocidadeAtual){
        if(velocidadeAtual < velocidadeMaxima){
            this.velocidadeAtual = velocidadeAtual;
        }
    }

    public boolean getLigado(){return ligado;}

    public String ligadoStr(boolean ligado){
        if(ligado){
            return "ligado";
        } else {
            return "desligado";
        }
    }
    public void setLigado(boolean ligado){this.ligado = ligado;}

    public Piloto getPiloto(){return piloto;}
    public void setPiloto(Piloto piloto){this.piloto = piloto;}

    public static void acelera(float velocidade, CarroCorrida carro){
        if(carro.ligado){
            carro.setVelocidadeAtual(carro.getVelocidadeAtual() + velocidade);
        }
    }

    public static void freia(float velocidade, CarroCorrida carro){
        if(carro.ligado){
            carro.setVelocidadeAtual(carro.getVelocidadeAtual() - velocidade);
        }
    }

    public static void parar(CarroCorrida carro){
            carro.setVelocidadeAtual(0);
    }

    public static void ligar(CarroCorrida carro, boolean ligado){
        carro.setLigado(true);
    }

    public static void desligar(CarroCorrida carro, boolean ligado, float velocidadeAtual){
        if(velocidadeAtual == 0){
            carro.setLigado(false);
        }
    }

    @Override
    public String toString() {
        return  "Carro do " + piloto.getPiloto() +
                ": numero do carro = " + numeroCarro +
                ", velocidade maxima = " + velocidadeMaxima +
                ", velocidade Atual = " + velocidadeAtual +
                ", ligado = " + ligadoStr(ligado);
    }
}
