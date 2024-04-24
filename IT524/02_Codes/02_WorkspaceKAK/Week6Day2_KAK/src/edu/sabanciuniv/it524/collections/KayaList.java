package edu.sabanciuniv.it524.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class KayaList<E> implements List<E>{
	
	/*
	 * E is a type parameter. It stands for "element" and specifies the type of the 
	 * elements that the KayaList class can store.
	 * The KayaList class is a generic class, which means that it can work with elements 
	 * of any type. When you create an instance of KayaList, you can specify the type of 
	 * the elements by providing a type argument for the type parameter E. 
	 * 
	 * For example:
	 * KayaList<String> list = new KayaList<>();  // E is String
	 * KayaList<Integer> list = new KayaList<>();  // E is Integer
	 * 
	 * The type parameter E is used throughout the class definition to specify the type of elements that
	 * the class can work with. For example, the List interface that KayaList implements has a type 
	 * parameter E that specifies the type of elements that the list can store. By implementing List<E>,
	 * KayaList is specifying that it is a list that can store elements of type E.
	 * 
	 * The use of type parameters allows the KayaList class to be used with different types of 
	 * elements without having to create separate versions of the class for each type. It also 
	 * helps to ensure type safety by allowing the compiler to check that the elements stored in 
	 * the list are of the correct type.
	 */

	
	@Override
	public int size() {
		return 0;
	}

	@Override
	public boolean isEmpty() {
		return false;
	}

	@Override
	public boolean contains(Object o) {
		return false;
	}

	@Override
	public Iterator<E> iterator() {
		return null;
	}

	@Override
	public Object[] toArray() {
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return null;
	}

	@Override
	public boolean add(E e) {
		return false;
	}

	@Override
	public boolean remove(Object o) {
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends E> c) {
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return false;
	}

	@Override
	public void clear() {
		
	}

	@Override
	public E get(int index) {
		return null;
	}

	@Override
	public E set(int index, E element) {
		return null;
	}

	@Override
	public void add(int index, E element) {
		
	}

	@Override
	public E remove(int index) {
		return null;
	}

	@Override
	public int indexOf(Object o) {
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		return 0;
	}

	@Override
	public ListIterator<E> listIterator() {
		return null;
	}

	@Override
	public ListIterator<E> listIterator(int index) {
		return null;
	}

	@Override
	public List<E> subList(int fromIndex, int toIndex) {
		return null;
	}
	
	
	
	
	
	
	
}