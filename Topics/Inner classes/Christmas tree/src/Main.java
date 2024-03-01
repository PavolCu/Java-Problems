class ChristmasTree {

    public String colorOfTree;

    public ChristmasTree(String colorOfTree) {
        this.colorOfTree = colorOfTree;
    }

    // create method putTreeTopper()
    public void putTreeTopper(String color) {
        TreeTopper treeTopper = new TreeTopper(color);
        treeTopper.sparkle();
    }

    class TreeTopper {

        private String color;        

        public TreeTopper(String color) {
            this.color = color;
        }

        // create method sparkle()
        public void sparkle() {
            System.out.println("Sparkling " + color + " tree topper looks stunning with green Christmas tree!");
        }
    }
}

// this code should work
class CreateHoliday {

    public static void main(String[] args) {

        ChristmasTree christmasTree = new ChristmasTree("green");
        christmasTree.putTreeTopper("silver");
    }
}