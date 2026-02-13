package es.fplumara.dam1.pruebaBot.bot.commands;

import es.fplumara.dam1.pruebaBot.config.AppConfig;

public class LogOffCommand {
    public void LogOff(){
        AppConfig.getInstance().setLogsEnabled(false);
        AppConfig.getInstance().save();
    }
}
