package blockchain;

import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;

public class BlockChain {

	private ArrayList<Block> chain = new ArrayList<>();
	
	public BlockChain() {
		this.chain.add(createGenesisBlock());
	}
	
	public ArrayList<Block> getBlockChain(){
		return this.chain;
	}
	
	public Block createGenesisBlock() {
		return new Block(0, "25.04.2018", "Genesis Trusted Block", "0", 0);

	}
	
	public Block getLatestBlock() {
		return chain.get(chain.size() - 1);
	}
	
	
	public void addNewBlock(Block block) {
		block.setPreviousHash(getLatestBlock().getHash());
		block.setHash(block.calculateHash());
		chain.add(block);
	}
	
//	// Nur für das Mining 
//	public void addNewBlockWithMining(Block block, int difficulty) {
//		
//		if(difficulty == 0) {
//			this.addNewBlock(block);
//			return;
//		}
//		StringBuilder sb = new StringBuilder();
//		for(int i = 0; i < difficulty; i++) {
//			sb.append("0");
//		}
//		String leadingZeroes = sb.toString();
//		System.out.println("leadingZeroes: " + leadingZeroes);
//		block.setPreviousHash(getLatestBlock().getHash());
//		block.setHash(block.calculateHash());
//		while(block.getHash().substring(0, difficulty)  != leadingZeroes) {
//			block.setNonce(block.getNonce() + 1);
//			block.setHash(block.calculateHash());
//			System.out.println("Current Block's hash: " + block.getHash());
//		}
//		System.out.println("Block mined with hash: " + block.getHash());
//		chain.add(block);
//	}
	
	public boolean validateChain() {
		for(int i = 1; i < this.getBlockChain().size(); i++) {
			Block currentBlock = this.getBlockChain().get(i);
			Block previousBlock = this.getBlockChain().get(i-1);
			
			if(!currentBlock.getPreviousHash().equals(previousBlock.getHash())) {
				return false;
			}
			if(!currentBlock.getHash().equals(currentBlock.calculateHash())) {
				return false;
			}
			
		}
		return true;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		StringBuilder bc = new StringBuilder();

		String start = "";
		for( Block b : chain) {
			start += " \n" + "Der Index ist:" + b.getIndex() + ", " + "Der Vertrag wurde estellt am: " +  b.getDate() + "," + " Previous-Hashwert: " + b.getPreviousHash() +
					 "," + " Aktueller Hashwert: " + b.getHash() + "," + " Vertragsdaten: " +b.getTransaction();
		}
		return start;
	}

	public ArrayList<Block> getChain() {
		return chain;
	}

	public void setChain(ArrayList<Block> chain) {
		this.chain = chain;
	}

	
	
	
	
}
