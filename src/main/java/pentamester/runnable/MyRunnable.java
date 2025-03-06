/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pentamester.runnable;

/**
 *
 * @author shwak
 */
public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("thread execution: " + Thread.currentThread().getName());
    }
    
   
}
