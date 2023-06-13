import org.futbol.model.*;

public class Main {
    public static void main(String[] args) {
        Competencia competencia = new Competencia("Liga Pro");
        System.out.println(competencia);
        Jugador jugador = new Jugador("Lionel","Messi");
        Jugador jugador2 = new Jugador("Cristiano","Ronaldo");
        System.out.println(jugador);
        Equipo equipo = new Equipo("Barcelona");
        System.out.println(equipo);
        Equipo equipo2 = new Equipo("Real Madrid");
        Modalidad modalidad = new Modalidad("Liga");
        System.out.println(modalidad);
        Temporada temporada = new Temporada(competencia, "2023");
        System.out.println(temporada);
        Asignacion asignacion = new Asignacion(modalidad, temporada);
        modalidad.getAsignacionList().add(asignacion);
        temporada.getAsignacionList().add(asignacion);
        System.out.println(temporada);
        EquipoInscrito equipoInscrito = new EquipoInscrito(equipo, temporada);
        temporada.getEquipoInscritoList().add(equipoInscrito);
        equipo.getEquipoInscritoList().add(equipoInscrito);
        EquipoInscrito equipoInscrito2 = new EquipoInscrito(equipo2, temporada);
        temporada.getEquipoInscritoList().add(equipoInscrito2);
        equipo2.getEquipoInscritoList().add(equipoInscrito2);
        System.out.println(temporada.getEquipoInscritoList());
        equipoInscrito.inscribirJugador(jugador);
        equipoInscrito2.inscribirJugador(jugador2);
        equipoInscrito2.inscribirJugador(jugador);
        asignacion.generarFechas();
        System.out.println(asignacion.getFechaList());

    }
}