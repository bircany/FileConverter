import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileConverterAPI {

    public static void main(String[] args) {
        String userDesktopPath = System.getProperty("user.home") + "/Desktop";
        System.out.println("Dizin yolu: " + userDesktopPath);
        FileConverterAPI fileConverter = new FileConverterAPI();
        fileConverter.convertFiles(userDesktopPath);
    }

    public void convertFiles(String directoryPath) {
        File directory = new File(directoryPath);

        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("Geçersiz dizin yolu: " + directoryPath);
            return;
        }

        File[] files = directory.listFiles();
        if (files == null || files.length == 0) {
            System.out.println("Dizinde dosya bulunamadı.");
            return;
        }

        for (File file : files) {
            if (file.isFile()) {
                moveFileToExtensionFolder(file, directoryPath);
            }
        }
    }

    public void moveFileToExtensionFolder(File file, String directoryPath) {
        String fileExtension = getFileExtension(file);
        if (!fileExtension.isEmpty()) {
            String targetDirName = getTargetDirectory(fileExtension);
            ensureDirectoryExists(directoryPath + "/" + targetDirName);
            moveFile(file, directoryPath, targetDirName);
        }
    }

    public String getFileExtension(File file) {
        String fileName = file.getName();
        int lastIndexOfDot = fileName.lastIndexOf('.');
        if (lastIndexOfDot > 0 && lastIndexOfDot < fileName.length() - 1) {
            return fileName.substring(lastIndexOfDot + 1).toLowerCase();
        }
        return "";
    }

    public String getTargetDirectory(String fileExtension) {
        switch (fileExtension) {
            case "jpg":
            case "jpeg":
            case "png":
            case "gif":
                return "Images";
            case "pdf":
            case "doc":
            case "docx":
            case "txt":
                return "Documents";
            default:
                return "Others";
        }
    }

    public void ensureDirectoryExists(String directoryPath) {
        File directory = new File(directoryPath);
        if (!directory.exists()) {
            directory.mkdirs();
        }
    }

    public void moveFile(File file, String directoryPath, String targetDirName) {
        try {
            Path targetPath = Paths.get(directoryPath, targetDirName, file.getName());
            Files.move(file.toPath(), targetPath);
            System.out.println(file.getName() + " dosyası " + targetDirName + " klasörüne taşındı.");
        } catch (IOException e) {
            System.out.println(file.getName() + " dosyası taşınırken hata oluştu: " + e.getMessage());
        }
    }
}
