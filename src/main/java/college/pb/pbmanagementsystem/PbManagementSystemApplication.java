package college.pb.pbmanagementsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PbManagementSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(PbManagementSystemApplication.class, args);
    }

}
