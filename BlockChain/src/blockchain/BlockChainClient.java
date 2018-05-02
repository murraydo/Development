package blockchain;

public class BlockChainClient {

	
	public static void main(String [] args) {
		BlockChain bc = new BlockChain();
		bc.addNewBlock(new Block(1, "25.04.2018", "Vertragsabschluss Murat Vatandas", "0", 0));
		bc.addNewBlock(new Block(2, "26.04.2018", "Vertragsabschluss Murray Vatandas", "0", 0));
		
		
		
		System.out.println("Die Daten sind noch nicht manipuiert worden. Ist Die Blockchain valide? " + bc.validateChain());
		System.out.println(bc.toString()+ "\n");
		
		// Data tampered
		bc.getBlockChain().get(1).setTransaction("Manipulierter Vertragsabschluss ");
		
		System.out.println("Die Daten sind manipuliert worden. Sind die Daten jetzt noch valide? " + bc.validateChain());
		System.out.println(/*"The entire blockchain: \n"*/  bc.toString());
		
//		BlockChain bc2 = new BlockChain();
//		bc2.addNewBlockWithMining(new Block(1, "27.04.2018", "Vertragsabschluss MV", "0", 0), 1);
//		
//		System.out.println(bc2.validateChain(bc2));
//		System.out.println(bc2.toString());
	}
}
