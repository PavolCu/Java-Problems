class ComputerFacadeTestDrive {
    public static void main(String[] args) {
        /* Your subsystems */

        Processor processor = new Processor();
        Monitor monitor = new Monitor();
        Keyboard keyboard = new Keyboard();
        ComputerFacade computerFacade = new ComputerFacade(processor, monitor, keyboard); /* Write your code here */

        computerFacade.turnOnComputer();
        computerFacade.turnOffComputer();
    }
}

class ComputerFacade {
    /* Your subsystems */
    private Processor processor;
    private Monitor monitor;
    private Keyboard keyboard;

    public ComputerFacade(Processor processor, Monitor monitor, Keyboard keyboard /* Write your code here */) {
        /* Write your code here */
        this.processor = processor;
        this.monitor = monitor;
        this.keyboard = keyboard;
    }

    public void turnOnComputer() {
        /* Write your code here */
        processor.on();
        monitor.on();
        keyboard.on();
        keyboard.turnOnBacklight();

    }

    public void turnOffComputer() {
        /* Write your code here */
        keyboard.off();
        keyboard.turnOffBacklight();
        monitor.off();
        processor.off();


    }
}

class Processor {
    /* Your subsystem description */

    public void on() {
        /* Write your code here */
        System.out.println("Processor on");
    }

    public void off() {
        /* Write your code here */
        System.out.println("Processor off");
    }
}

class Monitor {
    /* Your subsystem description */

    public void on() {
        /* Write your code here */
        System.out.println("Monitor on");
    }

    public void off() {
        /* Write your code here */
        System.out.println("Monitor off");
    }
}

class Keyboard {
    /* Your subsystem description */

    public void on() {
        /* Write your code here */
        System.out.println("Keyboard on");
    }

    public void off() {
        /* Write your code here */
        System.out.println("Keyboard off");
    }

    public void turnOnBacklight() {
        /* Write your code here */
        System.out.println("Backlight is turned on");
    }

    public void turnOffBacklight() {
        /* Write your code here */
        System.out.println("Backlight is turned off");
    }
}