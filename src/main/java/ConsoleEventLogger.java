public class ConsoleEventLogger implements EventLogger {
    Event event;

    public ConsoleEventLogger(Event event) {
        this.event = event;
    }

    @Override
    public void logEvent(Event event){
        System.out.println(event);
    }
}
