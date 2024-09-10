package pruebareactorencora.demo.business;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pruebareactorencora.demo.expose.RequestNotification;
import pruebareactorencora.demo.model.Notification;
import reactor.core.publisher.Mono;

@Service
@Slf4j
@RequiredArgsConstructor
public class NotificationService {


    public Mono<Notification> sendNotification(RequestNotification notification) {



        return Mono.empty();
    }

}
