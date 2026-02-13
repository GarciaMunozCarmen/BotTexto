package es.fplumara.dam1.pruebaBot.bot;

import es.fplumara.dam1.pruebaBot.config.AppConfig;
import es.fplumara.dam1.pruebaBot.model.LogEntry;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.time.LocalDateTime;

public class BotListener extends ListenerAdapter {
    @Override
    public void onMessageReceived(MessageReceivedEvent event){
        // Ignorar mensajes de otros bots
        if (event.getAuthor().isBot()) return;

        String mensaje = event.getMessage().getContentRaw();
        String usuario = event.getAuthor().getName();
        String channelId = event.getChannel().getId();

        if(mensaje.startsWith("!")){
            //REGISTRAR COMANDO
        } else if (AppConfig.getInstance().isLogsEnabled()) {
            LogEntry logEntry = new LogEntry(LocalDateTime.now(), usuario, mensaje, channelId);
        }

//        System.out.println(event.getChannel().getName()+" - " +usuario + ": " + mensaje);
    }
}
