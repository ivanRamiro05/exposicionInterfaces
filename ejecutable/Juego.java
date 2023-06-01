public class Juego {
    public static void main(String[] args) {
        Desayuno desayuno = new Desayuno();
        desayuno.huevos(2);
        desayuno.chocolate(1);
        desayuno.Pan(2);
        
        System.out.println("Desayuno: ");
        System.out.println(desayuno.getCantidadhuevos() + " huevos");
        System.out.println(desayuno.getCantidadchocolate() + " chocolates");
        System.out.println(desayuno.getCantidadpan() + " panes");
    }
}

