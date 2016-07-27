package BinaryTree;

public class Main {
	public static void main(String[] args){
		BinaryTree bt = new BinaryTree();
		for(int i=1;i<5;i++){
			int ran = (int) (Math.random()*8)+1;
			bt.addNode(new Item(ran));
			System.out.println(ran);
		}
		System.out.println("-------------");
		System.out.println(bt.lengthTree());
		System.out.println("-------------");
		bt.aftOrder();
		System.out.println("-------------");
		bt.preOrder();
		System.out.println("-------------");
		bt.midOrder();
		System.out.println("-------------");
		
	}
}
