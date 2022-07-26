package pl.kurs.zadanie2;

import pl.kurs.zadanie1.ReadFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileGetter {
    private List<Path> collect;
    private BasicFileAttributes attr;
    public List<FileDate> getFiles(String directoryName) throws IOException {
        Path directory = Paths.get(directoryName);
        String fileExtension = ".java";
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Calendar c = Calendar.getInstance();
        try (Stream<Path> walk = Files.walk(directory)) {
            collect = walk
                    .filter(Files::isRegularFile)
                    .filter(p -> p.getFileName().toString().endsWith(fileExtension))
                    .collect(Collectors.toList());
        }

        List<FileDate> fileDates = new ArrayList<>();
        List<String> paths = new ArrayList<>();
        DateFormat formatter = new SimpleDateFormat("EEEE");
        for (int i = 0; i < collect.size(); i++) {

            paths.add(collect.get(i).toString());

            attr = Files.readAttributes(collect.get(i), BasicFileAttributes.class);

            c.setTime(new Date(attr.creationTime().toMillis()));

            String dayOfWeekString = formatter.format(c.getTime());

            fileDates.add(new FileDate(collect.get(i).getFileName().toString(), dayOfWeekString));
        }
        return fileDates;
    }
}
