package controlador;

import modelo.modeloClase;
import java.net.InetAddress;

public class controladorEscaner {
    private int timeout;

    public controladorEscaner(int timeout) {
        this.timeout = timeout;
    }

    public modeloClase escanearIP(String ip) {
        long inicio = System.currentTimeMillis();
        boolean alcanzable = false;
        String nombreHost = "Desconocido";

        try {
            InetAddress address = InetAddress.getByName(ip);
            alcanzable = address.isReachable(timeout);
            if (alcanzable) {
                nombreHost = address.getCanonicalHostName();
            }
        } catch (Exception e) {
            alcanzable = false;
        }

        long tiempoRespuesta = System.currentTimeMillis() - inicio;
        return new modeloClase(ip, nombreHost, alcanzable, tiempoRespuesta);
    }
}