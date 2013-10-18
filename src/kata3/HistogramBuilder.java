package kata3;

import java.util.Collection;

public class HistogramBuilder<T> {
    Histogram<T> histogram;

    public HistogramBuilder() {
        this.histogram = new Histogram();   
    }
    
    public Histogram<T> getHistogram() {
        return histogram;
    }
            
    private int getCount(T item){
        if (histogram.containsKey(item))
            return histogram.get(item);
        
        return 0;
    }
    
    public void calculate(T[] data){
        for (T item : data)
            histogram.put(item, getCount(item) + 1);
    }       
    
    public void calculate(Collection<T> data){
        for (T item : data)
            histogram.put(item, getCount(item) + 1);
    }
}
