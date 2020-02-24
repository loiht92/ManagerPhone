import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerPhoneBook {

    private static PhoneBook phoneBook = new PhoneBook();
    private static Scanner scanner = new Scanner(System.in);

    private static void insertPhone() {
        System.out.println("moi nhap ten muon them");
        String name = scanner.nextLine();

        System.out.println("nhap so dien thoai");
        String phone = scanner.nextLine();
        phoneBook.insertPhone(name, phone);
    }

    private static void removePhone() {
        System.out.println("nhap ten muon xoa");
        String name = scanner.nextLine();
        phoneBook.removePhone(name);
    }

    private static void updatePhone() {
        System.out.println("nhap ten nguoi dung");
        String name = scanner.nextLine();
        System.out.println("nhap so dien thoai");
        String phone = scanner.nextLine();
        phoneBook.updatePhone(name, phone);
    }

    private static void phoneSearchPhone() {
        System.out.println("nhap ten nguoi dung");
        String name = scanner.nextLine();
        phoneBook.PhoneSearchPhone(name);
    }


    private static void sort() {
        phoneBook.sortPhone();
    }

    static void menu() {
        System.out.println("1.them ten");
        System.out.println("2. xoa ten");
        System.out.println("3.cap nhat");
        System.out.println("4. tim ten");
        System.out.println("5.sap xep");
        System.out.println("6. thoat");

    }

    public static void main(String[] args) {
        List<Phone> phoneList = new ArrayList<>();
//        Phone a = new Phone();
//        a.setName("Loi");
//        a.setPhoneNumber("123");
//        phoneList.add(a);
//        System.out.println(phoneList);
//        System.out.println("Nhap so hoc sinh");
//        int number = scanner.nextInt();
//        for (int i =0; i< number; i++){
//            Phone a = new Phone();
//            System.out.println("Hoc sinh thu" +i);
//            scanner.nextLine(); //tranh truot dong
//
//            System.out.println("Nhap ten");
//            String name = scanner.nextLine();
//
//            System.out.println("Nhap sdt");
//            String phone = scanner.nextLine();
//            a.setName(name);
//            a.setPhoneNumber(phone);
//            phoneList.add(a);
//
//        }
//        System.out.println("Cac phan tu co trong mang");
//        for (int i =0; i< phoneList.size(); i++){
//            System.out.println("Nguoi thu:" +i);
//            System.out.println("Ten" +phoneList.get(i).getName() +" So dt" +phoneList.get(i).getPhoneNumber());
//            System.out.println(phoneList);
//        }

        int choice;
        System.out.println("moi ban chon 1 muc");
        menu();
        while (true) {

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    insertPhone();
                    break;
                case 2:
                    removePhone();
                    break;
                case 3:
                    updatePhone();
                    break;
                case 4:
                    phoneSearchPhone();
                    break;
                case 5:
                    sort();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("khong hop le");
            }
        }
    }
}

