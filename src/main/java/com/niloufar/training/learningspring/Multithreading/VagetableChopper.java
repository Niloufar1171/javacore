package com.niloufar.training.learningspring.Multithreading;

//to show how scheduler is working
//Even that those two threads starts and end at the same time scheduler give time to them randdomly
class VegetableChopper extends Thread {

    public int vegetable_count = 0;
    public static boolean chopping = true;

    public VegetableChopper(String name) {
        this.setName(name);
    }

    public void run() {
        while(chopping) {
            System.out.println(this.getName() + " chopped a vegetable!");
            vegetable_count++;
        }
    }
}
class ExecutionSchedulingDemo{
    public static void main(String[] args) throws InterruptedException {
        VegetableChopper niloufar = new VegetableChopper("Niloufar");
        VegetableChopper golbarg = new VegetableChopper("Golbarg");

        niloufar.start();
        golbarg.start();
        Thread.sleep(1000);
        VegetableChopper.chopping = false;
        niloufar.join();
        golbarg.join();
        System.out.format("niloufar chopped %d vegetables.\n", niloufar.vegetable_count);
        System.out.format("golbarg chopped %d vegetables.\n", golbarg.vegetable_count);


    }
}
