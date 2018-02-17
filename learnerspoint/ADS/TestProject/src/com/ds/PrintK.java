package com.ds;

class NodeT
{
	int data;
	NodeT left,right;

	public NodeT(int data)
	{
		this.data = data;
	}
}
public class PrintK {
	static int key , path ;
	public static void print(NodeT root,NodeT ancestor,int dist)
	{
		if(root == null) return ;
		if(dist == path) {
			System.out.println(root.data);
			return ;
		}
		if(root.data != key){
			dist = dist + 1 ;
			print(root.left,root,dist);
			dist = dist + 1 ;
			print(root.right,root,dist);
		}
		
		m1(root,path);
	}
	
	public static void m1(NodeT root,int dist)
	{
		if(root == null) return ;
		if(dist == path && root.data != key) return;
		if(dist == 0)
			System.out.println(root.data);
		
		m1(root.left,dist-1);
		m1(root.right, dist-1);
	}
	
	public static void main(String[] args) {
		NodeT n1 = new NodeT(20);
		NodeT n2 = new NodeT(8);
		NodeT n3 = new NodeT(22);
		NodeT n4 = new NodeT(4);
		NodeT n5 = new NodeT(12);
		NodeT n6 = new NodeT(10);
		NodeT n7 = new NodeT(14);
		NodeT n8 = new NodeT(21);
		NodeT n9 = new NodeT(23);
		
		n1.left = n2;
		n1.right = n3; 
		n2.left = n4 ;
		n2.right = n5;
		n5.left = n6;
		n5.right = n7;
		n3.left = n8;
		n3.right = n9;
		key = 8;
		path = 3;
		
		
		print(n1,null,0);
		
	}
}
