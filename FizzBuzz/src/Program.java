import org.junit.Test;

public class Program {
	public static void main(String[] args)
	{
		FizzBuzz fb = new FizzBuzz();
		fb.generaNumHasta(100);
    }	
}

class FizzBuzz{
	
	public void generaNumHasta(int limite) {
		for(int numero = 0; numero < limite; numero++)
		{
			generar(numero);
        }
		
	}
	
	public String generar(int numero) {
		
		if (esFizzBuzz(numero))
		{
			return "FizzBuzz";                    
		}
		else if(esFizz(numero))
		{
			return "Fizz";
		}
		else if(esBuzz(numero))
		{
			return "Buzz";
		}
		else
		{
			return String.valueOf(numero);
		}
	}
	
	public boolean esFizzBuzz(int numero){
		return (esFizz(numero) && esBuzz(numero));
	}
	
	public boolean esFizz(int numero){
		return (numero % 3 == 0);	
	}
	
	public boolean esBuzz(int numero){
		return (numero % 5 == 0);
	}
		
}


