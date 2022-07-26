package pl.kurs.zadanie1;

public class ReadFile {
    private String fileName;
    private long fileSize;

    public ReadFile(String fileName, long fileSize) {
        this.fileName = fileName;
        this.fileSize = fileSize;
    }
    public long getFileSize() {
        return fileSize;
    }
    @Override
    public String toString() {
        return "ReadFile{" +
                "fileName='" + fileName + '\'' +
                ", fileSize=" + fileSize +
                '}';
    }
}
