package tipoGenerico;

public class Infisso {
    private String materiale;
    private int altezza,larghezza;

    public Infisso(String materiale, int altezza, int larghezza) {
        this.materiale = materiale;
        setAltezza(altezza);
        setLarghezza(larghezza);
    }
    public Infisso(){
        this("Non inserito",0,0);
    }

    public String getMateriale() { return materiale; }
    public void setMateriale(String materiale) { this.materiale = materiale; }
    public int getAltezza() { return altezza; }
    public void setAltezza(int altezza) throws IllegalArgumentException{
        if (altezza<0)
            throw new IllegalArgumentException("Negativo");
        else
            this.altezza = altezza;
    }
    public int getLarghezza() { return larghezza; }
    public void setLarghezza(int larghezza) throws IllegalArgumentException{
        if (larghezza<0)
            throw new IllegalArgumentException("Negativo");
        else
            this.larghezza = larghezza;
    }

    @Override
    public String toString(){
        return "Materiale "+this.materiale+" H: "+altezza+" W: "+larghezza;
    }
    @Override
    public boolean equals(Object o){
        if(o instanceof Infisso){
            Infisso infisso=(Infisso) o;
            return materiale.equalsIgnoreCase(infisso.getMateriale());
        }
        return false;
    }
}
