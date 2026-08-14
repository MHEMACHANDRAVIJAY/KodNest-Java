class Phone {
    
    
    public void unlockWithPattern() {
        System.out.println("Phone unlocked with Pattern");
    }
    
    public void unlockWithPassword() {
        System.out.println("Phone unlocked with Password");
    }
    
    public void unlockWithFaceId() {
        System.out.println("Phone unlocked with Face ID");
    }
    
    public void unlockWithFingerprint() {
        System.out.println("Phone unlocked with Fingerprint");
    }
}
public class PhoneApplication {
    public static void main(String[] args) {
        Phone myPhone = new Phone();
        myPhone.unlockWithPattern();
        myPhone.unlockWithPassword();
        myPhone.unlockWithFaceId();
        myPhone.unlockWithFingerprint();
    }
}

