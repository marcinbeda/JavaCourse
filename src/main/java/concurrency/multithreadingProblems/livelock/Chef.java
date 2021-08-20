package concurrency.multithreadingProblems.livelock;


public class Chef {

    private String name;
    private boolean isCooking;

    public Chef(String name, boolean isCooking) {
        this.name = name;
        this.isCooking = isCooking;
    }

    public String getName() {
        return name;
    }

    public boolean isCooking() {
        return isCooking;
    }

    public synchronized void work(Pan pan, Chef otherChef) {
        while (isCooking) {
            if (pan.getOwner() != this) {
                try {
                    wait(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                continue;
            }

            System.out.println(getName() + ": cooking using the pan");
            isCooking = false;
            pan.setOwner(otherChef);
        }
    }
}
