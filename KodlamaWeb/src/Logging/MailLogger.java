package Logging;

public class MailLogger implements Ilogger{

    @Override
    public void log(String data) {
        System.out.println("mesaj gönderildi."+data);
    }
}
