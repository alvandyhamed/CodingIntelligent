package learning;

interface ImageReader {
    DecoderImage decoderimage();
}
class DecoderImage {
    private String Image;

    public DecoderImage(String image) {
        this.Image = image;
    }

    @Override
    public String toString() {
        return "MyImage"+super.toString();
    }

}

class Giftreader implements ImageReader{
    private DecoderImage decodedImage;

    public Giftreader(String image) {
        decodedImage = new DecoderImage(image);
    }

    @Override
    public DecoderImage decoderimage() {
        return null;
    }
}
class JpegReder implements ImageReader{
    private DecoderImage decoderImage;

    public JpegReder(String image) {
        this.decoderImage = new DecoderImage(image);
    }

    @Override
    public DecoderImage decoderimage() {
        return null;
    }
}
public class factory_method {
    public static void main(String[] args) {
        DecoderImage decodedImage;
        ImageReader reader = null;
        String image = args[0];
        String format = image.substring(image.indexOf('.') + 1, (image.length()));
        if (format.equals("gif")) {
            reader = new Giftreader(image);
        }
        if (format.equals("jpeg")) {
            reader = new JpegReder(image);
        }
        assert reader != null;
        decodedImage = reader.decoderimage();
        System.out.println(decodedImage);
    }
    }
