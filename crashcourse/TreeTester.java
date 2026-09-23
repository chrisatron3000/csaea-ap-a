public class TreeTester {

    public static void main(String[] args){

        Tree PalmTree = new Tree("Palm Tree", "beige", false);
        Tree RedwoodTree = new Tree("Redwood Tree", "Red", false);


        PalmTree.sway();
        RedwoodTree.absorb(100);
        RedwoodTree.absorb(100);
        RedwoodTree.expand();
        PalmTree.absorb(100);
        PalmTree.grow();
    }
    
}
