package ra.edu.session1.model;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class SystemConfig {
    @Value("ThaoMinh")
    private String branchName;

    @Value("8:00 - 23:00")
    private String openingHour;

    public void displayInfo() {
        System.out.println("Tên cửa hàng: " + branchName);
        System.out.println("Giờ mở cửa: " + openingHour);
    }
}
