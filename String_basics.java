public class String_basics {
    public static void main(String[] args) {
        String name="Cletus";
        String name2="Sylphia";

        // Concatenation
        String fullName = name + " " + name2;
        System.out.println("Full Name: " + fullName);
        // Length of the string 
        int length = fullName.length();
        System.out.println("Length of Full Name: " + length);
        // Character at a specific index
        char firstChar = fullName.charAt(0);
        System.out.println("First Character: " + firstChar);        
        // Substring
        String subName = fullName.substring(0, 6);
        System.out.println("Substring: " + subName);
        // Index of a character
        int indexOfC = fullName.indexOf('C');
        System.out.println("Index of 'C': " + indexOfC);
        
        // Convert to uppercase
        String upperCaseName = fullName.toUpperCase();
        System.out.println("Uppercase Full Name: " + upperCaseName);
        // Convert to lowercase
        String lowerCaseName = fullName.toLowerCase();
        System.out.println("Lowercase Full Name: " + lowerCaseName);
        // Check if the string contains a substring
        boolean containsSylphia = fullName.contains("Sylphia");
        System.out.println("Contains 'Sylphia': " + containsSylphia);
        // Replace a character
        String replacedName = fullName.replace('C', 'K');
        System.out.println("Replaced 'C' with 'K': " + replacedName);
        
        // Split the string into an array   
        String[] nameParts = fullName.split(" ");
        System.out.println("Split Full Name: ");
        for (String part : nameParts) {
            System.out.println(part);
        }
        // Trim whitespace
        String trimmedName = fullName.trim();
        System.out.println("Trimmed Full Name: " + trimmedName);
        // Check if the string is empty
        boolean isEmpty = fullName.isEmpty();
        System.out.println("Is Full Name Empty: " + isEmpty);
        // Check if the string is equal to another string
        boolean isEqual = fullName.equals("Cletus Sylphia");
        System.out.println("Is Full Name Equal to 'Cletus Sylphia': " + isEqual);
        // Check if the string is equal to another string ignoring case
        boolean isEqualIgnoreCase = fullName.equalsIgnoreCase("cletus sylphia");
        System.out.println("Is Full Name Equal to 'cletus sylphia' (ignore case): " + isEqualIgnoreCase);
        // Convert string to character array
        char[] charArray = fullName.toCharArray();
        System.out.println("Character Array: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();
        // Check if the string starts with a specific prefix
        boolean startsWithCletus = fullName.startsWith("Cletus");
        System.out.println("Starts with 'Cletus': " + startsWithCletus);


    }
}
