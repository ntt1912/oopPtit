import java.util.Scanner;

public class LAB02_FlightBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            FlightBooking fb = new FlightBooking();
            fb.reset();
            String[] input = sc.nextLine().split(" ");
            int id;
            String rq;
            for (int j = 0; j < input.length; j += 2) {
                id = Integer.parseInt(input[j]);
                rq = input[j + 1];
                switch (rq) {
                    case "Booking":
                        fb.Booking();
                        break;
                    case "Confirmed":
                        fb.Confirmed(id);
                        break;
                    case "Cancel":
                        fb.Cancel();
                        break;
                }
            }System.out.println("");
        }
    }
}

class FlightBooking {
    public String flightId = "OOP24";
    private static int seatAvailable = 180;

    public void Booking() {
        seatAvailable--;
        System.out.print("[Seat Available: " + seatAvailable + "]");
    }

    public void Confirmed(int id) {
        System.out.print("--User " + id + " Confirmed--");
        System.out.print("[Seat Available: " + seatAvailable + "]");
    }

    public void Cancel() {
        if (seatAvailable < 180) {
            seatAvailable++;
        }
        System.out.print("[Seat Available: " + seatAvailable + "]");
    }

    public void reset() {
        seatAvailable = 180;
    }
}
