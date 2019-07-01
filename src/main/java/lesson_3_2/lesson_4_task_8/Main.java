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
public class Main {

    public static void main(String[] args) {
        TV tv = new TV();
        RemoteController remoteController = new RemoteController();

        remoteController.connectDevice(tv);
        remoteController.powerOn(tv);
        System.out.println("");
        System.out.println("Is TV on?");
        System.out.println(tv.isIsOn());
        remoteController.upVolume(tv);
        remoteController.upVolume(tv);
        remoteController.upVolume(tv);
        remoteController.upVolume(tv);
        System.out.println("");
        System.out.println("What is the volume level?");
        System.out.println(tv.getVolumeLevel());
        remoteController.downVolume(tv);
        System.out.println("");
        System.out.println("And now?");
        System.out.println(tv.getVolumeLevel());
        remoteController.setChannel(tv, 5);
        System.out.println("");
        System.out.println("What channnel are we on?");
        tv.currentChannel();
        System.out.println("");
        System.out.println("And now?");
        remoteController.switchTheChannel(tv, 5);
        tv.currentChannel();

    }

}
