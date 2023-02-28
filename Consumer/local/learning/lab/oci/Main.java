package local.learning.lab.oci;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class Main
{
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}