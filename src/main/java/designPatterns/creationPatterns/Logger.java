package designPatterns.creationPatterns;

/**
 * Created by Marcin Beda.
 */

public class Logger {

    private static Logger instance;

    private Logger() {
    }

    public static Logger getInstance() {
        return SingletonHolder.INSTANCE; // By Bill Pugh
    }

    public void logToConsole() {
        //
    }

    private static class SingletonHolder {
        private static final Logger INSTANCE = new Logger();
    }
}
