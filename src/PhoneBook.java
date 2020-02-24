import java.util.*;

public class PhoneBook extends Phone implements PhoneFunction {
    static  Scanner scanner = new Scanner(System.in);
    ArrayList<Phone> phoneList = new ArrayList<>();

    @Override
    public void insertPhone(String name, String phoneNumber) {


        for (Phone phone:phoneList){
            if (phone.getName().equals(name)){
                System.out.println("Ban vui long nhap lai");
            }else {
                Phone phone1 = new Phone(name,phoneNumber);
                phoneList.add(phone1);
                System.out.println("Ban da them thanh cong");
            }
        }
    }

    @Override
    public void removePhone(String name) {

        for (Phone phone:phoneList){
            if (phone.getName().equals(name)){
                phoneList.remove(phone);
            }else {
                System.out.println(" khong xoa duoc");
            }
        }

    }

    @Override
    public void updatePhone(String name, String phoneNumber) {
        boolean isPhone = false;
        for (Phone phone: phoneList){
            if (phone.getName().equals(name)) {
                if (phone.getPhoneNumber().equals(phoneNumber)){
                    isPhone = true;
                    System.out.println("Ban nhap ten");
                    name = scanner.nextLine();
                    phone.setName(name);
                    System.out.println("ban nhap sdt");
                    phone.setPhoneNumber(phoneNumber);
                    System.out.println("Ban da cap nhat thanh cong");
                }
            }
        }
        if (!isPhone){
            System.out.println("Khong tim thay");
        }


    }

    @Override
    public void PhoneSearchPhone(String name) {
        boolean isPhone = false;
        for (Phone phone : phoneList) {
            if (phone.getName().equals(name)) {
                System.out.println(phone.toString());
            }
        }
        if (!isPhone){
            System.out.println("Khong tim thay");
        }
    }


    @Override
    public void sortPhone() {
        Collections.sort(phoneList, new Comparator<Phone>() {
            @Override
            public int compare(Phone phone, Phone phone1) {
                return phone.getName().compareTo(phone1.getName());
            }
        });
        System.out.println("Mang da dk sap xep");
    }

}


