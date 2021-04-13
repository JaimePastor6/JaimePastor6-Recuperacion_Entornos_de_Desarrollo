import java.util.Scanner;
//Cambio hecho desde dirCasa
//Cambio hecho desde dirInsti
//Segundo cambio hecho desde dirCasa esta vez para crear conflictos
//Mismo cambio en las dos carpetas
public class Diferencia_horaria {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int [] momento1 = pedirHora();
        int [] momento2 = pedirHora();

        int s1 = convertirASegundos(momento1);
        int s2 = convertirASegundos(momento2);

        int diferencia = calcularDiferencia(s1, s2);

        String difString = convertirSegundosEnString(diferencia);

        mostrarDiferencia(difString);
    }

    public static int[] pedirHora() {
        System.out.println("Introduce la hora en formato \"HH:MM:SS\"");

        String hhmmss = sc.next();
        String hh = hhmmss.substring(0,2);
        String mm = hhmmss.substring(3,5);
        String ss = hhmmss.substring(6,8);

        int h = Integer.parseInt(hh);
        int m = Integer.parseInt(mm);
        int s = Integer.parseInt(ss);

        int[] hms = {h, m, s};
        return hms;
    }

    public static int convertirASegundos(int[] array) {
        int hSegundos = array[0] * 3600;
        int mSegundos = array[1] * 60;
        int segundos = hSegundos + mSegundos + array[2];
        return segundos;
    }

    public static int calcularDiferencia(int momentoInicial, int momentoFinal) {
        return momentoFinal - momentoInicial;
    }

    public static String convertirSegundosEnString(int segundos) {
        int difHoras = segundos / 3600;
        int resto = segundos % 3600;
        int difMinutos = resto / 60;
        int difSegundos = resto % 60;

        String hh, mm, ss;
        if (difHoras < 10) {
            hh = "0" + Integer.toString(difHoras);
        } else {
            hh = Integer.toString(difHoras);
        }

        if (difMinutos < 10) {
            mm = "0" + Integer.toString(difMinutos);
        } else {
            mm = Integer.toString(difMinutos);
        }

        if (difSegundos < 10) {
            ss = "0" + Integer.toString(difSegundos);
        } else {
            ss = Integer.toString(difSegundos);
        }
        return hh + ":" + mm + ":" + ss;
    }

    public static void mostrarDiferencia(String cadena) {
        System.out.println(cadena);
    }
}
