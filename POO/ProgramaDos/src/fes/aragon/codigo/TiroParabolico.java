package fes.aragon.codigo;

public class TiroParabolico {

    private float velocidadInicial;
    private int grado;
    private final float gravedad = 9.81f;

    public TiroParabolico() {
    }

    public TiroParabolico(float velocidadInicial, int grado) {
        this.velocidadInicial = velocidadInicial;
        this.grado = grado;
    }

    public float alturaMaxima() {
        float voy = (float) (this.velocidadInicial * (Math.sin(Math.toRadians(grado))));
        float tiempo = voy / this.gravedad;
        float y = (float) (voy * tiempo - ((this.gravedad / 2) * (Math.pow(tiempo, 2))));
        return y;
    }

    public float alcance() {
        float vox = (float) (this.velocidadInicial * (Math.cos(Math.toRadians(grado))));
        float voy = (float) (this.velocidadInicial * (Math.sin(Math.toRadians(grado))));
        float tiempo = voy / this.gravedad;
        float x = (vox * (2 * tiempo));
        return x;
    }

    public Componentes[] calculoDeComponentes(float t) {
        int elementos =(int) (t / 0.09);
        Componentes[] valores = new Componentes[elementos + 1 ];
        int indice = 0;
        float x = 0.0f;
        float y = 0.0f;
        for (float i = 0; i <= t; i += 0.09) {
            x = (float) (velocidadInicial * Math.cos(Math.toRadians(grado)) * i);
            y = (float) ((velocidadInicial * Math.sin(Math.toRadians(grado))) * i) + (float) ((0.5 * -gravedad * Math.pow(i, 2)));

            Componentes obj = new Componentes(i, x, y);
            valores[indice] = obj;
            indice++;
        }
         return valores;       
    }

public float getVelocidadInicial() {
        return velocidadInicial;
    }

    public void setVelocidadInicial(float velocidadInicial) {
        this.velocidadInicial = velocidadInicial;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }
        
}
