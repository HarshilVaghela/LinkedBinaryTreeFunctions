/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedBinaryTreeFunctions;

/**
 *
 * @author Harshilkumar Vaghela(3116318)
 * @date November 4,2020(Lab5)
 */
public interface BinaryTree<E> extends Tree<E> {  /** Returns the Position of p's left child (or null if no child exists). */
 Position<E> left(Position<E> p) throws IllegalArgumentException;
 /** Returns the Position of p's right child (or null if no child exists). */
 Position<E> right(Position<E> p) throws IllegalArgumentException;
 /** Returns the Position of p's sibling (or null if no sibling exists). */
 Position<E> sibling(Position<E> p) throws IllegalArgumentException;
 }
