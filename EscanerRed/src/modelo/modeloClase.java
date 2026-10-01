package modelo;

public class modeloClase {
    private String ip;
    private String nombreHost;
    private boolean conectado;
    private long tiempoRespuestaMs;

    public modeloClase(String ip, String nombreHost, boolean conectado, long tiempoRespuestaMs) {
        this.ip = ip;
        this.nombreHost = nombreHost;
        this.conectado = conectado;
        this.tiempoRespuestaMs = tiempoRespuestaMs;
    }

    public String getIp() {
        return ip;
    }

    public String getNombreHost() {
        return nombreHost;
    }

    public boolean isConectado() {
        return conectado;
    }

    public long getTiempoRespuestaMs() {
        return tiempoRespuestaMs;
    }
}