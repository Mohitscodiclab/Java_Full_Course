public class multiple_inheritance {
    public static void main(String[] args) {

        SmartPhone smartphone = new SmartPhone();
        smartphone.capture();
    }
    
}

class camera {
    void capture(){
        System.out.println("Clicking picture....");
    }
    
}

class musicPlayer{
    void playmusic(){
        System.out.println("Palying music by Mohit.");
    }

}

class phone{
    void call(String number){
        System.out.println("Calling......to wife."+ number);
    }

}

class SmartPhone extends camera{    // we cann't add more than one extand 
                                    // because it doesen't support multiple inheritance
}
