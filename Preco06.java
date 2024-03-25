public class Preco06 {
    
    double precoTotal;
    double pct;

    public Preco06(double precoTotal , double pct) {
     
        this.precoTotal = precoTotal;
        this.pct = pct;
       
    }



    public double calcularPrecoFinal() {
        return  (( pct/ 100) * precoTotal) + precoTotal;
    }





 

}

