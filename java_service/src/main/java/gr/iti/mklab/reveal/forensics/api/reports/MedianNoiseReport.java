package gr.iti.mklab.reveal.forensics.api.reports;

import org.mongodb.morphia.annotations.Embedded;

/**
 * Created by marzampoglou on 11/19/15.
 */
@Embedded
public class MedianNoiseReport {
    public Boolean completed=false;
    public String map;
    public double maxvalue;
    public double minValue;
}
