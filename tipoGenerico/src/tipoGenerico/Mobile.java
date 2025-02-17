package tipoGenerico;

public class Mobile {
    private double peso,prezzo;

    public Mobile(double peso, double prezzo) {
        setPeso(peso);
        setPrezzo(prezzo);
    }
    public Mobile(){
        this(0.0,0.0);
    }

    public double getPeso() { return peso;}
    public void setPeso(double peso) throws IllegalArgumentException{
        if (peso<0.0)
            throw new IllegalArgumentException("Negativo");
        else
            this.peso = peso;
    }
    public double getPrezzo() { return prezzo; }
    public void setPrezzo(double prezzo) throws IllegalArgumentException{
        if (prezzo<0.0)
            throw new IllegalArgumentException("Negativo");
        else
            this.prezzo = prezzo;
    }

    @Override
    public String toString(){
        return "Peso "+peso+" Prezzo: "+prezzo;
    }
    @Override
    public boolean equals(Object o){
        if(o instanceof Mobile){
            Mobile mobile=(Mobile) o;
            return peso== mobile.getPeso();
        }
        return false;
    }
}
