package competicion;

public class Test1 {
    public static void main(String[] args) {
        PartidoFutbolLigaEspanola partido = new PartidoFutbolLigaEspanola();
        System.out.println("Duracion del partido =" + PartidoFutbolLigaEspanola.DURACION_PARTIDO_FUTBOL);
        partido.setEquipoLocal("real madrid");
        partido.setEquipoVisitante("varcelona");
        partido.SetGolesEquipoLocal(3);
        partido.SetGolesEquipoVisitante(3);
        partido.imprimirMarcador();
    }
}
