public class Desayuno implements Pan, Chocolate, HuevosFritos {
    private int cantidadPan;
    private int cantidadChocolate;
    private int cantidadHuevos;

    @Override
    public void huevos(int cantidad) {
        this.cantidadHuevos = cantidad;
    }

    @Override
    public int getCantidadhuevos() {
        return cantidadHuevos;
    }

    @Override
    public void setCantidadhuevos(int cantidadhuevos) {
        this.cantidadHuevos = cantidadhuevos;
    }

    @Override
    public void chocolate(int cantidad) {
        this.cantidadChocolate = cantidad;
    }

    @Override
    public int getCantidadchocolate() {
        return cantidadChocolate;
    }

    @Override
    public void setCantidadchocolate(int cantidadchocolate) {
        this.cantidadChocolate = cantidadchocolate;
    }

    @Override
    public void Pan(int cantidad) {
        this.cantidadPan = cantidad;
    }

    @Override
    public int getCantidadpan() {
        return cantidadPan;
    }

    @Override
    public void setCantidadpan(int cantidadpan) {
        this.cantidadPan = cantidadpan;
    }
}
