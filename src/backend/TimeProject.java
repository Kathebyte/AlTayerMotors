
package backend;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TimeProject {
    
    public Calendar date = new GregorianCalendar();
    
    public String year = Integer.toString(date.get(Calendar.YEAR));
    public String month = Integer.toString(date.get(Calendar.MONTH));
    public String day = Integer.toString(date.get(Calendar.DATE));
    
    public String completeDate = year+"-"+month+"-"+day;
    
    public String time= Integer.toString(date.get(Calendar.HOUR_OF_DAY));
    public String minute= Integer.toString(date.get(Calendar.MINUTE));
    
    public String completeTime= time+":"+minute;
    
}
