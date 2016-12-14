import java.util.List;

/**
 * user
 * 14.12.2016
 */
public class CacheFileEventLogger extends FileEventLoger{
    int cacheSize;
    List<Event> cache;

    @Override
    public void logEvent(Event event) {
        //super.logEvent(event);
        cache.add(event);
        if(cache.size()==cacheSize){
            writeEventsFromCache();
            cache.clear();
        }
    }

    private void writeEventsFromCache() {

    }

    public void destroy(){
        if(!cache.isEmpty()){
            writeEventsFromCache();

        }
    }
}
