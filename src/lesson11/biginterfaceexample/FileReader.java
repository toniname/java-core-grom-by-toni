package lesson11.biginterfaceexample;

public class FileReader implements Readable {

    @Override
    public void readFilesFromStorage(Storage storage) {
        //найти макс. размера файл
        // вывести всю информацию о нем

        printFile(findMaxSizeFile(storage.getFile()));//выводит инфу
    }

    private File findMaxSizeFile(File [] files){//поиск макс размера
        File maxSizeFile = files [0];

        for (File file : files){
            if(file.getSize() > maxSizeFile.getSize()){
                maxSizeFile = file;
            }
        }
        return maxSizeFile;
    }
    private void printFile(File file){
        System.out.println(file.getName());
        System.out.println(file.getExtension());
        System.out.println(file.getPath());
        System.out.println(file.getSize());
    }
}
