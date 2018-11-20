package exo1;

import java.util.ArrayList;

public class LIFOStack implements Stack {

	
	private ArrayList <Value> lesElements;
	
	
		public LIFOStack() {
		this.lesElements= new  ArrayList<>();
	}
	
	@Override
	public boolean empty() {
	return lesElements.size()==0;
		
	}

	@Override
	public void push(Value v) {
		lesElements.add(v);	
	}

	@Override
	public Value pop() throws EmptyStackException {
		//int indiceDernierElement = this.lesElements.size()-1;
		//Value dernierElement = this.lesElements.remove(indiceDernierElement)
		//return dernierElement;
		
		if(this.empty())
			throw new EmptyStackException("Attention la pile est vide");
		
		return this.lesElements.remove(this.lesElements.size()-1);
	}

	@Override
	public Value peek() throws EmptyStackException {
		
		if(this.empty())
			throw new EmptyStackException("Attention la pile est vide");
		
		return this.lesElements.get(this.lesElements.size()-1);
	}

}
