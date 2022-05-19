package memento;

public class File {
    private String content;
    private String id;
    private String address;
    private String name;

    public File(String content, String id, String address, String name) {
        this.content = content;
        this.id = id;
        this.address = address;
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void print(){
        System.out.println(this.content);
    }

    public void createSnapshot(FileSnapshot fileSnapshot){

    }
    public void restoretoSomePoint(FileSnapshot fileSnapshot){

    }

}
