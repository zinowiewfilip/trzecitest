package pl.kurs.zadanie2;

import java.io.IOException;

public class Runner {
    public static void main(String[] args) throws IOException {
        String directory = "/Users/alber/IdeaProjects";
        FileGetter fileGetter = new FileGetter();
        Printer printer = new Printer();
        printer.getFilesCreated(fileGetter.getFiles(directory));
        printer.printNumberOfFilesCreated();
    }
}
