package murach.data;

import java.io.*;
import java.util.*;
import murach.business.UserE;

public class UserIO {

    public static void addRecord(UserE user, String filename) throws IOException {
        File file = new File(filename);
        PrintWriter out = new PrintWriter(
                new FileWriter(file, true));
        out.println(user.getEmail() + "|"
                + user.getFirstName() + "|"
                + user.getLastName());
        out.close();
    }

    public static UserE getUser(String emailAddress, String filename) throws IOException {
        File file = new File(filename);
        BufferedReader in = new BufferedReader(
                new FileReader(file));
        UserE user = new UserE();
        String line = in.readLine();
        while (line != null) {
            StringTokenizer t = new StringTokenizer(line, "|");
            String email = t.nextToken();
            if (email.equalsIgnoreCase(emailAddress)) {
                String firstName = t.nextToken();
                String lastName = t.nextToken();
                user.setEmail(emailAddress);
                user.setFirstName(firstName);
                user.setLastName(lastName);
            }
            line = in.readLine();
        }
        in.close();
        return user;
    }

    public static ArrayList<UserE> getUsers(String filename) throws IOException {
        ArrayList<UserE> users = new ArrayList<UserE>();
        BufferedReader in = new BufferedReader(
                new FileReader(filename));
        String line = in.readLine();
        while (line != null) {
            try {
                StringTokenizer t = new StringTokenizer(line, "|");
                String emailAddress = t.nextToken();
                String firstName = t.nextToken();
                String lastName = t.nextToken();
                UserE user = new UserE(firstName, lastName, emailAddress);
                users.add(user);
                line = in.readLine();
            } catch (NoSuchElementException e) {
                line = in.readLine();
            }
        }
        in.close();
        return users;
    }

    public static HashMap<String, UserE> getUsersMap(String filename) throws IOException {
        HashMap<String, UserE> users = new HashMap<String, UserE>();
        BufferedReader in = new BufferedReader(
                new FileReader(filename));
        String line = in.readLine();
        while (line != null) {
            try {
                StringTokenizer t = new StringTokenizer(line, "|");
                String emailAddress = t.nextToken();
                String firstName = t.nextToken();
                String lastName = t.nextToken();
                UserE user = new UserE(firstName, lastName, emailAddress);
                users.put(emailAddress, user);
                line = in.readLine();
            } catch (NoSuchElementException e) {
                line = in.readLine();
            }
        }
        in.close();
        return users;
    }
}
