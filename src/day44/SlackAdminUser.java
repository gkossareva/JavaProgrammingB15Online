package day44;

public class SlackAdminUser extends SlackUser {
    int adminId;

    public SlackAdminUser(String name, String status,int adminId) {
        this.adminId = adminId;
        this.name=name;
        this.status=status;
    }



    public void sendAtChannelMessage(){
        System.out.println("Sending a message");
    }
    public void deleteMessage(){
        System.out.println("Delete message");
    }

    public void addChannel(){
        System.out.println("Add chanel");
    }


    @Override
    public String toString() {
        return "SlackAdminUser{" +
                "adminId=" + adminId +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    
    }

    public static void main(String[] args) {
        
        SlackAdminUser user1=new SlackAdminUser("Akbar","Release your horse",101);
        user1.sendMessage();
        user1.callSomeone();
        user1.addEmoji();
        user1.addChannel();
        user1.deleteMessage();
        System.out.println("user1 = " + user1);
    }
}
