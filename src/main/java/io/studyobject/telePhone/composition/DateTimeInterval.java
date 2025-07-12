package io.studyobject.telePhone.composition;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Getter
public class DateTimeInterval {
    private LocalDateTime from;
    private LocalDateTime to;

    public DateTimeInterval(LocalDateTime from, LocalDateTime to) {
        this.from = from;
        this.to = to;
    }

    public static DateTimeInterval of(LocalDateTime from, LocalDateTime to) {
        return new DateTimeInterval(from, to);
    }

    public static DateTimeInterval fromMidNight(LocalDateTime to) {
        return new DateTimeInterval(
                LocalDateTime.of(to.toLocalDate(), LocalTime.of(0, 0)),
                to);
    }

    public Duration duration() {
        return Duration.between(from, to);
    }
}
