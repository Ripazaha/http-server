public class Request {
    public String method;
    public String path;
    public Request(String method, String path) {
        this.method = method;
        this.path = path;
    }
    public String getMethod() {
        return method;
    }
    public String getPath() {
        return path;
    }
}