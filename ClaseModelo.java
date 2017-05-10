public class ClaseModelo {
	private int dineroActual;//dinero que tiene el usuario
	private int apuesta;//dinero que apuesta en la partida
	private int totalValorUs;
	private int totalValorCr;
	private int carta;//nueva carta
	private int as;
	
	public int Money(int din){
		dineroActual=din;

		return dineroActual;
	}

	public int Apuesta(int apues){
		this.apuesta=apues;

		return apuesta;
	}

	public int crearCarta(){
		carta=(int)(Math.random()*10+1);

		return carta;
	}

	public boolean stop(int B){
		if(B>=16){
			return true;
		}else{
			return false;
		}
	}
	
	public int as(int a){
		as=a;
		
		return as;
	}

	public void espera(){
		try{

			Thread.sleep(1000);

		}catch(Exception e){

			System.out.println("Uyyyyyyyyy casi.... : "+e.getMessage());

			return;
		}
	}

	public int totalCartaUs(int A){
		totalValorUs=totalValorUs+A;

		return totalValorUs;
	}
	
	public int totalCartaCr(int A){
		totalValorCr=totalValorCr+A;

		return totalValorCr;
	}

	public int resta(){
		dineroActual=dineroActual-apuesta;

		return dineroActual;
	}

	public boolean ganasPierdes(int A, int B){
		if(A>21){
			return false;
		}else{
			if(B>21){
				return true;
			}else{
				if(A>B){
					return true;
				}else{
					return false;
				}
			}
		}
	}

	public int ganancias(boolean ganasPierdes){
		if(ganasPierdes==true){
			dineroActual=dineroActual+(apuesta*2);
		}

		return dineroActual;
	}
}
