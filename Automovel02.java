public class Automovel02 {
   
    double distancia;
    double combustivel;

    public Automovel02(double distancia , double combustivel) {
     
        this.combustivel = combustivel;
        this.distancia = distancia;
       
    }



    public double consumo() {
        return (distancia / combustivel) ;
    }





 

}