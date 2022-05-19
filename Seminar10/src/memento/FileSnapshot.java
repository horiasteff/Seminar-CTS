package memento;

public class FileSnapshot {
    private String content;
    private String version;
    private String date;
    private String message;

    public FileSnapshot(String content, String version, String date, String message) {
        this.content = content;
        this.version = version;
        this.date = date;
        this.message = message;
    }

    public String getContent() {
        return content;
    }

    public String getDetails(){
        return this.version + " " + this.date + " " + this.message;
    }

}
