package es.fplumara.dam1.pruebaBot.service.files;

public interface FileService {
    void appendLog(long channelId, String entry);
    String readAll(long channelId);
    String readLast(long channelId, int n);
}
