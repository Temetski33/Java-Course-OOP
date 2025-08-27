public class Television {

    int currentChannel = 0;

    int setChannel(int channel) {
        currentChannel = channel;
        if (currentChannel > 10) {
            currentChannel = 1;
        }
        return currentChannel;
    }

    int getChannel() {
        return currentChannel;
    }

    void pressOnOff() {

    }

    boolean isOn() {

        return false;
    }
}
