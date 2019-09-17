class HolaMundo {
	public static void main(String[] args){
		System.out.println("Hola Mundo");
		String nombre = "Sergio";
		
		System.out.println("Hola " + nombre + "!");
		byte unByte = -128; // hasta 127
		System.out.println("Byte: " + unByte);
		int numero = 1234567890;
		System.out.println("Numero: " + numero);
		float decimalFloat = 1.234566789012345f;
		System.out.println("Decimal: " + decimalFloat);
		double decimalDoble = 1.2343456789012345678901;
		System.out.println("Double: " + decimalDoble);
		long entLargo = 1234567890123456789L;
		System.out.println("Long: " + entLargo);
		char caracter = 65;
		System.out.println("Caracter: " + caracter);
		{
			char[] texto = {'a', 'b', 'c'};
			System.out.println("Array: " + texto[1]);
			for (int i = 0; i < texto.length; i = i + 1){
				System.out.println(("Caracter: ") + texto[i]);
				
			}
		}
	}
}