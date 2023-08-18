public class EjemploPoli {
    public static void main(String[] args) {

        Triangulo fig = new Triangulo();
        Circulo fig1 = new Circulo();
        Cuadro fig2 = new Cuadro();

        fig.dibujar();
        fig1.dibujar();
        fig2.dibujar();

        Figura[] figus = new Figura[3];
        figus[0] = new Triangulo();
        figus[1] = new Circulo();
        figus[2] = new Cuadro();

        for (Figura f : figus) {
            f.dibujar();
        }
    }
}