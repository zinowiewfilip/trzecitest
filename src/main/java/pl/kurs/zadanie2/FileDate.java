package pl.kurs.zadanie2;

import java.nio.file.attribute.FileTime;
import java.util.Date;

public class FileDate {
    private String fileName;
    private String fileTime;

    public FileDate(String fileName, String fileTime) {
        this.fileName = fileName;
        this.fileTime = fileTime;
    }

    public String getFileTime() {
        return fileTime;
    }

    @Override
    public String toString() {
        return "FileDate{" +
                "fileName='" + fileName + '\'' +
                ", date=" + fileTime +
                '}';
    }
}
