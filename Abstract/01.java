    abstract class Device {
        String brand ="Samsung";

        abstract void turnOn();

        void showBrand() {
            System.out.println("Brand: " + brand);

        }
    }


    interface Camera {
        int MAX_ZOOM = 10;

        void takePhoto();

        default void cameraInfo(){
            System.out.println(x:"Camera is ready");
        }
    }

    interface MusicPlayer {
        String TYPE = "Digital";
        void playMusic();

        default void musicInfo(){
            system.out.println(x:"Music palyer is ready");
        }
    }

    class Smartphone extends Device implements Camera, MusicPlayer{
        vo
    }