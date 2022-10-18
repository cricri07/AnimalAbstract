public abstract class Anmal {
    protected String nombre;

    public Anmal(String nombre){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void comer(){
        System.out.println("esta comiendo");
    }

    public void caminar(){
        System.out.println("esta caminando");
    }

    public abstract void sonido();

    public void salatar(){ System.out.println("esta salta");}

    public void morder() {
    }
}
