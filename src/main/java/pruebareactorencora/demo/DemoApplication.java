package pruebareactorencora.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

/*

POST /notifications
Request
{
userId: <string>,
message: <string>,
{
Response
{
id: <string>,
userId: <string>,
message: <string>,
timestamp: <datetime>
}





PUT https://d0c79438-6cd6-488d-9b2c-66d9d742a0e9.mock.pstmn.io/notifications/mock
Request
{
userId: <string>,
message: <string>
}



Response
{
    id: <string>,
    message: <string>
}



 */