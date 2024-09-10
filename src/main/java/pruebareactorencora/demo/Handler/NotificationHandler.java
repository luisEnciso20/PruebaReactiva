package pruebareactorencora.demo.Handler;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import pruebareactorencora.demo.business.NotificationService;
import pruebareactorencora.demo.expose.RequestNotification;
import pruebareactorencora.demo.model.Notification;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
@Slf4j
public class NotificationHandler {

    private final NotificationService notificationService;

    public Mono<ServerResponse> notification(ServerRequest req) {
        Mono<RequestNotification> requestNotification = req.bodyToMono(RequestNotification.class);
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(requestNotification.map(notificationService::sendNotification),Notification.class);
    }

}
