/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedBinaryTreeFunctions;
import java.util.ArrayList;
/**
 *
 * @author Harshilkumar Vaghela(3116318)
 * @date November 4,2020(Lab5)
 */
public class LBTFuntionsDriver{

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[]args){
        LinkedBinaryTree<String> tree = new LinkedBinaryTree<>(); 
        // adding contents to the tree
        Position<String> root = tree.addRoot("JLB");
        Position<String> pos1 = tree.addLeft(root, "Daniel");
        Position<String> pos2 = tree.addRight(root, "Blessed"); 
        tree.addLeft(pos1, "Patricia");
        tree.addRight(pos1, "Andrey");   
        tree.addLeft(pos2, "Josh");
        tree.addRight(pos2, "Arsh");  
        tree.addLeft(tree.left(pos1), "Jaskirat");
        tree.remove(tree.left(pos1));pos2=(tree.left(pos2));
        displayFamily(tree, pos1);System.out.println("");pathToRoot(tree,pos2);
        System.out.println("Height of the tree: "+tree.height(tree.root()));
    }
    
    public static void displayFamily(LinkedBinaryTree<String> lbt, Position<String> p){
        System.out.println("Parent: " + p.getElement());
        System.out.println("Children of " + p.getElement() + ": ");
        for(Position<String> d:lbt.children(p)){System.out.print(d.getElement()+" and ");}
        System.out.print("\b\b\b\b");
        
    }
    public static void pathToRoot(LinkedBinaryTree<String> lbt, Position<String> p){
    Position<String> k=p;
    System.out.println( p.getElement()+"'s path to the root of the tree:");
    while(k!=lbt.root()){System.out.print(k.getElement()+"->");k=lbt.parent(k);}
    System.out.println(k.getElement());
    }
}

