package es.fplumara.dam1.pruebaBot.model;

import java.time.LocalDateTime;

public record LogEntry(
        LocalDateTime timestamp,
        String author,
        String content,
        String channelId) {

}
