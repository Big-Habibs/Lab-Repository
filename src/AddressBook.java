import java.util.ArrayList;
public class AddressBook {
ArrayList<BuddyInfo> list = new ArrayList<>();

    public static void main(String[] args){
        BuddyInfo buddy = new BuddyInfo();
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);

    }

    public void addBuddy(BuddyInfo bud) {
        list.add(bud);
    }
    public void removeBuddy(BuddyInfo bud) {
        list.remove(bud);
    }
}
