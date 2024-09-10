package pruebareactorencora.demo.Router;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;
import pruebareactorencora.demo.Handler.NotificationHandler;
import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

@Configuration(proxyBeanMethods = false)
public class NotificationRouter {

    @Bean
    public RouterFunction<ServerResponse> route(NotificationHandler notificationHandler){

        return RouterFunctions
                .route(POST("/notification").and(accept(MediaType.APPLICATION_JSON)), notificationHandler::notification);
    }

}
