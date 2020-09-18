package blinovtask.enums;

import java.util.concurrent.BlockingQueue;

public enum EnumSingleton {
    INSTANCE;
    private BlockingQueue <MusicType> musicTypes;

    EnumSingleton(){
        // more code
    }
    //more methods
}
// thread-safe singleton