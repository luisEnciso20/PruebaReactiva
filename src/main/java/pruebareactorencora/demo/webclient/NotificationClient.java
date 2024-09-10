package pruebareactorencora.demo.webclient;

import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
import pruebareactorencora.demo.model.MessageNotification;
import reactor.core.publisher.Mono;

public class NotificationClient {

    private final WebClient webClient;

    public NotificationClient(WebClient.Builder builder) {
        this.webClient = builder.baseUrl("https://d0c79438-6cd6-488d-9b2c-66d9d742a0e9.mock.pstmn.io/").build();
    }

    public Mono<MessageNotification> getNotificationMock() {

        return this.webClient.get().uri("notifications/mock").accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(MessageNotification.class);
    }



}
