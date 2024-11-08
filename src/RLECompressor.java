public class RLECompressor {

    /**
     * Compresses the input string using Run-Length Encoding (RLE).
     *
     * @param input the string to be compressed
     * @return the compressed string, or the original string if compression doesn't reduce its length
     */
    public String compress(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(input.charAt(i - 1)).append(count);
                count = 1;
            }
        }

        // Append the last character and its count
        compressed.append(input.charAt(input.length() - 1)).append(count);

        // Return the compressed string only if it is shorter than the original
        return compressed.length() < input.length() ? compressed.toString() : input;
    }

    public static void main(String[] args) {
        RLECompressor compressor = new RLECompressor();

        String testString = "aaaaaddddccccceff";
        String compressed = compressor.compress(testString);

        System.out.println("Original: " + testString);
        System.out.println("Compressed: " + compressed);
    }
}