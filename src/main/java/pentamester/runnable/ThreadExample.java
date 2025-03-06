/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pentamester.runnable;

/**
 *
 * @author shwak
 */
public class ThreadExample {

    public void main(String[] args) {
        Thread t1 = new Thread((Runnable) new MyRunnable());
        t1.setName("T")
    }
}
