package blockchain;

import java.security.MessageDigest;

import javax.xml.bind.DatatypeConverter;

public class Block {
	private int index;
	private String date;
	private String transaction;
	private String previousHash;
	private String hash;
	private int nonce;
	
	
	public Block(int index, String date, String transaction, String previousHash, int nonce) {
		this.index = index;
		this.date = date;
		this.transaction = transaction;
		this.previousHash = previousHash;
		this.nonce = nonce;
		this.hash = calculateHash();
	}
	
	public String calculateHash() {
		return "" + (this.index + this.previousHash + this.date + this.transaction + this.nonce).hashCode();
	}
	
	
	/**
	 * Gibt einen hexadezimal encoded SHA-256 Hash für einen Input String zurück
	 * @param data
	 * @return
	 */
//	private String getSHA256Hash(String data) {
//		String result = null;
//		try {
//			MessageDigest digest = MessageDigest.getInstance("SHA-256");
//			byte [] hash = digest.digest(data.getBytes("UTF-8"));
//			return DatatypeConverter.printHexBinary(hash);
//		} catch (Exception ex ){
//			ex.printStackTrace();
//		}
//		return null;
//	}



	
	public int getIndex() {
		return index;
	}


	public void setIndex(int index) {
		this.index = index;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getTransaction() {
		return transaction;
	}


	public void setTransaction(String transaction) {
		this.transaction = transaction;
	}


	public String getPreviousHash() {
		return previousHash;
	}


	public void setPreviousHash(String previousHash) {
		this.previousHash = previousHash;
	}


	public int getNonce() {
		return nonce;
	}


	public void setNonce(int nonce) {
		this.nonce = nonce;
	}


	public void setHash(String hash) {
		this.hash = hash;
	}

	public String getHash() {
		return hash;
	}
	
	
}
