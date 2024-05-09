
/*Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
        Formatta la data ottenuta in FULL, MEDIUM e SHORT
        Stampa le varie versioni*/


import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;


public class Main {
    public static void main(String[] args) {
        OffsetDateTime date = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String dataFull = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        String dataMid = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        String dataShort = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println(dataFull);
        System.out.println(dataMid);
        System.out.println(dataShort);

// esercizio svolto con Andrea Vecchione


    }
}
