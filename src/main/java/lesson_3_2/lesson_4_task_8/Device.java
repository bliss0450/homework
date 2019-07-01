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
interface Device {
    public void powerOn(TV tv);
    public void powerOff(TV tv);
    public void setChannel(TV tv, int channel);
    public void currentChannel();
}
