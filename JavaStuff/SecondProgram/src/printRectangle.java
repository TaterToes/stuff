public class printRectangle {
    public static void main(String[] args) throws Exception {
        //Print a rectangle :D
        int width = 100;
        int height = 10;

        String line = new String();
        System.out.println("");

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (((i == 0 || i == height - 1) && (j == 0 || j == width - 1))) {
                    line = line.concat("*");
                } else if (i == 0 || i == height - 1) {
                    line = line.concat("-");
                } else if (j == 0 || j == width - 1) {
                    line = line.concat("|");
                } else {
                    line = line.concat(" ");
                }
            }
            System.out.println(line);
            line = "";
        }
    }
}
