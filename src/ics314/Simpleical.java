import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Simpleical {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		userinter();
	}

	public static void userinter() throws IOException {
		String calname = "", tstartdate = "", tstarttime = "", tstart = "", tenddate = "", tendtime = "", tend = "", msg = "", gpslat = "", gpslong = "", clas = "";
		int test = 1, conttest = 1;
		Scanner input = new Scanner(System.in);

		System.out.println("Enter Calendar Name:");
		calname = input.nextLine();
		// tstart inputs
		while (test == 1) {
			System.out
					.println("Enter Start date in yearmonthdate format, ex. 20160218:");
			tstartdate = input.nextLine();
			if (tstartdate.length() == 8) {
				test = 0;
			} else {
				test = 1;
				System.out.println("Invalid length");
			}
			int[] chartest = new int[tstartdate.length()];
			for (int i = 0; i < tstartdate.length(); i++) {
				if (tstartdate.charAt(i) >= 48 || tstartdate.charAt(i) <= 57) {
					chartest[i] = 1;
				} else {
					chartest[i] = 0;
				}
			}
			for (int i = 0; i < tstartdate.length(); i++) {
				if (chartest[i] == 0) {
					System.out.println("Invalid char at position " + i);
					test = 1;
					break;
				} else {
					test = 0;
				}
			}

		}
		test = 1;
		while (test == 1) {
			conttest = 1;
			System.out
					.println("Enter Start time in 6 digit military time format, ex. 210000:");
			tstarttime = input.nextLine();
			if (tstarttime.length() == 6) {
				test = 0;
			} else {
				test = 1;
				System.out.println("Invalid length");
			}
			int[] chartest = new int[tstarttime.length()];
			for (int i = 0; i < tstarttime.length(); i++) {
				if (tstarttime.charAt(i) >= 48 || tstarttime.charAt(i) <= 57) {
					chartest[i] = 1;
				} else {
					chartest[i] = 0;
				}
			}
			for (int i = 0; i < tstarttime.length(); i++) {
				if (chartest[i] == 0) {
					System.out.println("Invalid char at position " + i
							+ ", must be number 0-9");
					test = 1;
					conttest = 0;
					break;
				}
			}
			if (conttest == 1) {
				int x = Integer.parseInt(tstarttime);
				if (x < 0 || x > 245959) {
					System.out
							.println("Invalid time, value must be between 0 and 245959");
					test = 1;
				} else {
					test = 0;
				}
			}
		}
		tstart = tstartdate + "T" + tstarttime;
		test = 1;
		conttest = 1;

		// tend inputs
		while (test == 1) {
			System.out
					.println("Enter End date in yearmonthdate format, ex. 20160218:");
			tenddate = input.nextLine();
			if (tenddate.length() == 8) {
				test = 0;
			} else {
				test = 1;
				System.out.println("Invalid length");
			}
			int[] chartest = new int[tenddate.length()];
			for (int i = 0; i < tenddate.length(); i++) {
				if (tenddate.charAt(i) >= 48 || tenddate.charAt(i) <= 57) {
					chartest[i] = 1;
				} else {
					chartest[i] = 0;
				}
			}
			for (int i = 0; i < tenddate.length(); i++) {
				if (chartest[i] == 0) {
					System.out.println("Invalid char at position " + i);
					test = 1;
					break;
				} else {
					test = 0;
				}
			}

		}
		test = 1;
		while (test == 1) {
			conttest = 1;
			System.out
					.println("Enter Start time in 6 digit military time format, ex. 210000:");
			tendtime = input.nextLine();
			if (tendtime.length() == 6) {
				test = 0;
			} else {
				test = 1;
				System.out.println("Invalid length");
			}
			int[] chartest = new int[tendtime.length()];
			for (int i = 0; i < tendtime.length(); i++) {
				if (tendtime.charAt(i) >= 48 || tendtime.charAt(i) <= 57) {
					chartest[i] = 1;
				} else {
					chartest[i] = 0;
				}
			}
			for (int i = 0; i < tendtime.length(); i++) {
				if (chartest[i] == 0) {
					System.out.println("Invalid char at position " + i
							+ ", must be number 0-9");
					test = 1;
					conttest = 0;
					break;
				}
			}
			if (conttest == 1) {
				int x = Integer.parseInt(tendtime);
				if (x < 0 || x > 245959) {
					System.out
							.println("Invalid time, value must be between 0 and 245959");
					test = 1;
				} else {
					test = 0;
				}
			}
		}
		tend = tenddate + "T" + tendtime;
		test = 1;
		// GPS latitude inputs
		while (test == 1) {
			conttest = 1;
			System.out
					.println("Enter GPS latitude if applicable, leave blank if not, ex. 37.386013 :");
			gpslat = input.nextLine();
			int[] chartest = new int[gpslat.length()];
			for (int i = 0; i < gpslat.length(); i++) {
				if (gpslat.charAt(i) >= 48 || gpslat.charAt(i) <= 57) {
					chartest[i] = 1;
				} else {
					chartest[i] = 0;
				}
			}
			for (int i = 0; i < gpslat.length(); i++) {
				if (chartest[i] == 0) {
					System.out.println("Invalid char at position " + i
							+ ", must be number 0-9");
					test = 1;
					conttest = 0;
					break;
				}
			}
			if (conttest == 1) {
				int x = Integer.parseInt(gpslat);
				if (x < -90 || x > 90) {
					System.out
							.println("Invalid latitude, value must be between -90 and 90");
					test = 1;
				} else {
					test = 0;
				}
			}
		}
		test = 1;
		// GPS Longitude inputs
		while (test == 1) {
			conttest = 1;
			System.out
					.println("Enter GPS longitude if applicable, leave blank if not, ex. 37.386013 :");
			gpslong = input.nextLine();
			int[] chartest = new int[gpslong.length()];
			for (int i = 0; i < gpslong.length(); i++) {
				if (gpslong.charAt(i) >= 48 || gpslong.charAt(i) <= 57) {
					chartest[i] = 1;
				} else {
					chartest[i] = 0;
				}
			}
			for (int i = 0; i < gpslong.length(); i++) {
				if (chartest[i] == 0) {
					System.out.println("Invalid char at position " + i
							+ ", must be number 0-9");
					test = 1;
					conttest = 0;
					break;
				}
			}
			if (conttest == 1) {
				int x = Integer.parseInt(gpslong);
				if (x < 0 || x > 180) {
					System.out
							.println("Invalid longitude, value must be between 0 and 180");
					test = 1;
				} else {
					test = 0;
				}
			}
		}
		test = 1;
		while (test == 1) {
			System.out
					.println("Enter class of event, (PUBLIC, PRIVATE, CONFIDENTIAL):");
			clas = input.nextLine();
			if(!clas.contentEquals("PUBLIC") || !clas.contentEquals("Private") || !clas.contentEquals("CONFIDENTIAL")){
				System.out.println("Input must be PUBLIC, PRIVATE, or CONFIDENTIAL, case sensitive");
				test = 1;
			}
			else{
				test = 0;
			}
		}
		System.out.println("Enter Message:");
		msg = input.nextLine();

		createics(calname, tstart, tend, msg, gpslat, gpslong, clas);

		input.close();
	}

	private static void createics(String name, String start, String end,
			String msg, String gpsla, String gpslo, String clas)
			throws IOException {
		FileWriter write = new FileWriter("ics314.ics");

		write.write("BEGIN:VCALENDAR" + '\n'
				+ "PRODID:-//Google Inc//Google Calendar 70.9054//EN" + '\n'
				+ "VERSION:2.0" + '\n' + "CALSCALE:GREGORIAN" + '\n'
				+ "METHOD:PUBLISH" + '\n' + "X-WR-CALNAME:");
		write.write((name + '\n'));
		write.write("X-WR-TIMEZONE:Pacific/Honolulu\nBEGIN:VEVENT\nDTSTART:");
		write.write((start + '\n'));
		write.write("DTEND:");
		write.write((end + '\n'));
		write.write("GEO:");
		write.write((gpsla + ";" + gpslo + '\n'));
		write.write("CLASS:");
		write.write((clas + '\n'));
		write.write("UID:tccsg6j6deenb9gr61l0h7gcas@google.com\nDESCRIPTION:\nLOCATION:\nSEQUENCE:3\nSTATUS:CONFIRMED\nSUMMARY:");
		write.write((msg + '\n'));
		write.write("TRANSP:OPAQUE\nEND:VEVENT\nEND:VCALENDAR\n");

		write.close();
	}
}