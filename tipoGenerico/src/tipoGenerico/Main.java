package tipoGenerico;

public class Main {
    public static void main(String[] args) {
        Vettore<Infisso> infissoVettore=new Vettore<>(10);
        Vettore<Mobile> mobileVettore=new Vettore<>(10);
        //aggiunta
        try {
            infissoVettore.add(new Infisso());
            mobileVettore.add(new Mobile(100.0,100.0));
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        //stampa
        try {
            System.out.println("Infissi: \n"+infissoVettore.visualizza());
            System.out.println("Mobile: \n"+mobileVettore.visualizza());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        //ricerca

        Infisso temp=new Infisso("Legno",40,50);
        Mobile temp2=new Mobile(100.0,10.0);
        try {
            if (infissoVettore.ricerca(temp)==-1){
                System.out.println("Elemento non trovato");
            }else{
                System.out.println(infissoVettore.getElemento(infissoVettore.ricerca(temp)));
            }

            if(mobileVettore.ricerca(temp2)==-1){
                System.out.println("Elemento non trovato");
            }else{
                System.out.println(mobileVettore.getElemento(mobileVettore.ricerca(temp2)));
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }
}