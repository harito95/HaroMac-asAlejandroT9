package models;

/**
 * Importamos todas las clases que necesite nuestro programa
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

import exception.ElementNotAllowedException;
import exception.ListSizeOverflownException;

public class ListaOrdenada<L> extends ArrayList<L> {
	/**
	 * 	Creamos el tamaño del ArrayList
	 */
	private final byte MAX_SIZE=100;
	
	/**
	 * Creamos el único constructor que se nos pide el comparator
	 * @param comp
	 */
	public ListaOrdenada(Comparator <L> comp){
		super();
	}
	
	/**
	 * Creamos las excepciones que hemos importado de las clases ya creadas.
	 */
	@Override
	public boolean add(L element) {
		if(element!=null){
		if(this.size()<MAX_SIZE){
			return super.add(element);
		}else{
			throw new ListSizeOverflownException("NO QUEREMOS MÁS");
		}
	}else{
		throw new ElementNotAllowedException("No acepto valores null");
	}
}
	@Override
	public boolean addAll(Collection<? extends L> collection){
	if(collection.size()+this.size() < MAX_SIZE){
		return super.addAll(collection);
	}else{
		throw new ListSizeOverflownException("NO QUEREMOS MÁS");
		}
	}
	
	public void clear(){
		while(this.size()>1){
			super.remove(0);
		}
	}
	
	public L remove(){
		if(this.size()>1){
			return super.remove(0);
		}else{
			throw new ListSizeOverflownException("FUERA");
		}
		
	}
	
	/**
	 * Implementamos el metodo reverse
	 */
	
	public void reverse(){
		  ArrayList<Integer> lista= new ListaOrdenada<Integer>((Integer a, Integer b)->a-b);
		
	}
	
	/**
	 * Implementamos el metodo min.
	 * @param coll
	 * @param comp
	 */
	public void min(Collection<? extends L> coll, Comparator<? super L> comp){
		
		
	}
	
	/**
	 * Implementamos el metodo max.
	 * @param coll
	 * @param comp
	 */
	public void max (Collection<? extends L> coll, Comparator<? super L> comp){
		
	}
	

}
