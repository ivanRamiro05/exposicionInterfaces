public class MiClaseHuevosFritos implements HuevosFritos {
    private int cantidadHuevos;

    public void huevos(int cantidad) {
        this.cantidadHuevos = cantidad;
    }

    public int getCantidadhuevos() {
        return cantidadHuevos;
    }

    public void setCantidadhuevos(int cantidadhuevos) {
        this.cantidadHuevos = cantidadhuevos;
    }
}
