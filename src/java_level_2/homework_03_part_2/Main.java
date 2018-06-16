package java_level_2.homework_03_part_2;

public class Main {
    public static void main(String[] args) {
	PhoneBook myPhoneBook = new PhoneBook();
	myPhoneBook.add("Ivanov","1234567");
	myPhoneBook.add("Petrov","1234568");
	myPhoneBook.add("Sidorov","1234569");
	myPhoneBook.add("Ivanov","2222222");
	myPhoneBook.printBook();
	System.out.println();
	myPhoneBook.get("Ivanov");
    }
}
