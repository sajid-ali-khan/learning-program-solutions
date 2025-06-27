import interfaces.ExternalApi;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class MyServiceTest {

    @Test
    void fetchData() {
        ExternalApi externalApi = Mockito.mock(ExternalApi.class);
        when(externalApi.getData()).thenReturn("Mock Data");
        MyService myService = new MyService(externalApi);

        String result = myService.fetchData();

        assertEquals("Mock Data", result);
    }
}