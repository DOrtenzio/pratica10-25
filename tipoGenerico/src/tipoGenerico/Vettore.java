package tipoGenerico;

public class Vettore<T> {
    private T[] vettore;
    private int elementiInseriti;

    public Vettore(int dimensione){
        this.elementiInseriti=0;
        this.vettore=(T[]) new Object[dimensione];
    }

    public void add(T obj) throws ArrayIndexOutOfBoundsException,Exception{
        try {
            this.vettore[this.elementiInseriti++]=obj;
        }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            throw new ArrayIndexOutOfBoundsException("Array pieno");
        } catch (Exception exception){
            throw new Exception("Tipo errato");
        }
    }

    public String visualizza() throws Exception{
        String s="Elementi dell'array: \n";
        if (elementiInseriti==0)
            throw new Exception("Array vuoto");
        else{
            for (int i=0;i<this.elementiInseriti;i++){
                s=s+vettore[i].toString();
            }
        }
        return s;
    }

    public int ricerca(T temp)throws RuntimeException{
        try {
            for (int i=0;i<this.elementiInseriti;i++){
                if (vettore[i].equals(temp))
                    return i;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return 0;
    }
}
