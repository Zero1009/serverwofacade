/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serverwofacade;

/**
 *
 * @author sarun
 */
public class ScheduleServer {
    private static ScheduleServer myScheduleServerObj = null;

    private ScheduleServer() {
    }

    public static ScheduleServer getMyScheduleServerObject() {
        if (myScheduleServerObj == null) {
            myScheduleServerObj = new ScheduleServer();
        }
        return myScheduleServerObj;
    }

    public void startServerFunc() {
        startServer obj = new startServer();

        obj.startBooting();
        obj.readSystemConfigFile();
        obj.init();
        obj.initializeContext();
        obj.initializeListeners();
        obj.createSystemObjects();
    }

    public void shutdownServerFunc() {
        shutdownServer obj = new shutdownServer();

        obj.releaseProcesses();
        obj.destory();
        obj.destroySystemObjects();
        obj.destoryListeners();
        obj.destoryContext();
        obj.shutdown();
    }
    // public void startBooting(){
    // System.out.println("Starts booting...");
    // }
    // public void readSystemConfigFile(){
    // System.out.println("Reading system config files...");
    // }
    // public void init(){
    // System.out.println("Initializing...");
    // }
    // public void initializeContext(){
    // System.out.println("Initializing context...");
    // }
    // public void initializeListeners(){
    // System.out.println("Initializing listeners...");
    // }
    // public void createSystemObjects(){
    // System.out.println("Creating system objects...");
    // }
    // public void releaseProcesses(){
    // System.out.println("Releasing processes...");
    // }
    // public void destory(){
    // System.out.println("Destorying...");
    // }
    // public void destroySystemObjects(){
    // System.out.println("Destroying system objects...");
    // }
    // public void destoryListeners(){
    // System.out.println("Destroying listeners...");
    // }
    // public void destoryContext(){
    // System.out.println("Destroying context...");
    // }
    // public void shutdown(){
    // System.out.println("Shutting down...");
    // }
}
