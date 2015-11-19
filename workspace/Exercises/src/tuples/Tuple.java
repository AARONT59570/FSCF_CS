package tuples;

class Tuple<KEY, VALUE> 

{ 
	
	private final KEY k; 
	
	private final VALUE v; 

	public Tuple(KEY key, VALUE value) { 
	
		k = key; 
		
		v = value; 
	
	}

	public String toString() { 
	
		return String.format("KEY: '%s', VALUE: '%s'", k, v); 
	}
}