import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.ZoneOffset;
import java.util.Set;

public class TimeZones {
    public static void main(String[] args) {
        // Lấy tất cả các ID của múi giờ
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();

        // Định dạng giờ phút ngày tháng
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        System.out.println("Time Zones in the World:");
        System.out.println("------------------------------------------------------------");

        zoneIds.stream().sorted().forEach(zone -> {
            ZonedDateTime time = ZonedDateTime.now(ZoneId.of(zone));
            ZoneOffset offset = time.getOffset();

            String offsetStr = offset.getId().replaceAll("Z", "+00:00");
            String timeStr = time.format(formatter);

            System.out.printf("%-35s %-10s %s%n", zone, offsetStr, timeStr);
        });
    }
}
