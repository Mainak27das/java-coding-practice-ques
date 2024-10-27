import java.util.Scanner;

public class String_array_File_X_Latest_Version {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();   
        String files[] = new String[size];
        for (int i = 0; i < size; i++) {
            files[i] = sc.nextLine();
        }
        sc.close();
        System.out.println("Latest version: " + latestVersion(files));
    }
    public static int latestVersion(String[] files) {
        if (files.length == 0) {
            return -1; 
        }

        int largestVersion = 0; 
           
        for (int i = 0; i < files.length; i++) {

            // Check if the file name starts with "File_" and is long enough
            if (files[i].startsWith("File_") && files[i].length() > 5) {
               
             
                String versionStr = files[i].substring(5);

                // Check if the remaining substring is a valid number
                boolean isNumeric = true;
                for (int j = 0; j < versionStr.length(); j++) {
                    if (!Character.isDigit(versionStr.charAt(j))) {
                        isNumeric = false;
                        break;
                    }
                }

                // If the substring is numeric, parse it and update the largest version
                if (isNumeric) {
                    int version = Integer.parseInt(versionStr);
                    largestVersion = Math.max(version, largestVersion);
                } 
            }
        }

        return largestVersion;
    }
}
