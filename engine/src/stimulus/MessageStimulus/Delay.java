package stimulus.MessageStimulus;

/**
 * Project: NewSimulator
 * Created by IntelliJ IDEA
 * Author: Sumin Park <smpark@se.kaist.ac.kr>
 * Github: https://github.com/sumin0407/NewSimulator.git
 */


public class Delay extends Message {


    public int delay;


    public Delay(int frame, int endFrame, String sender, String receiver, int delay) {
        this.frame = frame;
        this.endFrame = endFrame;
        this.sender = sender;
        this.receiver = receiver;
        this.delay = delay;
    }


//    public Delay(World world, int frame, Range tileRange, String fieldName, Object value) {
//        super(world, frame, tileRange, fieldName, value);
//    }
//
//    public Delay(World world, int frame, ArrayList<String> targetNames, String fieldName, Object value) {
//        super(world, frame, targetNames, fieldName, value);
//    }
//
//    public Delay(World world, int frame, String targetName, String fieldName, Object value) {
//        super(world, frame, targetName, fieldName, value);
//    }
}
