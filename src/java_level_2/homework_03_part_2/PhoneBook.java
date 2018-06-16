package java_level_2.homework_03_part_2;
import java.util.ArrayList;

//2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
// В этот телефонный справочник с помощью метода add() можно добавлять записи. С помощью метода get() искать номер
// телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
// тогда при запросе такой фамилии должны выводиться все телефоны.
public class PhoneBook {
    ArrayList<PhoneBookEntry> phoneBook = new ArrayList<>();

    public void add(String name, String phone){
        this.phoneBook.add(new PhoneBookEntry(name, phone));
    }

    public void get(String name){
        for (PhoneBookEntry e: this.phoneBook){
            if(e.name == name){
                System.out.println(e.name+" "+e.phone);
            }
        }
    }

    public void printBook(){
        for(PhoneBookEntry e: this.phoneBook){
            System.out.println(e.name+" "+e.phone);
        }
    }

    class PhoneBookEntry{
    String name;
    String phone;
        public PhoneBookEntry(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }
    }
}
