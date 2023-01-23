public class LoggerConsoleFactory extends LoggerFactory{
    private static LoggerConsoleFactory instance;

    public static LoggerConsoleFactory getInstance(){
        if(instance == null){
            instance = new LoggerConsoleFactory();
        }
        return instance;
    }
    private LoggerConsoleFactory() {
    }

    @Override
    Logger create() {
        return new LoggerConsole();
    }
}
