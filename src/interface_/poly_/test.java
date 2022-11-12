package interface_.poly_;

public class test {
    public static void main(String[] args) {
        Usb usb[] = new Usb[2];
        usb[0] = new Phone();
        usb[1] = new Camera();
        for (int i = 0; i < usb.length; i++) {
            usb[i].work();
            if(usb[i] instanceof Phone){
                ((Phone)usb[i]).call();
            }
        }
    }
}

interface Usb {
    void work();
}

class Phone implements Usb{
    @Override
    public void work() {
        System.out.println("手机运行");
    }

     void call(){
        System.out.println("手机通话");
    }
}

class Camera implements Usb{
    @Override
    public void work() {
        System.out.println("相机运行");
    }
}
