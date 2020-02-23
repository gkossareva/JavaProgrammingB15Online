package day44;
//Create a class called SlackUser
//attributes :
//	 name  ,  status (make it protected)
//behaviours :
//	 sendMessage
//	 callSomeone
//	 addEmoji
//Creare 1 subClass SlackAdminUser
//attribute :
//	adminId
//behaviour :
//	 sendAtChannelMessage
//	 deleteMessage
//	 addChannel
//	 toString method
//constructor :
//	 3 argument constructor to set all fields value
public class SlackUser {
    protected String name;
   protected String status;

    public void sendMessage (){
        System.out.println("Sending message");
    }

    public void callSomeone(){
        System.out.println("Calling");
    }
    public void addEmoji(){
        System.out.println("Adding emoji");
    }

}
