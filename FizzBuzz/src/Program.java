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
		for(int i = 0; i < limite; i++)
		{
			generar(i);
        }
		
	}
	
	public String generar(int numero) {
		if (numero % 3 == 0 && numero % 5 == 0)
		{
			return "FizzBuzz";                    
		}
		else if(numero % 3 == 0)
		{
			return "Fizz";
		}
		else if(numero % 5 == 0)
		{
			return "Buzz";
		}
		else
		{
			return String.valueOf(numero);
		}
	}
		
}


