import interfaces.ExternalApi;

public class MyService {
    ExternalApi api;
    public MyService(ExternalApi externalApi){
        api = externalApi;
    }

    public String fetchData(){
        return api.getData();
    }
}
