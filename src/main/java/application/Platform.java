package application;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class Platform {
    private int id;
    private String platformName;
    private LocalTime nextFree;
    DateTimeFormatter formatter= DateTimeFormatter.ofPattern("HH:mm");
    public Platform(int id, String platformName) {
        this.id = id;
        this.platformName = platformName;
        this.nextFree = LocalTime.of(0, 0);

    }

    // Getters
    public int getId() {
        return id;
    }

    public String getPlatformName() {
        return platformName;
    }

    public LocalTime getNextFree() {
        return nextFree;
    }


    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public void setNextFree(LocalTime nextFree) {
        this.nextFree = nextFree;
    }
    public String toString() {
        return String.format("Platform{id=%d, name='%s', nextFree='%s'}",
                id, platformName, nextFree.format(formatter));
    }
}
