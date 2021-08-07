package school.lesson4.task6_7;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;

@Getter
@Setter
@AllArgsConstructor
public class Park {
    private String address;
    private Attraction [] attractions;

    @Setter
    @Getter
    @AllArgsConstructor
    public static class Attraction {
        private String name;
        private LocalTime startTime;
        private LocalTime endTime;
        private double price;
    }
}
