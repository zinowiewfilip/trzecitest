package pl.kurs.zadanie1;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) throws IOException {
        String directory = "/Users/alber/IdeaProjects";
        FileSizeChecker fileSizeChecker = new FileSizeChecker();
        System.out.println(fileSizeChecker.getBiggestFile(directory));
    }
}
