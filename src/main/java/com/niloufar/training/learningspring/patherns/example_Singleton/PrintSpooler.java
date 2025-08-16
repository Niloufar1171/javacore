package com.niloufar.training.learningspring.patherns.example_Singleton;

public class PrintSpooler {
  //  private static PrintSpooler spooler;
    private static final PrintSpooler spooler = new PrintSpooler();//
    private static boolean initialized = false;

    private PrintSpooler(){};

    private void init(){};

    public static synchronized  PrintSpooler getInstance(){ //having a global point of access to one spooler object
        if (initialized) return spooler; // if it is initialized then return otherwise create one
      //  spooler = new PrintSpooler();// it only going to be created when only asked to be used == lazy initiaization but java is already have the lazy initialization so we can take it out!
        spooler.init();
        initialized = true ;
        return spooler;
    }
}
