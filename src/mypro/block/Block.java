package mypro.block;

import java.util.ArrayList;

/*
Represent a block of  code
 */
public abstract class Block {
    private Block superBlock;
    private ArrayList<Block> subBlock;

    public Block(Block superBlock) {
        this.superBlock = superBlock;
        this.subBlock = new ArrayList<>();
    }

    public Block getSuperBlock() {
        return superBlock;
    }
    public void addBlock(Block block) {
        subBlock.add(block);
    }

    public abstract void run();
}
