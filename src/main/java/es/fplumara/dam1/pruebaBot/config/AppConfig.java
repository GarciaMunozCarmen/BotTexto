package es.fplumara.dam1.pruebaBot.config;

import es.fplumara.dam1.pruebaBot.model.LogMode;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;

public class AppConfig {

    private boolean logsEnabled;
    private LogMode logsMode;
    private String logsDir;
    private Integer logsMaxMessageLength;
    private static AppConfig instance;
    private static final Path PATH = Path.of("data/config.properties");
    private final Properties props = new Properties();

    // CONSTRUCTOR
    private AppConfig() {
        if(new File(PATH.toUri()).exists()) {
            load();
        }
    }

    //SINGELTON
    public static AppConfig getInstance(){
        if(instance == null){
            instance = new AppConfig();
        }
        return instance;
    }

    //METODOS
    public void load(){
        try {
            InputStream in = Files.newInputStream(PATH);
            props.load(in);

            logsEnabled = Boolean.parseBoolean(props.getProperty("logs.enabled", "true"));
            logsDir = props.getProperty("logs.dir", "data/logs");
            logsMode = LogMode.valueOf(props.getProperty("logs.mode", "TXT"));
            logsMaxMessageLength = Integer.parseInt(props.getProperty("logs.maxMessageLength", "500"));

        } catch (Exception e) {
            System.out.println("Error con el fichero de configuración");
        }
    }
    public void save(){
        props.setProperty("logs.enable", String.valueOf(logsEnabled));
        props.setProperty("logs.dir", logsDir);
        props.setProperty("logs.mode", String.valueOf(logsMode));
        props.setProperty("logs.maxMessageLenght", String.valueOf(logsMaxMessageLength));

        try{
            OutputStream out = Files.newOutputStream(PATH);
            props.store(out, "Actualizado por el bot");
        } catch (Exception e) {
            System.out.println("ERROR");
        }
    }

    //GETTERS Y SETTERS
    public boolean isLogsEnabled() {
        return logsEnabled;
    }

    public void setLogsEnabled(boolean logsEnabled) {
        this.logsEnabled = logsEnabled;
    }

    public LogMode getLogsMode() {
        return logsMode;
    }

    public void setLogsMode(LogMode logsMode) {
        this.logsMode = logsMode;
    }

    public String getLogsDir() {
        return logsDir;
    }

    public void setLogsDir(String logsDir) {
        this.logsDir = logsDir;
    }

    public Integer getLogsMaxMessageLength() {
        return logsMaxMessageLength;
    }

    public void setLogsMaxMessageLength(Integer logsMaxMessageLength) {
        this.logsMaxMessageLength = logsMaxMessageLength;
    }
}
