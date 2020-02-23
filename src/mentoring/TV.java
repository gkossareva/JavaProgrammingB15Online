package mentoring;

public class TV {
    int channel=1;
    int volumeLevel=1;
    boolean on = false;
    String brand = "undefined";
    //String brand;

    public TV(){
        System.out.println("Creating TV object using no Args- constructor");
    }
    public TV(String brand){
        System.out.println("Creating TV object using 1 arg - constructor");
    }
    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        this.volumeLevel = volumeLevel;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void channelUp(){
        channel=channel+1;
    }
    public void channelDown(){
        channel=channel-1;
    }
    public void isOn(){
        if (on==true){
            System.out.println("TV is already ON");
        }else if(on==false)
            System.out.println("TV is already OFF");
    }

}