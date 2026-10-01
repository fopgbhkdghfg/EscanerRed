package controlador;

import java.util.ArrayList;
import java.util.List;

public class controladorClase {

    public static boolean validarIP(String ip) {
        String[] partes = ip.split("\\.");
        if (partes.length != 4) return false;
        try {
            for (String parte : partes) {
                int valor = Integer.parseInt(parte);
                if (valor < 0 || valor > 255) return false;
            }
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static List<String> generarRangoIPs(String ipInicio, String ipFin) {
        List<String> ips = new ArrayList<>();
        long inicio = ipToLong(ipInicio);
        long fin = ipToLong(ipFin);

        if (inicio > fin) {
            long temp = inicio;
            inicio = fin;
            fin = temp;
        }

        for (long i = inicio; i <= fin; i++) {
            ips.add(longToIp(i));
        }
        return ips;
    }

    private static long ipToLong(String ip) {
        String[] partes = ip.split("\\.");
        long resultado = 0;
        for (int i = 0; i < 4; i++) {
            resultado = (resultado << 8) + Integer.parseInt(partes[i]);
        }
        return resultado;
    }

    private static String longToIp(long ip) {
        return ((ip >> 24) & 0xFF) + "." +
               ((ip >> 16) & 0xFF) + "." +
               ((ip >> 8) & 0xFF) + "." +
               (ip & 0xFF);
    }
}