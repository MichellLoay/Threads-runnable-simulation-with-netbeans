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

    public void main(String[] args) throws InterruptedException {
        Thread t1;
        t1 = new Thread(new MyRunnable());
        t1.setName("Thread-Runnable");
        //t1.run()
        /* 
        se si chiama start():        
        Il metodo run() viene eseguito come un normale metodo Java nel thread principale (main),
        non in un nuovo thread.Il nome del thread sarà main, perché run() non viene eseguito 
        in parallelo.
        */
        t1.start();
        /* 
        se si aggiunge  join():
        t1.join(); fa sì che il thread principale attenda il completamento di t1 prima di proseguire.
        Senza join(), il thread main potrebbe stampare il suo messaggio prima o dopo t1, ma con join(),
        l'ordine è garantito.
        */
        t1.join();
        System.out.println("Thread principale: " + Thread.currentThread().getName());
    }
}
