class Operadores{
	public static void main(String[] argumentos){
		System.out.println("Has puesto " + argumentos[0]);
		System.out.println( 5 != 5 ? "Pues si" : "Pues no");
		
		if ("aa".equals(argumentos[0])){
			System.out.println("Quieres dos AA");
		} else {
			System.out.println("Quieres otra cosa");
		}
	}
}