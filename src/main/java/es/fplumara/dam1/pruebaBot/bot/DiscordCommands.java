package es.fplumara.dam1.pruebaBot.bot;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DiscordCommands {

    public void onMessageReceived(MessageReceivedEvent event){

    }
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
//    }
}
