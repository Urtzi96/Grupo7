package blackjack;

public class Modelo {
	private int totalValor;
	private int A;//cartas del usuario
	private int B;//cartas del crupier
	private int dineroActual;//dinero que tiene el usuario
	private int apuesta;//dinero que apuesta en la partida
	private int ganancias;//ganancias de la partida
	
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
}
