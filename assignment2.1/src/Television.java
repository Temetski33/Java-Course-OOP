public class Television {

    private int currentChannel = 0;
    private boolean power = false;

    void setChannel(int channel) {
        currentChannel = channel;
        if (currentChannel > 10) {
            currentChannel = 1;
        }
    }

    int getChannel() {
        return currentChannel;
    }

    void pressOnOff() {
        power = !power;
    }

    boolean isOn() {
        return power;
    }
}
