import java.util.*;

class Note {
    int id;
    String date;
    String content;

    Note(int id, String date, String content) {
        this.id = id;
        this.date = date;
        this.content = content;
    }
}

class Account {
    String id;
    String name;
    List<Note> notes = new ArrayList<>();
    int nextNoteId = 1;

    Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    void addNote(String date, String content) {
        String formattedDate = date.substring(3, 5) + " " + date.substring(0, 3) + " " + date.substring(5, 7);
        notes.add(new Note(nextNoteId++, formattedDate, content));
    }

    void shareNote(Account other, int noteId) {
        for (Note note : notes) {
            if (note.id == noteId) {
                other.notes.add(new Note(other.nextNoteId++, note.date, note.content));
                break;
            }
        }
    }
}

public class ELAB2315 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {
            System.out.println("invalid input");
            return;
        }
        int n = scanner.nextInt();
        scanner.nextLine();
        Map<String, Account> accounts = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (!scanner.hasNextLine()) {
                System.out.println("invalid input");
                return;
            }
            String name = scanner.nextLine();
            accounts.put(String.format("%03d", i + 1), new Account(String.format("%03d", i + 1), name));
        }
        while (scanner.hasNext()) {
            String id = scanner.next();
            String action = scanner.next();
            if (action.equals("Add")) {
                if (!scanner.hasNext()) {
                    System.out.println("invalid input");
                    return;
                }
                String date = scanner.next();
                if (!scanner.hasNextLine()) {
                    System.out.println("invalid input");
                    return;
                }
                String content = scanner.nextLine().trim();
                accounts.get(id).addNote(date, content);
            } else if (action.equals("Share")) {
                if (!scanner.hasNext()) {
                    System.out.println("invalid input");
                    return;
                }
                String otherId = scanner.next();
                if (!scanner.hasNextInt()) {
                    System.out.println("invalid input");
                    return;
                }
                int noteId = scanner.nextInt();
                accounts.get(id).shareNote(accounts.get(otherId), noteId);
            } else {
                System.out.println("invalid input");
                return;
            }
        }
        for (Account account : accounts.values()) {
            System.out.println("Account: " + account.name);
            for (Note note : account.notes) {
                System.out.println(note.date + " | " + note.content);
            }
        }
    }
}