public class ClaseModelo {
	private int totalValorUs;
	private int totalValorCroup;
	private int A;//cartas del usuario
	private int B;//cartas del crupier
	private int dineroActual;//dinero que tiene el usuario
	private int apuesta;//dinero que apuesta en la partida
	private boolean x = false;
	
	public int Money(int din){
		dineroActual=din;

		return dineroActual;
	}

	public int Apuesta(int apues){
		this.apuesta=apues;

		return apuesta;
	}

	public int crearCarta(){
		A=(int)(Math.random()*10+1);

		return A;
	}

	public int as(int valorAs){
		if(valorAs==1){
			A=1;
		}else{
			A=11;
		}

		return A;
	}

	public boolean stop(){
		if(B>=16){
			return true;
		}else{
			return false;
		}
	}

	public void espera(){
		try{

			Thread.sleep(1000);

		}catch(Exception e){

			System.out.println("Uyyyyyyyyy casi.... : "+e.getMessage());

			return;
		}
	}

	public int totalCartaUser(int A){
		totalValorUs=totalValorUs+A;

		return totalValorUs;
	}

	public int totalCartaCroup(int A){
		totalValorCroup=totalValorCroup+A;

		return totalValorCroup;
	}

	public int resta(){
		dineroActual=dineroActual-apuesta;

		return dineroActual;
	}

	public boolean ganasPierdes(){
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

	public boolean getX() {
		return x;
	}

	public void setX(boolean x) {
		this.x = x;
	}
}