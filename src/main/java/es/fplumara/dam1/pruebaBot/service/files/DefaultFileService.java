package es.fplumara.dam1.pruebaBot.service.files;

import es.fplumara.dam1.pruebaBot.config.AppConfig;

public class DefaultFileService implements FileService{
    private final AppConfig appConfig = AppConfig.getInstance();


    @Override
    public void appendLog(long channelId, String entry) {

    }

    @Override
    public String readAll(long channelId) {
        return "";
    }

    @Override
    public String readLast(long channelId, int n) {
        return "";
    }
}
