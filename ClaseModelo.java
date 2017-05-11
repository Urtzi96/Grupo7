
public class ClaseModelo {
	private int dineroActual;//dinero que tiene el usuario
	private int apuesta;//dinero que apuesta en la partida
	private int totalValorUs;
	private int totalValorCr;
	private int carta;//nueva carta
	
	public int Money(int din){
		dineroActual=din;

		return dineroActual;
	}

	public int Apuesta(int apues){
		this.apuesta=apues;

		return apuesta;
	}
	
	public int getMoney(){
		return dineroActual;
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

	public int suma(){
		dineroActual=dineroActual+apuesta;

		return dineroActual;
	}

	public int getUs(){
		return totalValorUs;
	}
	
	public int getCr(){
		return totalValorCr;
	}
	
	public void setUs(int A){
		totalValorUs=A;
	}
	
	public void setCr(int A){
		totalValorCr=A;
	}

	public void cerrar() {
		System.exit(0);
	}
}