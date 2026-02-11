package es.fplumara.dam1.pruebaBot.service.files;

public interface FileService {
    void appendLog(long channelId, String entry);
    void readAll(long channelId);
    void readLast(long channelId, int n);
}
