public class FixedArrays {
    public static void main(String[] args) {
        String[] group = new String[] {"Sam", "Noah", "Liam"};
        // You can resize an array, so...
        String[] newGroup = new String[4];
        for (int i = 0; i < newGroup.length; i++) {
            newGroup[i] = group[i];
        }
        newGroup[3] = "Katie";
    }
}
