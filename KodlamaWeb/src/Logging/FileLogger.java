package Logging;

public class FileLogger implements Ilogger{
    @Override
public void log(String data) {
    System.out.println("Dosya'ya loglandi: "+data);
}
}
