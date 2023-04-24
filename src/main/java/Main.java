public class Main {
    public static void main(String[] args) {
        int port = 9999;
        int poolSize = 64;

        final var server = new Server(port, poolSize);
        server.serverStart();
    }
}