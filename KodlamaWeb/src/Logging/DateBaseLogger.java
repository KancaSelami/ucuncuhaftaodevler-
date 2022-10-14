package Logging;

public class DateBaseLogger implements Ilogger{
    @Override
    public void log(String data) {
        System.out.println("DataBase'e loglandi: "+data);
    }
}
