package dk.aau.sesame.olap;

import org.openrdf.query.algebra.evaluation.function.datetime.Year;


/**
 * Created by alex on 4/14/14.
 */
public class YearFunc extends Year
{
    public static final String NAMESPACE = "http://example.org/customfunction/";
    public String getURI()
    {
        return NAMESPACE + "year";
    }

}
