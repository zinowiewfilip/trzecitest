package pl.kurs.zadanie1;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileSizeChecker {
    public ReadFile getBiggestFile(String directoryName) throws IOException {

        Path directory = Paths.get(directoryName);
        String fileExtension = ".java";
        List<Path> collect;
        try (Stream<Path> walk = Files.walk(directory)) {
            collect = walk
                    .filter(Files::isRegularFile)
                    .filter(p -> p.getFileName().toString().endsWith(fileExtension))
                    .collect(Collectors.toList());

        }


        List<ReadFile> readFiles = new ArrayList<>();
        List<String> paths = new ArrayList<>();
        for (int i = 0; i < collect.size(); i++) {
            paths.add(collect.get(i).toString());
            readFiles.add(new ReadFile(collect.get(i).getFileName().toString(), paths.get(i).length()));
        }
        readFiles.sort(new Comparator<ReadFile>() {
            @Override
            public int compare(ReadFile o1, ReadFile o2) {
                return Long.compare(o1.getFileSize(), o2.getFileSize());
            }
        });
        return readFiles.get(readFiles.size()-1);
    }

}

