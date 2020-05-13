package lesson11.biginterfaceexample;

public class Storage  {
    private File[] file = new File[5];

    public Storage(File[] file) {
        this.file = file;
    }

    public File[] getFile() {
        return file;
    }
}
