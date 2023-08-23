package session8.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class DiaryEntry {
    private String date;
    private String entry;

    public DiaryEntry(String date, String entry) {
        this.date = date;
        this.entry = entry;
    }

    public String getDate() {
        return date;
    }

    public String getEntry() {
        return entry;
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }

    @Override
    public String toString() {
        return date + ": " + entry;
    }
}

public class PersonalDiary {

    public static void main(String[] args) {
        ArrayList<DiaryEntry> diary = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add entry");
            System.out.println("2. Edit entry");
            System.out.println("3. Delete entry");
            System.out.println("4. Display entries (latest first)");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    addEntry(diary, scanner);
                    break;
                case 2:
                    editEntry(diary, scanner);
                    break;
                case 3:
                    deleteEntry(diary, scanner);
                    break;
                case 4:
                    displayEntries(diary);
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select again.");
            }
        }
    }

    private static void addEntry(ArrayList<DiaryEntry> diary, Scanner scanner) {
        System.out.print("Enter the date (YYYY-MM-DD): ");
        String date = scanner.nextLine();

        for (DiaryEntry entry : diary) {
            if (entry.getDate().equals(date)) {
                System.out.println("An entry for this date already exists.");
                return;
            }
        }

        System.out.print("Enter the diary entry: ");
        String entryText = scanner.nextLine();

        diary.add(new DiaryEntry(date, entryText));
        Collections.sort(diary, Comparator.comparing(DiaryEntry::getDate).reversed());

        System.out.println("Entry added successfully.");
    }

    private static void editEntry(ArrayList<DiaryEntry> diary, Scanner scanner) {
        System.out.print("Enter the date of the entry to edit (YYYY-MM-DD): ");
        String date = scanner.nextLine();

        for (DiaryEntry entry : diary) {
            if (entry.getDate().equals(date)) {
                System.out.print("Enter the new diary entry: ");
                String newEntryText = scanner.nextLine();
                entry.setEntry(newEntryText);
                System.out.println("Entry edited successfully.");
                return;
            }
        }

        System.out.println("No entry found for the given date.");
    }

    private static void deleteEntry(ArrayList<DiaryEntry> diary, Scanner scanner) {
        System.out.print("Enter the date of the entry to delete (YYYY-MM-DD): ");
        String date = scanner.nextLine();

        for (int i = 0; i < diary.size(); i++) {
            if (diary.get(i).getDate().equals(date)) {
                diary.remove(i);
                System.out.println("Entry deleted successfully.");
                return;
            }
        }

        System.out.println("No entry found for the given date.");
    }

    private static void displayEntries(ArrayList<DiaryEntry> diary) {
        System.out.println("Diary Entries:");
        for (DiaryEntry entry : diary) {
            System.out.println(entry);
        }
    }
}
