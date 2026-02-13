package es.fplumara.dam1.pruebaBot.bot;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class BotListener extends ListenerAdapter {
    @Override
    public void onMessageReceived(MessageReceivedEvent event){
        // Ignorar mensajes de otros bots
        if (event.getAuthor().isBot()) return;

        String mensaje = event.getMessage().getContentRaw();
        String usuario = event.getAuthor().getName();


//        System.out.println(event.getChannel().getName()+" - " +usuario + ": " + mensaje);
//        switch(event.getName()) {
//            case "ping":
//                event.reply("pong!").queue();
//
//            case "hora" :
//                String zoneId = event.getOption("zone").getAsString();
//                Date date = new Date();
//                DateFormat df = new SimpleDateFormat("HH:mm:ss");
//                df.setTimeZone(TimeZone.getTimeZone(zoneId));
//                String horaFormateada = df.format(date);
//                event.reply(horaFormateada).queue();
//
//        }
    }
}
