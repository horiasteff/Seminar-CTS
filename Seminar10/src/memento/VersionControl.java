package memento;

import java.util.HashMap;

public class VersionControl {
    HashMap<Integer, FileSnapshot> versions;
    static int version;

    public void addSnapshot(FileSnapshot fileSnapshot){

    }
    public void getFileSnaphotByVersion(){

    }
    public void listSnapshotList(){

    }

    public static int getNextVersionNumber(){
        return version;
    }

}
