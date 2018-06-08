import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Source: ");
        String source = in.next();

        System.out.print("File: ");
        String file = in.next();

        ImageLoader loader = new ImageLoader(source, file);
        loader.loadImage();
    }
}
