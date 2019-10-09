/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testepkg;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
/**
 *
 * @author Miguel S
 */
public class WorldTime{

    String getTimeByCountry(String zoneID){
        final DateTimeZone fromTimeZone = DateTimeZone.forID(zoneID);
        final DateTime dateTime = new DateTime(fromTimeZone);

        final org.joda.time.format.DateTimeFormatter outputFormatter
            = DateTimeFormat.forPattern("HH:mm");
        return outputFormatter.print(dateTime);
    }
}
