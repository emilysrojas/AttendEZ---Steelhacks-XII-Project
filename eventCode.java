public class eventCode {
    private static int idCounter = 0;
    public int eventUniqueID;
    public String eventCode;

    public eventCode(int eventUniqueID){
        this.eventUniqueID=idCounter++;
        
        char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
        for (int i = 0; i < 6; i++) {
            char c = chars[(int) (Math.random() * chars.length)];
            eventCode += c;
        }
    }

    public String getEventCode(){
        return eventCode;
    }
    
}
