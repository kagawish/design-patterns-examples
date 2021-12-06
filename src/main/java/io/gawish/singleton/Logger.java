package io.gawish.singleton;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private static Logger logger = new Logger();

    private Logger() {}

    public static Logger getInstance() {
        return logger;
    }

    public void Log(String message) {
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.printf("[Log][%s] %s\n", formatter.format(date), message);
    }

    public void Debug(String message) {
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.printf("[Debug][%s] %s\n", formatter.format(date), message);
    }
}
