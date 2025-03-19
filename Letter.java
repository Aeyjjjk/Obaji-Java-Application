public class Letter {
    public static void main(String[] args) {
        String recipient = "John";
        String sender = "Alice";
        String date = "March 19, 2025";
        String location = "Lagos, Nigeria";
        String subject = "Upcoming Business Meeting";

        System.out.printf("From: %s\nLocation: %s\nDate: %s\nReciever: %s\n\n", date, sender, location,recipient );
        System.out.printf("To: %s\nSubject: %s\n\n", recipient, subject);

        System.out.printf("Dear %s,\n\n", recipient);
        System.out.printf("I hope this letter finds you in great health and high spirits.\n");
        System.out.printf("I am writing to remind you about our scheduled meeting next week.\n");
        System.out.printf("We will discuss important business strategies and upcoming projects.\n\n");

        System.out.printf("Meeting Details:\n");
        System.out.println("------------------------------------------------------");
        System.out.printf("Date: %s\n", "March 25, 2025");
        System.out.printf("Time: %s\n", "10:00 AM");
        System.out.printf("Venue: %s\n", "Downtown Conference Hall, Lagos");
        System.out.printf("------------------------------------------------------\n\n");

        System.out.printf("Please confirm your availability at your earliest convenience.\n");
        System.out.printf("Looking forward to a productive discussion.\n\n");

        System.out.printf("Best regards,\n%s\n", sender);
        System.out.printf("Email: %s\n", "alice@example.com");
        System.out.printf("Phone: %s\n", "+234 123 456 7890");
    }
}
