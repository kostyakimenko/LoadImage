import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class ImageLoader {
    private String source;
    private String file;

    public ImageLoader(String source, String file) {
        this.source = source;
        this.file = file;
    }

    public void loadImage() {
        int aByte;

        try {
            URL url = new URL(source);
            URLConnection connection = url.openConnection();

            InputStream reader = connection.getInputStream();
            BufferedOutputStream writer = new BufferedOutputStream(new FileOutputStream(file));

            while ((aByte = reader.read()) != -1)
                writer.write(aByte);

            reader.close();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
