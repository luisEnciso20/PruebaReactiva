package pruebareactorencora.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
public class Notification {

    private int id;
    private int userId;
    private String message;
    private LocalDateTime timestamp;

}
