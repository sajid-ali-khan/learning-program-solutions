package repos;

// this is the implementation that our MyService will use actually
public class ExternalApi implements interfaces.ExternalApi {
    @Override
    public String getData() {
        return "Mock Data";
    }
}
