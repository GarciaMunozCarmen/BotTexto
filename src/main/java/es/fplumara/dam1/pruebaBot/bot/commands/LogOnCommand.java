package es.fplumara.dam1.pruebaBot.bot.commands;

import es.fplumara.dam1.pruebaBot.config.AppConfig;

public class LogOnCommand {
    public void LogOn(){
        AppConfig.getInstance().setLogsEnabled(true);
        AppConfig.getInstance().save();
    }
}
