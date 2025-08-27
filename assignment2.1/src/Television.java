public class Television {

    int currentChannel = 0;

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

    }

    boolean isOn() {

        return false;
    }
}
