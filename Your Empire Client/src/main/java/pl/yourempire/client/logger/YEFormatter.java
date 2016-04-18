package pl.yourempire.client.logger;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class YEFormatter extends Formatter
{
    public static final String FORMAT = "%1$td %1$tb %1$tY | %1$tH:%1$tM:%1$tS [%4$s] [%3$s]: %5$s\n";
    private final Date dat = new Date();
    
    @Override
    public String format(LogRecord record)
    {
        dat.setTime(record.getMillis());
        String source;
        if (record.getSourceClassName() != null)
        {
            source = record.getSourceClassName();
            if (record.getSourceMethodName() != null)
            {
                source += " " + record.getSourceMethodName();
            }
        }
        else
        {
            source = record.getLoggerName();
        }
        String message = formatMessage(record);
        String throwable = "";
        if (record.getThrown() != null)
        {
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            pw.println();
            record.getThrown().printStackTrace(pw);
            pw.close();
            throwable = sw.toString();
        }
        return String.format(FORMAT, dat, source, record.getLoggerName(), record.getLevel().getName(), message,
                throwable);
    }
}
