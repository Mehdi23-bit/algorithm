public class ReverseString {
    public static void main(String[] args) {
        String original = "kayak";
        
        // Use StringBuilder to reverse the string
        StringBuilder sb = new StringBuilder(original);
        String reversed = sb.reverse().toString();
        
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
        if(original.equals(reversed)){
            System.out.println("palinderom");
        }
        else{
            System.out.println("not palinderom");
        }
    }
}