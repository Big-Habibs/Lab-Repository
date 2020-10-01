import java.util.ArrayList;
public class AddressBook {
    /**
     * Adding text as a test. Adding text through GIT
     */
    private ArrayList<BuddyInfo> myBuddies;
    public AddressBook(){
        myBuddies = new ArrayList<>();
    }
    public static void main(String[] args){
        BuddyInfo buddy = new BuddyInfo();
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);

    }

    public void addBuddy(BuddyInfo bud) {
        myBuddies.add(bud);
    }

    public BuddyInfo removeBuddy(int index) {
        if(index >= 0 && index < myBuddies.size()){
            return myBuddies.remove(index);
        }
        return null;
    }
}
