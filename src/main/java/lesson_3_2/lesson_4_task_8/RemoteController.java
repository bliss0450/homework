/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson_3_2.lesson_4_task_8;

/**
 *
 * @author a.lemeshchuk
 */
public class RemoteController implements Device, Volume {

    boolean isConnected;

    public void connectDevice(TVDevice tvDevice) {
            isConnected = true;
    }

    public void disconnetctDevice(TVDevice tvDevice) {
        if (checkIfDeviceConnected()) {
            isConnected = false;
        }
    }

    private boolean checkIfDeviceConnected() {
        return isConnected;
    }

    /* current channel + specified number */
    public void switchTheChannel(TV tv, int channel) {
        if (checkIfDeviceConnected()) {
            tv.setChannelNumber(tv.getChannelNumber() + channel);
        }
    }

    @Override
    public void powerOn(TV tv) {
        if (checkIfDeviceConnected()) {
            tv.setIsOn(true);
        }
    }

    @Override
    public void powerOff(TV tv) {
        if (checkIfDeviceConnected()) {
            tv.setIsOn(false);
        }
    }

    @Override
    public void upVolume(TV tv) {
        if (checkIfDeviceConnected()) {
            tv.setVolumeLevel(1);
        }
    }

    @Override
    public void downVolume(TV tv) {
        if (checkIfDeviceConnected()) {
            tv.setVolumeLevel(-1);
        }
    }

    @Override
    public void mute(TV tv) {
        if (checkIfDeviceConnected()) {
            tv.setVolumeLevel(-tv.getVolumeLevel());
        }
    }

    @Override
    public void setChannel(TV tv, int channel) {
        if (checkIfDeviceConnected()) {
            tv.setChannelNumber(channel);
        }
    }

//    @Override
//    public void currentChannel(TV tv) {
//        if (checkIfDeviceConnected()) {
//            tv.getChannelNumber();
//        }
//    }

    @Override
    public void currentChannel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
