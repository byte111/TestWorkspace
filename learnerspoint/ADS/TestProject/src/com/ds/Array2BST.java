package com.ds;

/**
 * Created by dbhattac on 12/29/2016.
 */
public class Array2BST {


    public static Node root = null;
    public static Node parentnode = null;
    public static  void main(String args[])
    {
        float array[]= {4,3,8,8,8,9,-234,2,1,5,67};


        Array2BST bstobj = new Array2BST();



        for (float i:array)
        {
            bstobj.addNode(root,parentnode,i);
        }

        if(parentnode == null) {
            System.out.print("No elements in tree..");
            System.exit(0);
        }
        iterateNode(root);


    }

    public static void iterateNode(Node node)
    {
        if(node == null)
        {
            return;
        }
        iterateNode(node.left);
        System.out.print(node.data+ " ");
        iterateNode(node.right);
    }



    public  void addNode(Node r,Node pnode,Float i )
    {


        if(r == null) {
            Node n = new Node();
            n.data = i;
            n.left = n.right = null;

            parentnode = root =  n;
                //r = pnode;
                return;

        }
        else
        {
           if(pnode == null)
            {
                Node n = new Node();
                n.data = i;
                n.left = n.right = null;

                if(i <= r.data)
                {
                    r.left = n;
                    return;
                }
                else
                {
                    r.right = n;
                    return;
                }
            }
            else if(i < pnode.data)
            {
                addNode(pnode,pnode.left,i);
            }
            else
            {
                addNode(pnode,pnode.right,i);
            }


        }


    }



    class Node
    {
        Node left,right;
        Float data;
    }



}
