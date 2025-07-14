package interfaces;

class Phone {
    void call() {
        System.out.println("Calling...");
    }

    void sms() {
        System.out.println("Sending SMS...");
    }
}

interface ICamera {
    void click();
    void record();
}

interface IMusicPlayer {
    void play();
    void pause();
    void stop();
}

class SmartPhone extends Phone implements ICamera, IMusicPlayer {
    @Override
    public void click() {
        System.out.println("Clicking photo...");
    }

    @Override
    public void record() {
        System.out.println("Recording video...");
    }

    @Override
    public void play() {
        System.out.println("Playing music...");
    }

    @Override
    public void pause() {
        System.out.println("Pausing music...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping music...");
    }
}

public class MultipleInterfacesDemo {
    public static void main(String[] args) {
        SmartPhone s = new SmartPhone();
        s.call();
        s.sms();
        s.click();
        s.record();
        s.play();
        s.pause();
        s.stop();

        Phone  p = new SmartPhone();
        p.call();
        p.sms();
        // p.click(); // Error
        // p.record(); // Error
        // p.play(); // Error
        // p.pause(); // Error
        // p.stop(); // Error

        ICamera c = new SmartPhone();
        c.click();
        c.record();
        // c.play(); // Error
        // c.pause(); // Error
        // c.stop(); // Error

        IMusicPlayer m = new SmartPhone();
        // m.click(); // Error
        // m.record(); // Error
        m.play();
        m.pause();
        m.stop();
    }
}
