public class PackageSize {
    enum Packagesize {
        SMALL(0, 100),
        MEDIUM(101, 200),
        LARGE(201, Integer.MAX_VALUE);
        private final int minSize;
        private final int maxSIze;

        private Packagesize(int minSize, int maxSIze) {
            this.minSize = minSize;
            this.maxSIze = maxSIze;
        }

        public int getMaxSize() {
            return maxSIze;
        }

        public int getMinSize() {
            return minSize;
        }

        public static Packagesize getPackageSize(int size) {
            for (Packagesize packageSize : values()) {
                if (size >= packageSize.getMinSize() && size <= packageSize.getMaxSize()) {
                    return packageSize;
                }
            }
            // Handle the case when the size doesn't fall into any category
            return null;
        }

    }

}
