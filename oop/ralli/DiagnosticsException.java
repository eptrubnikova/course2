package ralli;

public class DiagnosticsException extends Exception {

    private TransportRalli transportRalli;

    public TransportRalli getTransportRalli() {
        return transportRalli;
    }

    public DiagnosticsException(String message, TransportRalli transportRalli) {
        super(message);
        this.transportRalli = transportRalli;
    }
}
