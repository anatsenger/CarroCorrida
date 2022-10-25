public class Piloto {
    public static void main(String[] args) {
        Piloto Jackson = new Piloto("Jackson", 24, Sexo.Masculino, "Skol");
        CarroCorrida marea = new CarroCorrida(001, Jackson, 200, 0, true);
        System.out.println(Jackson);
        System.out.println(marea);
        marea.acelera(20.0f, marea);
        marea.freia(5.0f, marea);
        marea.parar(marea);
        marea.desligar(marea, marea.getLigado(), marea.getVelocidadeAtual());
        marea.ligar(marea, marea.getLigado());
    }
    private String piloto;
    private Integer idade;
    private Sexo sexo;
    private String equipe;

    public Piloto(String piloto, Integer idade, Sexo sexo, String equipe){
        this.piloto = piloto;
        this.idade = idade;
        this.sexo = sexo;
        this.equipe = equipe;
    }
    public String getPiloto(){return piloto;}
    public void setPiloto(String piloto){this.piloto = piloto;}

    public Integer getIdade(){return idade;}
    public void setIdade(Integer idade){ this.idade = idade;}

    public Sexo getSexo(){return sexo;}
    public void setSexo(Sexo sexo){this.sexo = sexo;}

    public String getEquipe(){return equipe;}
    public void setEquipe(String equipe){this.equipe = equipe;}

    @Override
    public String toString() {
        return  "Piloto = " + piloto + '\'' +
                ", idade = " + idade +
                ", sexo = " + sexo +
                ", equipe = " + equipe + '\'' +
                '}';
    }
}
