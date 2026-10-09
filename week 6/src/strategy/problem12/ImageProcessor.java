package strategy.problem12;

public class ImageProcessor {
    private String imageFileName;
    private FilterStrategy filter;

    public ImageProcessor(String imageFileName, FilterStrategy filter) {
        this.imageFileName = imageFileName;
        this.filter = filter;
    }

    public void setFilter(FilterStrategy filter) {
        this.filter = filter;
    }

    public void setImageFileName(String imageFileName) {
        this.imageFileName = imageFileName;
    }

    public void process() {
        if (filter == null) {
            System.out.println("No filter selected for image: " + imageFileName);
            return;
        }
        filter.applyFilter(imageFileName);
    }
}
