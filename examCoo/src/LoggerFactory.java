import java.io.IOException;

public abstract class LoggerFactory {

    public Logger fabricate() throws IOException{
        return create();
    }

    abstract Logger create() throws IOException;
}
